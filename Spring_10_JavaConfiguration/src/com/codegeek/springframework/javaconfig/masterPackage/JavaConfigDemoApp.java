package com.codegeek.springframework.javaconfig.masterPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codegeek.springframework.javaconfig.mainBeanPackage.Coach;
import com.codegeek.springframework.javaconfig.mainBeanPackage.MarathonCoach;
import com.codegeek.springframework.javaconfig.mainBeanPackage.SwimCoach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportStarConfig.class);
		Coach marathonCoach = context.getBean("marathonCoach", MarathonCoach.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

		marathonCoachImpl(marathonCoach);
		swimCoachImpl(swimCoach);

		context.close();

	}

	private static void swimCoachImpl(SwimCoach swimCoach) {
		System.out.println("\n\n\n");
		System.out.println("The workout schedule from the swim coach is :" + swimCoach.getDailyWorkout());
		System.out.println("The forture  provided by the swim coach is :" + swimCoach.getDailyFortune());
		System.out.println("The team given by the swim coach is :" + swimCoach.getTeam());
		System.out.println("The email given by the swim coach is :" + swimCoach.getEmail());
	}

	private static void marathonCoachImpl(Coach marathonCoach) {
		System.out.println("\n\n\n");
		System.out.println("The workout schedule from the marathon coach is :" + marathonCoach.getDailyWorkout());
		System.out.println("The forture  provided by the marathon coach is :" + marathonCoach.getDailyFortune());
	}

}
