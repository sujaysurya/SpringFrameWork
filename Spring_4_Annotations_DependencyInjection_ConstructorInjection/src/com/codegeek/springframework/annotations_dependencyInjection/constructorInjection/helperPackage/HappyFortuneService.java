package com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.helperPackage;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Every day is your lucky day";
	}

}
