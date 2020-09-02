package com.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.home.service.EmployeeServiceData;

@Configuration
public class EmployeeServiceConfig {

	@Bean
	public EmployeeServiceData employeeServiceData() {
		return new EmployeeServiceData();
	}
}
