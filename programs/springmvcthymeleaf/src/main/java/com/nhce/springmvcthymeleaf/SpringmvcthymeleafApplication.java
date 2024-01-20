package com.nhce.springmvcthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class SpringmvcthymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcthymeleafApplication.class, args);
	}

}
