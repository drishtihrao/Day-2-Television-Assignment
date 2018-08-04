package com.cg.assignment.rectangle;
/*
 * This is a program to calculate area and perimeter of a rectangle
 */
public class Rectangle {
	private int length;
	private int breath;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	//creating a method to calculate the area of the rectangle
	public int area() {
		int area = (getLength()) * (getBreath());
		return (area);
	}

	//creating a method to calculate the perimeter of the rectangle
	int perimeter() {
		int perimeter = 2 * (getLength()) + (getBreath());
		return (perimeter);
	}

	@Override
	public String toString() {
		return "Area of rectangle = " + area() + ", its perimeter = " + perimeter() + ".";
	}

}
