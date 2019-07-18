package com.codegeek.springframework.annotations_dependencyInjection.setterInjection.helperPackage;

import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Every day is your lucky day";
	}

}
