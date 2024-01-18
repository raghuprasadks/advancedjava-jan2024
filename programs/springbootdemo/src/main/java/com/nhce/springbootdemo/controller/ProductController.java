package com.nhce.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhce.springbootdemo.model.Product;

@RestController
public class ProductController {
	
	List<Product> productList = new ArrayList<Product>();
	
	@GetMapping("/")
	public String greetings() {
		return  "Welcome to Spring Boot";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		this.productList.add(product);
		return "Product Added Successfully";		
	}
	
	@GetMapping("/listProduct")
	public List<Product> listProduct() {		
		return this.productList;		
	}

}
