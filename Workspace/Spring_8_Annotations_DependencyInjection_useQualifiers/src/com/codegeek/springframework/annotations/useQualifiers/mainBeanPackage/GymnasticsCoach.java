package com.codegeek.springframework.annotations.useQualifiers.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.annotations.useQualifiers.helperPackage.FortuneService;

@Component("gymnasticsCoach")
public class GymnasticsCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public GymnasticsCoach() {
		System.out.println("Inside tapdance coach default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "perform back flips and somersaults like a gazalle !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
