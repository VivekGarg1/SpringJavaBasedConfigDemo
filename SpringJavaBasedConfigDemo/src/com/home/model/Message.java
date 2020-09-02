package com.home.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

//public class Message implements InitializingBean,DisposableBean{
	public class Message{

	@Value(value = "1")
	private int messageId;
	
	@Value(value = "Hello Spring!!!")
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", message=" + message + "]";
	}
	
	/*@Override
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy!!!");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is going through inIt!!!");
	}*/
	
	//Without implementing interface using JSR250 annotations
	/*@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy!!!");
	}
	
	@PostConstruct
	public void inIt() throws Exception {
		System.out.println("Bean is going through inIt!!!");
	}*/
	
	//Using Config 
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy!!!");
	}
	
	public void inIt() throws Exception {
		System.out.println("Bean is going through inIt!!!");
	}
}
