package come.codegeek.springframework.annotations.beanscopes.masterPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import come.codegeek.springframework.annotations.beanscopes.mainBeanPackage.ChessCoach;
import come.codegeek.springframework.annotations.beanscopes.mainBeanPackage.Coach;
import come.codegeek.springframework.annotations.beanscopes.mainBeanPackage.SurfingCoach;

public class MyDemoAppBeanScopes {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach chssCoach = context.getBean("chessCoach", ChessCoach.class);
		Coach chssCoach1 = context.getBean("chessCoach", ChessCoach.class);
		Coach surfCoach1 = context.getBean("surfingCoach", SurfingCoach.class);
		Coach surfCoach2 = context.getBean("surfingCoach", SurfingCoach.class);
		chessCoachImpl(chssCoach, chssCoach1);
		surfCoachImpl(surfCoach1, surfCoach2);

		context.close();
	}

	private static void surfCoachImpl(Coach surfCoach1, Coach surfCoach2) {
		System.out.println("\n\n\n");
		System.out.println("The schedule for the surf player today is: " + surfCoach1.getDailySchedule());
		System.out.println("The fortune for the surf player today is: " + surfCoach1.getDailyFortune());
		boolean result = false;
		if (surfCoach1 == surfCoach2) {
			result = true;
			System.out.println("Surf objects of prototype scope pointing to same objects: " + result);
		}
		else {
			System.out.println("Surf objects of prototype scope pointing to same objects: " + result);
		}
	}

	private static void chessCoachImpl(Coach chssCoach, Coach chssCoach1) {
		System.out.println("\n\n\n");
		System.out.println("The schedule for the chess player today is: " + chssCoach.getDailySchedule());
		System.out.println("The fortune for the chess player today is: " + chssCoach.getDailyFortune());
		boolean result = false;
		if (chssCoach == chssCoach1) {
			result = true;
			System.out.println("chess objects of singleton scope pointing to the same objects :" + result);
		}
	}

}
