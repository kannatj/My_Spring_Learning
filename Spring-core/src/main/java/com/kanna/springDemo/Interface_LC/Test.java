package com.kanna.springDemo.Interface_LC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String as[]) {
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/kanna/springDemo/Interface_LC/config.xml");
	   
	   Patient patient = (Patient) context.getBean("Patient");
	   
	   System.out.println(patient);
	   
	   context.registerShutdownHook();
	   
	   context.close();
	   
   }
}
