package com.codegeek.springframework.javaconfig.helperPackage;

import org.springframework.stereotype.Component;

@Component
public class DailyFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Practice makes a man perfect ";
	}

}
