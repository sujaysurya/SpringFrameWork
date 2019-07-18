package com.codegeek.springframework.ioc;

public class BaseBallCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Learn to hit a home-run !! Yaayy!!";
	}

}
