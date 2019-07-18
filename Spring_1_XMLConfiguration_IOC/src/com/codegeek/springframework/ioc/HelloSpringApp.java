package com.codegeek.springframework.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve the bean from the container
		Coach tc = context.getBean("trackCoach", Coach.class);
		Coach bc = context.getBean("baseBallCoach", Coach.class);
		// Call the methods on the bean
		System.out.println(tc.getDailyWorkout());
		System.out.println(bc.getDailyWorkout());
		// Close the bean
		context.close();

	}

}
