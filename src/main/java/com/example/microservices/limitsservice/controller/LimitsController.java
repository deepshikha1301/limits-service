package com.example.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limitsservice.bean.Limits;
import com.example.microservices.limitsservice.config.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration configuration;

	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMin(),configuration.getMax());
	}
}
