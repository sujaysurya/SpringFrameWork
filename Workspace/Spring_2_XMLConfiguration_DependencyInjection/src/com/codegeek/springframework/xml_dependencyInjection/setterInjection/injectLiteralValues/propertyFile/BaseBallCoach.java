package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

public class BaseBallCoach implements Coach {

	// define a private field
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Learn to hit a home-run !! Yaayy!!";
	}

	@Override
	public String getDailyFortune() {
		return "From the BaseBall Coach "+fortuneService.getDailyFortune();
	}

}
