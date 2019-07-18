package com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.helperPackage.FortuneService;

@Component
public class EquestrianCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public EquestrianCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Friend a horse today !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
