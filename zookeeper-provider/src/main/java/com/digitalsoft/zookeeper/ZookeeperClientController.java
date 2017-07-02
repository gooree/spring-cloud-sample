package com.digitalsoft.zookeeper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZookeeperClientController {

	@RequestMapping("hello")
	public String hello() {
		return "hello zookeeper!";
	}
	
}
