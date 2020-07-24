package com.kanna.springDemo.RefTypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String as[]) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/kanna/springDemo/RefTypes/config.xml");
		
		Students stu = (Students) context.getBean("Students");
		
		System.out.println(stu);
		
		context.close();
	}

}
