package com.home.client;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.home.config.MessageConfig;
import com.home.model.Message;

public class CallBackMethodsClientTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=null;
		try {
			context=new AnnotationConfigApplicationContext(MessageConfig.class);
			Message message = context.getBean("message",Message.class);
			System.out.println(message);
			boolean singleton = context.isSingleton("message");
			System.out.println(singleton);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(context !=null)
				context.close();
		}
	}
}
