package com.kanna.springDemo.Interface_LC;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
	
	private String name;
	private int ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public void  hi() {
		System.out.println("Hi method");
	}
	
	public void thankYou() {
		System.out.println("Thank You...!");
	}
	
	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", ID=" + ID + "]";
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Destroy()");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init()");
	}
	
	
	
	

}
