package com.kanna.springJDBC.Spring_JDBC.employee.dto;

public class Employee {
	
	private int Id;
	private String firstname;
	private String lastname;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
