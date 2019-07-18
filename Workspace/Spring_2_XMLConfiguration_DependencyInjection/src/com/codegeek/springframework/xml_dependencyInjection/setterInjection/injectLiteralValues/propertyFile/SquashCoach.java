package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

public class SquashCoach implements Coach {

	private FortuneService fortuneService;

	public SquashCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Learn to smash for squash";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
