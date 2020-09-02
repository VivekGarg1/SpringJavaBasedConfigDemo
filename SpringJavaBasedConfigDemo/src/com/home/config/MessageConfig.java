package com.home.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.home.model.Message;

@Configurable
public class MessageConfig {
	
	@Bean(name="message",initMethod = "inIt",destroyMethod = "destroy")
	@Scope(scopeName = "prototype")
	public Message getMessage() {
		return new Message();
	}
	
	//Using alias name
	/*@Bean(name= {"message","message1","message2"})
	public Message getMessage() {
		return new Message();
	}*/

}
