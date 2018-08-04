package com.cg.assignment.complexnumber;
/*
 * This is a program to add two complex numbers
 */
public class AddComplexNum {
	private int real;
	private int imaginary;

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	//creating a method to add both the real parts and both the imaginary parts
	public AddComplexNum addComplex(AddComplexNum complex1, AddComplexNum complex2) {
		AddComplexNum complex3 = new AddComplexNum();
		complex3.real = complex1.getReal() + complex2.getReal();
		complex3.imaginary = complex1.getImaginary() + complex2.getImaginary();
		return complex3;
	}

	@Override
	public String toString() {
		return "Complex value is real is " + real + " and imaginary is " + imaginary + ". (" + real + "+i" + imaginary
				+ ")";
	}

}
