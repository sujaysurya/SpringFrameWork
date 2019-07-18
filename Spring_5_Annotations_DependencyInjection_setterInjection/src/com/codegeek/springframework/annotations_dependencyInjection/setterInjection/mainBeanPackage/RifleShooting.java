package com.codegeek.springframework.annotations_dependencyInjection.setterInjection.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.annotations_dependencyInjection.setterInjection.helperPackage.FortuneService;

@Component
public class RifleShooting implements Coach {

	private FortuneService fortuneService;

	public RifleShooting() {
		System.out.println("Inside default constructor Rifle Coach class");
	}

	@Override
	public String getDailyWorkout() {
		return "shoot at a distance of 100m today !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
