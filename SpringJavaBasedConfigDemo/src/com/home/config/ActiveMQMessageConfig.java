package com.home.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.home.model.ActiveMQMessage;
import com.home.model.Message;
import com.home.model.Messaging;
import com.home.service.Communication;

@Configurable
public class ActiveMQMessageConfig {
	
	@Bean
	public Communication communication() {
		return new Communication(message());
		}
	
	@Bean
	public Messaging message() {
		return new ActiveMQMessage();
	}

}
