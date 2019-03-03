package com.oops.Inheritance;

public class EmployeeMethod extends PersonMethod{
	
    String name = "Sameer";
	
	public void display() {
		
		System.out.println("Super class name: "+ super.name);
		System.out.println("Sub class name: "+ name);
	}
	
	public void finalDisplay() {
		super.display();
	}
}
