package com.codegeek.springframework.annotations.useQualifiers.masterPackage;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegeek.springframework.annotations.useQualifiers.mainBeanPackage.Coach;
import com.codegeek.springframework.annotations.useQualifiers.mainBeanPackage.GymnasticsCoach;

public class AnnotationDemoAppMethod {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the container
		Coach gymCoach = context.getBean("gymnasticsCoach", GymnasticsCoach.class);
		// call a method on the bean
		gymnasticsImplementation(gymCoach);
		// close the bean
		context.close();
	}

	private static void gymnasticsImplementation(Coach gymCoach) {
		System.out.println("\n");
		System.out.println("The daily workout from the Gymnastics Coach: " + gymCoach.getDailyWorkout());
		System.out.println("The daily fortune for the Gymnastics Coach is: " + gymCoach.getDailyFortune());
		System.out.println("\n\n\n");
	}

}
