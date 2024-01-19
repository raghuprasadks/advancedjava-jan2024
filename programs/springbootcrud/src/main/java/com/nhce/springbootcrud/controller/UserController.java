package com.nhce.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nhce.springbootcrud.entity.User;
import com.nhce.springbootcrud.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User save(@RequestBody User user) {
		userService.save(user);
		return user;
	}
	@GetMapping("/user")
	public List<User> getUser() {
		return userService.getUser();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable Integer id) {
		User user = userService.findById(id);
		return user;
	}

	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable Integer id) {
		User user = userService.findById(id);
		userService.Delete(id);
		return user;
	}

	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable Integer id, @RequestBody User userDetail) {
           User user = userService.findById(id);
			user.setUserName(userDetail.getUserName());
			user.setMobileNumber(userDetail.getMobileNumber());
			user.setEmail(userDetail.getEmail());
			
			user.setPassword(userDetail.getPassword());
			userService.save(user);
		    return user;
	}
}
