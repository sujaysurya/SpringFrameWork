package com.codegeek.springframework.annotations_dependencyInjection.fieldInjection.helperPackage;

import org.springframework.stereotype.Component;

@Component("palmistryService")
public class PalmistryService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Life line is really long - blessed with a long life";
	}

}
