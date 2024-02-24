package com.psl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.model.Lft_Report;
import com.psl.model.Role;
import com.psl.model.User;
import com.psl.service.UserService;

@RestController
@RequestMapping("/semicolon")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/User/signUp")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
	@GetMapping("/getRoles")
	public List<Role> getRoles() {
		return userService.getListOfRoles();
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
@PostMapping("/addReport")
public Lft_Report addReport(@RequestBody Lft_Report report)
{
	return userService.addReport(report);
}
	
}
