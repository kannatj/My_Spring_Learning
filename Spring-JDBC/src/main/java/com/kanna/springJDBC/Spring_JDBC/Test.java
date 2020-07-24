package com.kanna.springJDBC.Spring_JDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/kanna/springJDBC/Spring_JDBC/config.xml");
		  JdbcTemplate Conn = (JdbcTemplate) context.getBean("jdbcTemplate");
		  
		  String str ="update employee set lastname=(?) where id=100";
		  int result = Conn.update(str,"jayakumar");
		  System.out.println("No of records inserted are "+result);
		  context.close();

	}

}
