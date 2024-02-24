package com.psl.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.psl.model.Lft_Report;
import com.psl.model.Role;
import com.psl.model.User;

public interface UserService {

	public ResponseEntity<Object> addUser(User user);

	public List<Role> getListOfRoles();

	public List<User> getUsers();

	User getUserById(Long id);
	
	public List<User> getUserByRole(Role role);
	
	public Lft_Report addReport(Lft_Report report);

}
