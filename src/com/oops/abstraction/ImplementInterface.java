package com.oops.abstraction;

public class ImplementInterface implements Math_Teacher{

	@Override
	public void department() {
		System.out.println("Teaching");		
	}

	@Override
	public void jobRole() {
		System.out.println("Math Teacher");
	}

	@Override
	public void subject() {
		System.out.println("Maths");
	}

	@Override
	public void division() {
		System.out.println("Algebra");
	}

}
