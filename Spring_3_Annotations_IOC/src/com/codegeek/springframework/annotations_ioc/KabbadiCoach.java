package com.codegeek.springframework.annotations_ioc;

import org.springframework.stereotype.Component;

@Component
public class KabbadiCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Learn to grapple an opponent !!";
	}
}
