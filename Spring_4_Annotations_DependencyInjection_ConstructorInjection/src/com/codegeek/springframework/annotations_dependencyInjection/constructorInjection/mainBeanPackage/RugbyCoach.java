package com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.helperPackage.FortuneService;

@Component("rugbyCoach")
public class RugbyCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public RugbyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Know to dodge a player !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
