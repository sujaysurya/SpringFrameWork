package com.codegeek.springframework.javaconfig.helperPackage;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is a boring day!!";
	}

}
