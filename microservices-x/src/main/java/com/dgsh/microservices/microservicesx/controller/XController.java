package com.dgsh.microservices.microservicesx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgsh.microservices.microservicesx.bean.X;
import com.dgsh.microservices.microservicesx.configuration.XConfiguration;

@RestController
public class XController {
	
	@Autowired
	private XConfiguration xConfiguration;
	
	@GetMapping("/x")
	public X retrieveAllX() {
		return new X(xConfiguration.getX());
	}
	
}
