package com.oops.InheritanceDriver;

import java.util.Scanner;

import com.oops.Inheritance.My_Calculation;

public class CalDriver {

	public static void main(String[] args) {
		System.out.println("Enter the numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		My_Calculation demo = new My_Calculation();
		demo.sum(a, b);
		demo.difference(a, b);
		demo.multiplication(a, b);
		
	}
}
