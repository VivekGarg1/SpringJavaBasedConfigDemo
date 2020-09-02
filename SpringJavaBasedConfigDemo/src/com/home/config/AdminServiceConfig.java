package com.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.home.service.AdminService;

@Configuration
@Import(value = { EmployeeServiceConfig.class })
public class AdminServiceConfig {
	
	@Bean
	public AdminService adminService() {
		return new AdminService();
	}

}
