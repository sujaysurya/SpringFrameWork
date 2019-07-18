package com.codegeek.springframework.annotations_ioc;

import org.springframework.stereotype.Component;

@Component("trackCoach")
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Prepare for the Marathon !!";
	}

}
