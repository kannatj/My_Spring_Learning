package com.kanna.springDemo.Spring_core_ConstructorInjection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEmployeeApp {
	public static void main(String as[]) {
		
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("com/kanna/springDemo/Spring_core_ConstructorInjection/config.xml");
		
		Employee e = (Employee) context.getBean("employee");
		
		System.out.println(e);
		
		context.close();
		

		
	}

}
