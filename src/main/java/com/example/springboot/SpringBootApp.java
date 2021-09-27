package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApp {
	
	@GetMapping("/")
	public String home()
	{
		return "Spring Boot Application Successfully deployed in EC2 instance ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}

}