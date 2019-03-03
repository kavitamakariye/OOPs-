package com.oops.Inheritance;

public class PersonCons {

	/*If a class is inheriting the properties of another class, the subclass automatically acquires the default 
	 * constructor of superclass.
     * But if you want to call a parameterized constructor from superclass, you need to use super keyword as shown below:
     * super(values):*/
	String name;
	
	 PersonCons() {
	
		System.out.println("This is Super Class Constructor");
	}
	 PersonCons(String name){
		 this.name = name;
	 }
	
}
