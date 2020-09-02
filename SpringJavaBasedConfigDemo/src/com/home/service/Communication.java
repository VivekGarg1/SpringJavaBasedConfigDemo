package com.home.service;

import com.home.model.Messaging;

public class Communication {
	
	private Messaging message;

	public Communication(Messaging message) {
		super();
		this.message = message;
	}
	
	public void communicate() {
		message.sendMessage();
	}

}
