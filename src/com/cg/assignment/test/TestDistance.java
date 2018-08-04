package com.cg.assignment.test;
/*
 * This is a program to add distances in feet and inches
 */
import java.util.Scanner;
import com.cg.assignment.distance.AddDistances;

public class TestDistance {
	public static void main(String[] args) {
		AddDistances distance1 = new AddDistances();
		AddDistances distance2 = new AddDistances();
		AddDistances distance3 = new AddDistances();

		Scanner scanner = new Scanner(System.in);

		//taking two distances in feets and inches from the user
		System.out.println("Enter two distances in feet");
		distance1.setFeet(scanner.nextFloat());
		distance2.setFeet(scanner.nextFloat());

		System.out.println("Enter two distances in inches");
		distance1.setInches(scanner.nextFloat());
		distance2.setInches(scanner.nextFloat());

		//adding the two distances and printing the results
		distance3 = distance1.addDistance(distance1, distance2);
		System.out.println(distance1);
		System.out.println(distance2);
		System.out.println(distance3);
	}

}
