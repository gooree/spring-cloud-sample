package com.digitalsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/consume")
	public String consume() {
		String url = "http://eureka-client/hello";
        String result = restTemplate.getForObject(url, String.class);
        return "ribbon: " + result;
	}
	
}
