package com.codegeek.springframework.annotations_dependencyInjection.methodInjection.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.annotations_dependencyInjection.methodInjection.helperPackage.FortuneService;


@Component("pingpongCoach")
public class PingPongCoach implements Coach {

	private FortuneService fortuneService;

	public PingPongCoach() {
		System.out.println("Inside pingpong coach default constructor");
	}
	
	@Autowired
	public void pingypongy(FortuneService fortuneService) {
		System.out.println("inside pingypongy method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Learn to top spin the pingpong ball !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
