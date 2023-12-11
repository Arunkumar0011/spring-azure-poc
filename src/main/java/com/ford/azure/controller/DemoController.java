package com.ford.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Hi Welcome, Spring Boot App Azure Deployment POC";
	}
}
