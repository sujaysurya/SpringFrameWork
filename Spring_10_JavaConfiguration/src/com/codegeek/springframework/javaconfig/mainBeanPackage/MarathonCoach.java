package com.codegeek.springframework.javaconfig.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.javaconfig.helperPackage.FortuneService;

@Component
public class MarathonCoach implements Coach {

	@Autowired
	@Qualifier("dailyFortuneService")
	private FortuneService fortuneService;

	public MarathonCoach() {
		System.out.println("Inside the marathon Coach class");
	}

	@Override
	public String getDailyWorkout() {
		return " Enhance your stamina , eat more proteins !!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
