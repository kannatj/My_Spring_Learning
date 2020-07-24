package com.kanna.springDemo.LifeCycle;

public class Patient {
	
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
	
	
	
	

}
