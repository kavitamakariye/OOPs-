package com.oops.abstraction;

public class ExtendAbstract extends AbstractClass{

	public ExtendAbstract(String eName, String eAddress, int eID) {
		super(eName, eAddress, eID);
	}

	@Override
	public void jobRole() {
		System.out.println("This is an abstract method");
	}
	

}
