package com.home.client;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.home.config.ActiveMQMessageConfig;
import com.home.config.MessageConfig;
import com.home.model.Message;
import com.home.service.Communication;

public class ConstructorDIClientTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=null;
		try {
			context=new AnnotationConfigApplicationContext(ActiveMQMessageConfig.class);
			Communication communication = context.getBean("communication",Communication.class);
			communication.communicate();
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
