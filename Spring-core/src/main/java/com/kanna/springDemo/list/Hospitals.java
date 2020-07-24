package com.kanna.springDemo.list;

import java.util.List;


public class Hospitals {
	
	
	private String name;
	private List<String> departments;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	
	@Override
	public String toString() {
		return "Hospitals [name=" + name + ", departments=" + departments + "]";
	}
	
	
	
	
	

}
