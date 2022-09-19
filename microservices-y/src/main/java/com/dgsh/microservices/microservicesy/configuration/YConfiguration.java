package com.dgsh.microservices.microservicesy.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microservices-y")
public class YConfiguration {
	private int y;

	public YConfiguration() {
		super();
	}

	public YConfiguration(int y) {
		super();
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
