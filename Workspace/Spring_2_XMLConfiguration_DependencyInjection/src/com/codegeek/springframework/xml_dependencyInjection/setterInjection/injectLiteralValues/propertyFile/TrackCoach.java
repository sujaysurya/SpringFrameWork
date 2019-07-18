package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

public class TrackCoach implements Coach {

	// define a private field
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k!!";
	}

	@Override
	public String getDailyFortune() {
		return "From the Track Coach "+fortuneService.getDailyFortune();
	}
	
	// create a init-method
	public void doMyStartUpStuff() {
		System.out.println("Performing some start up activities");
	}
	
	
	// create a destroy-method
	public void doMyCleanUpStuff() {
		System.out.println("Performing some clean-up activities");
	}
	

}
