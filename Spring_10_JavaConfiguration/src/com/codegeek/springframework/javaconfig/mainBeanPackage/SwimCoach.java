package com.codegeek.springframework.javaconfig.mainBeanPackage;

import org.springframework.beans.factory.annotation.Value;

import com.codegeek.springframework.javaconfig.helperPackage.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.team}")
	private String team;

	@Value("${foo.email}")
	private String email;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 3 km as a warmup !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}

}
