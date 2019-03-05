package com.oops.abstraction;

public abstract class AbstractClass {

	String eName;
	String eAddress;
	int eID;
	
	 AbstractClass(String eName,String eAddress,int eID) {
		 this.eName = eName;
		 this.eAddress = eAddress;
		 this.eID = eID;
	 }
	 public void department() {
		 System.out.println("This employee works for L&D department.");
	 }
	 //abstract method ends with semicolon
	 public abstract void jobRole();
	 //abstract method cannot be instantiated
}
