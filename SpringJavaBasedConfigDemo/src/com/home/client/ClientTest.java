package com.home.client;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.home.config.MessageConfig;
import com.home.model.Message;

public class ClientTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=null;
		try {
			context=new AnnotationConfigApplicationContext(MessageConfig.class);
			//Message message = context.getBean("getMessage",Message.class);
			Message message = context.getBean("message",Message.class);
			System.out.println(message);
			System.out.println("Getting aliases------------------------------");
			String[] aliases = context.getAliases("message");
			for (String alias : aliases) {
				System.out.println(alias);
			}
			System.out.println("Getting type------------------------------");
			Class<?> type = context.getType("message");
			System.out.println(type);
			System.out.println("Checking singleton or not------------------------------");
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
