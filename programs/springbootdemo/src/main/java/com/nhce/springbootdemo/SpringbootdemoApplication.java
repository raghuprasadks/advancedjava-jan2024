package com.nhce.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		System.out.println("Spring boot demo");
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
