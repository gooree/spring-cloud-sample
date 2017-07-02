package com.digitalsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulClientController {

	@GetMapping("/hello")
	public String hello() {
		return "hello consul!";
	}
	
}
