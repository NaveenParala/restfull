package com.app.naveen.serviceProvider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class AdminServiceProvider {
	
	@GetMapping("/service")
	public String hello() {
		return "Welcome to Service Provider App";
	}

}
