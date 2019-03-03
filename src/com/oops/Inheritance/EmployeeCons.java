package com.oops.Inheritance;

public class EmployeeCons extends PersonCons{

	int eID;
	
	public EmployeeCons() {
		super();
		}
	
	public EmployeeCons(String name, int eID){
		super(name);
		this.eID = eID;
	}
	
	public void display() {
		
		System.out.println("Ename = "+name + " EID = "+eID);
	}
}
