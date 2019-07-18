package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

import java.util.Random;

public class TarotReadingService implements FortuneService {
	public String[] strarr = { "Spectacular Day", "Awesome Day", "Beautiful Day", "Cloudy day", "Breathtaking day" };

	@Override
	public String getDailyFortune() {
		Random r = new Random();
		int randomFortune = r.nextInt(strarr.length);
		String randomString = strarr[randomFortune];
		return randomString;
	}

}
