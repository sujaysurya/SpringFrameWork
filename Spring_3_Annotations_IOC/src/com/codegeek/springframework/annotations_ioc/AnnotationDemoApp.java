package com.codegeek.springframework.annotations_ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the container
		Coach coach = context.getBean("trackCoach", TrackCoach.class);
		Coach kcoach = context.getBean("kabbadiCoach", KabbadiCoach.class);
		// call a method on the bean
		System.out.println("The daily workout from the Track Coach: " + coach.getDailyWorkout());
		System.out.println("The daily workout from the Kabbadi Coach: " + kcoach.getDailyWorkout());
		// close the bean
		context.close();
	}

}
