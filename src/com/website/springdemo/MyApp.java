package com.website.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// crear objeto
		//Coach theCoach = new BaseballCoach(); 
		Coach theCoach = new TrackCoach(); 
		//usar objeto
		System.out.println(theCoach.getDailyWorkout()); 

	}

}
