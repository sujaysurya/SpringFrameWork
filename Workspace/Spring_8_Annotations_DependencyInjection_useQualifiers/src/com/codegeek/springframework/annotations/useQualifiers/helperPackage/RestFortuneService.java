package com.codegeek.springframework.annotations.useQualifiers.helperPackage;
import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Hello from the Rest fortune service";
	}

}
