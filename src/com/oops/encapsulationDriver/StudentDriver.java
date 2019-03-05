package com.oops.encapsulationDriver;

import com.oops.encapsulation.Student;

public class StudentDriver {

public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Monica");
		System.out.println(s.getName());
		//System.out.println(s.rollno=1); //does not allow to assign value to eID as it is private and does not have public getter and setter
		//s.setDivision(); //does not allow to access the getter and setter of department, as private methods are not accessible outside the class
	}
}
