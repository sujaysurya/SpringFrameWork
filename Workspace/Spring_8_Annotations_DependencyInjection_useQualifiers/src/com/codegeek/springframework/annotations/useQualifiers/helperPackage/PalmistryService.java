package com.codegeek.springframework.annotations.useQualifiers.helperPackage;

import org.springframework.stereotype.Component;

@Component
public class PalmistryService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Life line is really long - blessed with a long life";
	}

}
