package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean from the container
		Coach tc = context.getBean("trackCoach", TrackCoach.class);
		Coach bc = context.getBean("baseBallCoach", BaseBallCoach.class);
		CricketCoach cc = context.getBean("cricketCoach", CricketCoach.class);
		TennisCoach tnc = context.getBean("tennisCoach", TennisCoach.class);
		SwimmingCoach swc = context.getBean("swimCoach", SwimmingCoach.class);
		Coach sqc1 = context.getBean("squashCoach", SquashCoach.class);
		Coach sqc2 = context.getBean("squashCoach", SquashCoach.class);
		Coach vlb1 = context.getBean("volleyBallCoach", VolleyBallCoach.class);
		Coach vlb2 = context.getBean("volleyBallCoach", VolleyBallCoach.class);

		// Call the methods on the bean
		trackCoachExecution(tc);
		baseBallCoachExecution(bc);
		cricketCoachExecution(cc);
		tennisCoachExecution(tnc);
		swimCoachExecution(swc);

		// Checking for singleton scope - the default one
		checkForSingletonScope(sqc1, sqc2);
		// Checking for prototype scope - the default one
		checkForPrototypeScope(vlb1, vlb2);

		// Close the bean
		context.close();

	}

	private static void checkForPrototypeScope(Coach vlb1, Coach vlb2) {
		System.out.println("==================================================================");
		System.out.println("Hello , Greetings from the VolleyBall department!");
		System.out.println("Today's workout plan for you is: " + vlb1.getDailyWorkout());
		System.out.println("Today's fortune for you is: " + vlb1.getDailyFortune());
		System.out.println("\n");
		System.out.println("The first volley ball object created is: " + vlb1);
		System.out.println("The second volley ball object created is: " + vlb2);
		if (vlb1 == vlb2) {
			System.out.println("Both of the objects are same - default singleton scope object created !!");
		} else {
			System.out.println("Both of the objects are different -  prototype  scope object created !!");
		}
		System.out.println("==================================================================");
		System.out.println("\n\n\n");
	}

	private static void checkForSingletonScope(Coach sqc1, Coach sqc2) {
		System.out.println("==================================================================");
		System.out.println("Hello , Greetings from the Sqush department!");
		System.out.println("Today's workout plan for you is: " + sqc1.getDailyWorkout());
		System.out.println("Today's fortune for you is: " + sqc1.getDailyFortune());
		System.out.println("\n");
		System.out.println("The first squash object created is: " + sqc1);
		System.out.println("The second squash object created is: " + sqc2);
		if (sqc1 == sqc2) {
			System.out.println("Both of the objects are same - default singleton scope object created !!");
		} else {
			System.out.println("Both of the objects are different -  prototype  scope object created !!");
		}
		System.out.println("==================================================================");
		System.out.println("\n\n\n");
	}

	private static void cricketCoachExecution(CricketCoach cc) {
		System.out.println("==================================================================");
		System.out.println("Hello , Greetings from the Cricket department!");
		System.out.println("Today's workout plan for you is: " + cc.getDailyWorkout());
		System.out.println("Today's fortune for you is: " + cc.getDailyFortune());
		System.out.println("The cricket team's email id is: " + cc.getEmailID());
		System.out.println("The cricket team's name is: " + cc.getTeam());
		System.out.println("==================================================================");
		System.out.println("\n\n\n");
	}

	private static void baseBallCoachExecution(Coach bc) {
		System.out.println("==================================================================");
		System.out.println("Hello , Greetings from the BaseBall department!");
		System.out.println("Today's workout plan for you is: " + bc.getDailyWorkout());
		System.out.println("Today's fortune for you is: " + bc.getDailyFortune());
		System.out.println("==================================================================");
		System.out.println("\n\n\n");
	}

	private static void trackCoachExecution(Coach tc) {
		System.out.println("==================================================================");
		System.out.println("Hello , Greetings from the Athletic Track department!");
		System.out.println("Today's workout plan for you is: " + tc.getDailyWorkout());
		System.out.println("Today's fortune for you is: " + tc.getDailyFortune());
		System.out.println("==================================================================");
		System.out.println("\n\n\n");
	}

	private static void tennisCoachExecution(TennisCoach tnc) {
		System.out.println("==================================================================");
		System.out.println("Hello , Greetings from the Tennis department!");
		System.out.println("Today's workout plan for you is: " + tnc.getDailyWorkout());
		System.out.println("Today's fortune for you is: " + tnc.getDailyFortune());
		System.out.println("The tennis team captain  is: " + tnc.getCaptain());
		System.out.println("The tennis team coach is: " + tnc.getCoach());
		System.out.println("The tennis team's email id  is: " + tnc.getEmail());
		System.out.println("The tennis team's name is: " + tnc.getTeam());
		System.out.println("==================================================================");
		System.out.println("\n\n\n");
	}

	private static void swimCoachExecution(SwimmingCoach swc) {
		System.out.println("==================================================================");
		System.out.println("Hello , Greetings from the swimming department!");
		System.out.println("Today's workout plan for you is: " + swc.getDailyWorkout());
		System.out.println("Today's random fortune for you is: " + swc.getDailyFortune());
		System.out.println("==================================================================");
		System.out.println("\n\n\n");
	}

}
