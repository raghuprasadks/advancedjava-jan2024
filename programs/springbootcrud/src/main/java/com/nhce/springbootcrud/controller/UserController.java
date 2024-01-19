package com.nhce.springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhce.springbootcrud.entity.User;
import com.nhce.springbootcrud.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		userService.save(user);
		return user;
	}
}
