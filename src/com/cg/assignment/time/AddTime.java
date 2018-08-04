package com.cg.assignment.time;
/*
 * This is a program to add time in hours and minutes
 */
public class AddTime {
	private int hour;
	private int minutes;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}
	
	//if the minute addition becomes more than 60, the hour value is incremented by 1
	public void setMinutes(int minutes) {
		if (minutes < 60)
			this.minutes = minutes;
		else if (minutes == 60)
			this.hour += 1;
		else
			System.out.println("Invalid input");
	}

	//creating a method to add the two time inputs
	public AddTime addTime(AddTime time1, AddTime time2) {
		AddTime time3 = new AddTime();
		time3.minutes = time1.getMinutes() + time2.getMinutes();
		time3.hour = time1.getHour() + time2.getHour();

		if (time3.minutes >= 60) {
			time3.hour += 1;
			time3.minutes -= 60;
		}
		return time3;
	}

	@Override
	public String toString() {
		return "Time in hour is " + hour + ", in minutes is " + minutes + ".";
	}

}
