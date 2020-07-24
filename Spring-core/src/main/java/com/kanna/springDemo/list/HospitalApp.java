package com.kanna.springDemo.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalApp {
	
	public static void main(String as[]){
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/kanna/springDemo/list/config.xml");
		
		Hospitals hospital = (Hospitals) context.getBean("Hospital");
		
		System.out.println(hospital);
		
		
		System.out.println(hospital.getDepartments().getClass());
		
		context.close();
		
	}
}
