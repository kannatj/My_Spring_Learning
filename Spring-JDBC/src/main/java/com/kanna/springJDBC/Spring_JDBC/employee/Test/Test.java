package com.kanna.springJDBC.Spring_JDBC.employee.Test;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kanna.springJDBC.Spring_JDBC.employee.dao.EmployeeDao;
import com.kanna.springJDBC.Spring_JDBC.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/kanna/springJDBC/Spring_JDBC/employee/Test/config.xml");
		EmployeeDao Conn = (EmployeeDao) context.getBean("employeeDao");
		  
		 
		 // Employee employee = new Employee();
		  
		  /*employee.setId(102);
		  employee.setFirstname("Naveen");
		  employee.setLastname("Vel"); 
		  
		  int result = Conn.create(employee);
		  System.out.println("No of records inserted are "+result); */
		  
		  List<Employee> employee = Conn.read();
		  
		  for(Employee e : employee) {
			  System.out.println("Emp ID :"+e.getId()+" Name :"+ e.getFirstname()+" "+e.getLastname());
		  }
		  
		  context.close();

	}

}
