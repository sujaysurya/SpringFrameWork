package com.codegeek.springframework.xml_dependencyInjection.setterInjection;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: Inside the no-arg constructor");
	}

	// setter method called by spring when we actually inject the dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: Inside the setter method of cricket coach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Batting Practice: Practice the Cover Drive today!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
