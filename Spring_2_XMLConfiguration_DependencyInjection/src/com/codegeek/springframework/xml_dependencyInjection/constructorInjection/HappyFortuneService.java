package com.codegeek.springframework.xml_dependencyInjection.constructorInjection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is a wonderful day!!";

	}

}
