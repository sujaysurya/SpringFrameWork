package com.codegeek.springframework.annotations_dependencyInjection.fieldInjection.masterPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegeek.springframework.annotations_dependencyInjection.fieldInjection.mainBeanPackage.Coach;
import com.codegeek.springframework.annotations_dependencyInjection.fieldInjection.mainBeanPackage.TapDanceCoach;

public class AnnotationDemoAppMethod {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the container
		Coach tpdcoach = context.getBean("tapDanceCoach", TapDanceCoach.class);
		// call a method on the bean
		tapdanceImplementation(tpdcoach);
		// close the bean
		context.close();
	}

	private static void tapdanceImplementation(Coach tpdcoach) {
		System.out.println("\n");
		System.out.println("The daily workout from the tap dance Coach: " + tpdcoach.getDailyWorkout());
		System.out.println("The daily fortune for the tap Dance Coach is: " + tpdcoach.getDailyFortune());
		System.out.println("\n\n\n");
	}

}
