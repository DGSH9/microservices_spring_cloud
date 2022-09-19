package com.dgsh.microservices.microservicesy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgsh.microservices.microservicesy.bean.Y;
import com.dgsh.microservices.microservicesy.configuration.YConfiguration;

@RestController
public class YController {

	@Autowired
	private YConfiguration yConfiguration;
	
	@GetMapping("/y")
	public Y retrievAllY() {
		return new Y(yConfiguration.getY());
	}
}
