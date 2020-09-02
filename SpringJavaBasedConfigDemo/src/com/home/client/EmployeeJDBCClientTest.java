package com.home.client;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.config.EmployeeJDBCAppConfig;
import com.home.model.Employee;
import com.home.service.EmployeeService;
import com.home.service.impl.EmployeeServiceImpl;

public class EmployeeJDBCClientTest {

	public static void main(String[] args) throws SQLException {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EmployeeJDBCAppConfig.class);
		EmployeeService service = context.getBean("employeeService", EmployeeServiceImpl.class);
		createEmployee(service);
		//getEmployeeById(service);
		//getAllEmployees(service);
		//updateEmployee(service);
		//deleteEmployee(service);
        ((AbstractApplicationContext) context).close();
	}

	private static void deleteEmployee(EmployeeService service) {
		service.deleteEmployeeById(4);
		
	}

	private static void updateEmployee(EmployeeService service) {
		service.updateEmployeeById(4, "raja123@gmail.com");
		
	}

	private static void getAllEmployees(EmployeeService service) {
		List<Employee> employees = service.getAllEmployeesInfo();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}

	private static void getEmployeeById(EmployeeService service) {
		Employee employee = service.fetchEmployeeById(2);
		System.out.println(employee);
		
	}

	private static void createEmployee(EmployeeService service) throws SQLException {
		Employee employee=new Employee();
		employee.setEmail("ravi@gmail.com");
		employee.setEmployeeName("Ravi");
		employee.setSalary(15000.00);
		employee.setGender("Male");
		service.addEmployee(employee);
	}

}
