package com.nhce.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/")
	public String greetings() {
		return  "Welcome to Spring Boot";
	}

}
