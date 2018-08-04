package com.cg.assignment.distance;
/*
 * This is a program to add distances in feet and inches
 */
public class AddDistances {
	private float feet;
	private float inches;
	
	public float getFeet() {
		return feet;
	}
	public void setFeet(float feet) {
		this.feet = feet;
	}
	public float getInches() {
		return inches;
	}
	
	//if inches value goes beyond 12, then feet count is incremented by 1
	public void setInches(float inches) {
		if(inches<12.0)
		this.inches = inches;
		else if(inches == 12)
			this.feet+=1;
		else
			System.out.println("Invalid input");
	}
	
	//creating a method to add both the distances
	public AddDistances addDistance(AddDistances distance1, AddDistances distance2) {
		AddDistances distance3 = new AddDistances();
		distance3.inches = distance1.getInches() + distance2.getInches();
		distance3.feet = distance1.getFeet() + distance2.getFeet();
		if(distance3.inches >= 12.0)
		{
			distance3.feet+=1;
			distance3.inches-=12.0;
		}
		return distance3;
	}
	@Override
	public String toString() {
		return "Distance in feet is " + feet + ", in inches is " + inches + ".";
	}
}
