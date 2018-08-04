package com.cg.assignment.test;
/*
 * This is a program to add time in hours and minutes
 */
import java.util.Scanner;

import com.cg.assignment.time.AddTime;

public class TestTime {
	public static void main(String[] args) {
		AddTime time1 = new AddTime();
		AddTime time2 = new AddTime();
		AddTime time3 = new AddTime();

		Scanner scanner = new Scanner(System.in);

		//taking two time inputs from the user - in hours and minutes
		System.out.println("Enter two time inputs in hours");
		time1.setHour(scanner.nextInt());
		time2.setHour(scanner.nextInt());

		System.out.println("Enter two time inputs in minutes");
		time1.setMinutes(scanner.nextInt());
		time2.setMinutes(scanner.nextInt());

		//adding the times and displaying the result
		time3 = time1.addTime(time1, time2);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
	}
}
