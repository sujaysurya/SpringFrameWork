package com.codegeek.springframework.annotations_dependencyInjection.methodInjection.masterPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegeek.springframework.annotations_dependencyInjection.methodInjection.mainBeanPackage.Coach;
import com.codegeek.springframework.annotations_dependencyInjection.methodInjection.mainBeanPackage.PingPongCoach;
import com.codegeek.springframework.annotations_dependencyInjection.methodInjection.mainBeanPackage.SoccerCoach;

public class AnnotationDemoAppMethod {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the container
		Coach pingPongCoach = context.getBean("pingpongCoach", PingPongCoach.class);
		Coach soccerCoach = context.getBean("soccerCoach", SoccerCoach.class);
		// call a method on the bean
		pingpongImplementation(pingPongCoach);
		soccerCoachImplementation(soccerCoach);
		// close the bean
		context.close();
	}

	private static void pingpongImplementation(Coach pingPongCoach) {
		System.out.println("\n");
		System.out.println("The daily workout from the Soccer Coach: " + pingPongCoach.getDailyWorkout());
		System.out.println("The daily fortune for the Soccer Coach is: " + pingPongCoach.getDailyFortune());
		System.out.println("\n\n\n");
	}

	private static void soccerCoachImplementation(Coach soccerCoach) {
		System.out.println("\n");
		System.out.println("The daily workout from the PingPong Coach: " + soccerCoach.getDailyWorkout());
		System.out.println("The daily fortune for the PingPong Coach is: " + soccerCoach.getDailyFortune());
		System.out.println("\n\n\n");
	}

}
