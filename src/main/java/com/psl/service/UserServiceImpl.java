package com.psl.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.psl.dao.ReportRepository;
import com.psl.dao.UserRepository;
import com.psl.model.Lft_Report;
import com.psl.model.Role;
import com.psl.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ReportRepository reportRepository;

	@Override
	public ResponseEntity<Object> addUser(User user) {
		// checking if user already exists
		Optional<User> user1 = userRepository.findByEmail(user.getEmail());
		HashMap<String, String> map = new HashMap<>();
		if (user1.isPresent()) {

			map.put("message", "Email already registered");
			return ResponseEntity.status(409).body(map);
		}
		userRepository.save(user);
		map.put("message", "User Registered Successfully");
		return ResponseEntity.status(201).body(map);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<Role> getListOfRoles() {
		return Arrays.asList(Role.values());
	}
	
	@Override
	public User getUserById(Long id) {
		return userRepository.getById(id);
	}

	@Override
	public List<User> getUserByRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lft_Report addReport(Lft_Report report) {
		
		return reportRepository.save(report);
	}
}
