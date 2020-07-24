package com.kanna.springDemo.Spring_core_ConstructorInjection;

public class Employee {
	
	private int ID;
	private Address address;
	
	
    Employee(){
		
	}	
	
	Employee(int ID,Address address){
		this.ID = ID;
		this.address = address;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", address=" + address + "]";
	}
	
}
