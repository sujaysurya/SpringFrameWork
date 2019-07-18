package com.codegeek.springframework.annotations_dependencyInjection.fieldInjection.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.annotations_dependencyInjection.fieldInjection.helperPackage.FortuneService;


@Component("tapDanceCoach")
public class TapDanceCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	public TapDanceCoach() {
		System.out.println("Inside tapdance coach default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Learn to tap-dance !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
