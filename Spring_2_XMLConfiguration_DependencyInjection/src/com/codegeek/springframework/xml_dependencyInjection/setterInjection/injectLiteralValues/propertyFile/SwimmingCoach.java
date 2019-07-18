package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

import com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.Coach;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;

	public SwimmingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Learn to swim free-style today !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
