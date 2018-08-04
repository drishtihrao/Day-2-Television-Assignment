package com.cg.assignment.test;
/*
 * This is a program to add two complex numbers
 */
import java.util.Scanner;

import com.cg.assignment.complexnumber.AddComplexNum;

public class TestComplex {
	public static void main(String[] args) {
		AddComplexNum complex1 = new AddComplexNum();
		AddComplexNum complex2 = new AddComplexNum();
		AddComplexNum complex3 = new AddComplexNum();

		Scanner scanner = new Scanner(System.in);

		//taking two complex numbers as input from the user
		System.out.println("Enter two real numbers ");
		complex1.setReal(scanner.nextInt());
		complex2.setReal(scanner.nextInt());

		System.out.println("Enter two imaginary numbers");
		complex1.setImaginary(scanner.nextInt());
		complex2.setImaginary(scanner.nextInt());

		//adding the two numbers
		complex3 = complex1.addComplex(complex1, complex2);

		//displaying the sum
		System.out.println(complex1);
		System.out.println(complex2);
		System.out.println(complex3);
	}

}
