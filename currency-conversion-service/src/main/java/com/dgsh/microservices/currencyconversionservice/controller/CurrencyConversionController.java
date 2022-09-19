package com.dgsh.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dgsh.microservices.currencyconversionservice.bean.CurrencyConversion;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateTotalExchamgeAmount(
			@PathVariable("from")String from,
			@PathVariable("to")String to,
			@PathVariable("quantity") int quantity
			) {
		return new CurrencyConversion(10001L,from,to,quantity,BigDecimal.ONE,BigDecimal.ONE,"8100");
	}
	
	
}
