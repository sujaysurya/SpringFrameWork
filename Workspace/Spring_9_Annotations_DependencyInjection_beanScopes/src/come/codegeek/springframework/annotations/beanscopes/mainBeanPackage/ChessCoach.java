package come.codegeek.springframework.annotations.beanscopes.mainBeanPackage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import come.codegeek.springframework.annotations.beanscopes.helperPackage.FortuneService;

@Component("chessCoach")
public class ChessCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	public ChessCoach() {
		System.out.println("Inside chess coach default constructor");
	}

	@Override
	public String getDailySchedule() {
		return "Learn to meditate !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	@PostConstruct
	public void customStartupCode() {
		System.out.println("Performing startup activities after bean creation");
	}
	
	
	@PreDestroy
	public void customCleanupCode() {
		System.out.println("Performing clean up activities before bean destruction");
	}
}
