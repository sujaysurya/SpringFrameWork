package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is a wonderful day!!";

	}

}
