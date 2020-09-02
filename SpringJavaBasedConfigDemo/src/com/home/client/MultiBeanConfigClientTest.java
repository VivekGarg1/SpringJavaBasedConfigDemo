package com.home.client;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.home.config.AdminServiceConfig;
import com.home.config.MessageConfig;
import com.home.model.Message;
import com.home.service.AdminService;
import com.home.service.EmployeeServiceData;

public class MultiBeanConfigClientTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=null;
		try {
			context=new AnnotationConfigApplicationContext(AdminServiceConfig.class);
			EmployeeServiceData employeeServiceData = context.getBean("employeeService",EmployeeServiceData.class);
			employeeServiceData.addEmployee(); 
			AdminService adminService = context.getBean("adminService",AdminService.class);
			adminService.addAdmin();
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
