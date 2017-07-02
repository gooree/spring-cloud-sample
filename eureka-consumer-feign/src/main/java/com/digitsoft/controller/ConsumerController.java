package com.digitsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitsoft.client.EurekaFeignClient;

@RestController
public class ConsumerController {
	
	@Autowired
	private EurekaFeignClient eurekaFeignClient;
	
	@GetMapping("/consume")
	public String consume() {
		return "feign: " + eurekaFeignClient.hello();
	}
	
}
