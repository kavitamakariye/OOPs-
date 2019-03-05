package com.oops.abstraction;

public class Employees implements Person{

	@Override
	public void department() {
		System.out.println("Department: L&D");
	}

	@Override
	public void jobRole() {
		System.out.println("JobRole: Corporate Trainer");
	}
	
}
