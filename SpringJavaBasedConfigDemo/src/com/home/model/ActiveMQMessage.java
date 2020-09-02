package com.home.model;

public class ActiveMQMessage implements Messaging{

	@Override
	public void sendMessage() {
		System.out.println("Message send by ActiveMQ!!!");
	}

}
