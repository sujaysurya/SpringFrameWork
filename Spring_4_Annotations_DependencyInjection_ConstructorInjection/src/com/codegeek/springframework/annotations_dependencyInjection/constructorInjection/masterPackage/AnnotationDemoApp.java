package com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.masterPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.mainBeanPackage.Coach;
import com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.mainBeanPackage.EquestrianCoach;
import com.codegeek.springframework.annotations_dependencyInjection.constructorInjection.mainBeanPackage.RugbyCoach;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the container
		Coach eqCoach = context.getBean("equestrianCoach", EquestrianCoach.class);
		Coach rugbyCoach = context.getBean("rugbyCoach", RugbyCoach.class);
		// call a method on the bean
		equstrianCoachImplementation(eqCoach);
		rugbyCoachImplementation(rugbyCoach);
		// close the bean
		context.close();
	}

	private static void rugbyCoachImplementation(Coach rugbyCoach) {
		System.out.println("\n");
		System.out.println("The daily workout from the Rugby Coach: " + rugbyCoach.getDailyWorkout());
		System.out.println("The daily fortune for the Rugby Coach is: " + rugbyCoach.getDailyFortune());
		System.out.println("\n\n\n");
	}

	private static void equstrianCoachImplementation(Coach eqCoach) {
		System.out.println("\n");
		System.out.println("The daily workout from the Equestrian Coach: " + eqCoach.getDailyWorkout());
		System.out.println("The daily fortune for the Equestrian Coach is: " + eqCoach.getDailyFortune());
		System.out.println("\n\n\n");
	}

}
