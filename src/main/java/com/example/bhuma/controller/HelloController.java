package com.example.bhuma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String check() {
		return "welcome to Spring Boot and start implementing the busines logic";
	}

	@GetMapping("/helloworld")
	public String checking() {
		return "welcome to Spring Boot Application and try to build in jenkins";
	}
}
