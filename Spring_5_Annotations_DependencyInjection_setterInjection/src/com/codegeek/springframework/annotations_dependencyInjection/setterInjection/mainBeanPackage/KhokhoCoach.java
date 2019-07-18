package com.codegeek.springframework.annotations_dependencyInjection.setterInjection.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codegeek.springframework.annotations_dependencyInjection.setterInjection.helperPackage.FortuneService;

@Component("khokhoCoach")
public class KhokhoCoach implements Coach {

	private FortuneService fortuneService;

	public KhokhoCoach() {
		System.out.println("Inside default constructor KhoKho class");
	}

	@Override
	public String getDailyWorkout() {
		return "Agility Practice Khooo Khooo!!";
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
