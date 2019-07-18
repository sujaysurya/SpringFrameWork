package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

public class VolleyBallCoach implements Coach {

	private FortuneService fortuneService;

	public VolleyBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Learn to receive a smash";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
