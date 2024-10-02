package com.example.bhuma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HelloController {
	
	@GetMapping("/helloworld")
	public String hello() {
		return "welcome to Spring Boot";
	}
	

}
