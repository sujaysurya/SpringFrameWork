package com.codegeek.springframework.xml_dependencyInjection.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve the bean from the container
		Coach tc = context.getBean("trackCoach", TrackCoach.class);
		Coach bc = context.getBean("baseBallCoach", BaseBallCoach.class);
		Coach cc = context.getBean("cricketCoach", CricketCoach.class);
		// Call the methods on the bean
		System.out.println(tc.getDailyWorkout() + " Today's fortune for you is: " + tc.getDailyFortune());
		System.out.println(bc.getDailyWorkout() + " Today's fortune for you is: " + bc.getDailyFortune());
		System.out.println(cc.getDailyWorkout() + " Today's fortune for you is: " + cc.getDailyFortune());
		// Close the bean
		context.close();

	}

}
