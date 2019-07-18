package com.codegeek.springframework.ioc;

public class WorkoutApp {

	public static void main(String[] args) {
		Coach bbc = new BaseBallCoach();
		Coach tc = new TrackCoach();
		System.out.println("The baseball coach says "+bbc.getDailyWorkout());
		System.out.println("The track coach says "+tc.getDailyWorkout());
	}

}
