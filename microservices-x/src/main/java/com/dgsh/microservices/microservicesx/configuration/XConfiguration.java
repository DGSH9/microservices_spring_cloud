package com.dgsh.microservices.microservicesx.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microservices-x")
public class XConfiguration {
	private int x;

	public XConfiguration() {
		super();
	}

	public XConfiguration(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
