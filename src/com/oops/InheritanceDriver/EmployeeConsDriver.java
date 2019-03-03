package com.oops.InheritanceDriver;

import com.oops.Inheritance.EmployeeCons;

public class EmployeeConsDriver {

	public static void main(String[] args) {
		
		EmployeeCons e1 = new EmployeeCons();
		EmployeeCons e = new EmployeeCons("Monica",10);
		e.display();
		e1.display();
	}
}
