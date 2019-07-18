package com.codegeek.springframework.annotations_dependencyInjection.setterInjection.masterPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegeek.springframework.annotations_dependencyInjection.setterInjection.mainBeanPackage.Coach;
import com.codegeek.springframework.annotations_dependencyInjection.setterInjection.mainBeanPackage.KhokhoCoach;
import com.codegeek.springframework.annotations_dependencyInjection.setterInjection.mainBeanPackage.RifleShooting;

public class AnnotationDemoAppSetter {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the container
		Coach rifCoach = context.getBean("rifleShooting", RifleShooting.class);
		Coach kkcCoach = context.getBean("khokhoCoach", KhokhoCoach.class);
		// call a method on the bean
		equstrianCoachImplementation(rifCoach);
		rugbyCoachImplementation(kkcCoach);
		// close the bean
		context.close();
	}

	private static void rugbyCoachImplementation(Coach kkcCoach) {
		System.out.println("\n");
		System.out.println("The daily workout from the KhoKho Coach: " + kkcCoach.getDailyWorkout());
		System.out.println("The daily fortune for the KhoKho Coach is: " + kkcCoach.getDailyFortune());
		System.out.println("\n\n\n");
	}

	private static void equstrianCoachImplementation(Coach rifCoach) {
		System.out.println("\n");
		System.out.println("The daily workout from the Rifle Coach: " + rifCoach.getDailyWorkout());
		System.out.println("The daily fortune for the Rifle Coach is: " + rifCoach.getDailyFortune());
		System.out.println("\n\n\n");
	}

}
