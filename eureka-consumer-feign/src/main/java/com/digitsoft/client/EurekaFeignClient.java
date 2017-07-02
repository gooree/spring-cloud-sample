package com.digitsoft.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface EurekaFeignClient {

	@GetMapping("/hello")
	String hello();
	
}
