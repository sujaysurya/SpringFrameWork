package com.codegeek.springframework.annotations.useQualifiers.helperPackage;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Hello from the database fortune service";
	}

}
