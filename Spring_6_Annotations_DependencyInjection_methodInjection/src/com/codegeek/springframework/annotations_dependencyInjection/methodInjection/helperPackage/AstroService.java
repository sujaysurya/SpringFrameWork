package com.codegeek.springframework.annotations_dependencyInjection.methodInjection.helperPackage;

import org.springframework.stereotype.Component;

@Component("astroService")
public class AstroService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Every day is your lucky day";
	}

}
