package com.codegeek.springframework.annotations_dependencyInjection.methodInjection.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.annotations_dependencyInjection.methodInjection.helperPackage.FortuneService;


@Component("soccerCoach")
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	public SoccerCoach() {
		System.out.println("Inside soccer coach default constructor");
	}

	@Autowired
	public void shoshopenalty(FortuneService fortuneService) {
		System.out.println("Inside shoshoPenalty method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Penalty shoot practice !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
