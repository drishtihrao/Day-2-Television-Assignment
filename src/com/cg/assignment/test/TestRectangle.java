package com.cg.assignment.test;
/*
 * This is a program to calculate area and perimeter of a rectangle
 */
import java.util.Scanner;

import com.cg.assignment.rectangle.Rectangle;

public class TestRectangle {
	public static void main(String args[]) {
		   Rectangle rectangle1 = new Rectangle();
		   Rectangle rectangle2 = new Rectangle();
		   Scanner scanner = new Scanner(System.in);
		   
		  //taking length and breadth of the rectangles from the user
		   System.out.println("Enter lengths of rectangles");
		   rectangle1.setLength(scanner.nextInt());
		   rectangle2.setLength(scanner.nextInt());
		   
		   System.out.println("Enter breaths of rectangles");
		   rectangle1.setBreath(scanner.nextInt());
		   rectangle2.setBreath(scanner.nextInt());
		   
		   //calculating the area and checking of they are equal or not
		   System.out.println(rectangle1);
		   System.out.println(rectangle2);
		   
		   if((rectangle1.getLength() != rectangle2.getLength()) && (rectangle1.getBreath() != rectangle2.getBreath())) {
			   if (rectangle1.area()==rectangle2.area())
				   System.out.println("The area of both rectangles is same");
		   }
	   }
}
