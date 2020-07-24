package com.kanna.springDemo.Annotations_LC;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient{
	
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
	
	@PostConstruct
	public void  hi() {
		System.out.println("Hi method");
	}
	
	@PreDestroy
	public void thankYou() {
		System.out.println("Thank You...!");
	}
	
	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", ID=" + ID + "]";
	}
	
	

}
