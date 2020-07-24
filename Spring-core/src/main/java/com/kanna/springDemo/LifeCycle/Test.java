package com.kanna.springDemo.LifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String as[]) {
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/kanna/springDemo/LifeCycle/config.xml");
	   
	   Patient patient = (Patient) context.getBean("Patient");
	   
	   System.out.println(patient);
	   
	   context.registerShutdownHook();
	   
	   context.close();
	   
   }
}
