package com.digitalsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello eureka!";
	}
	
}
