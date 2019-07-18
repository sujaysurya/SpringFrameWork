package com.codegeek.springframework.annotations.useQualifiers.helperPackage;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	String[] randarray = { "Random Monday", "Random Tuesday", "Random Wednesday", "Random Thursday", "Random Friday" };
	Random rand = new Random();
	int randNum = rand.nextInt(randarray.length);
	String randomFortune = randarray[randNum];

	@Override
	public String getDailyFortune() {
		return randomFortune;
	}

}
