package com.nhce.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@DeleteMapping("/deleteProduct/{code}")
	public String deleteProduct(@PathVariable int code) {
		String msg="product not found";
		Product prodtodelete=null;
		boolean isFound = false;
		for(Product prod : this.productList) {
			if (prod.getCode() ==code) {
				prodtodelete=prod;
				isFound=true;			
				break;
			}
		}
		if(isFound) {
			this.productList.remove(prodtodelete);
			msg="product with code "+code +" deleted successfully ";
		}
		return msg;		
	 
			
	}
}
