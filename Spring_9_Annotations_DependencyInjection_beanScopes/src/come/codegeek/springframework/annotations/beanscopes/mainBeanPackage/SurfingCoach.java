package come.codegeek.springframework.annotations.beanscopes.mainBeanPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import come.codegeek.springframework.annotations.beanscopes.helperPackage.FortuneService;

@Component("surfingCoach")
@Scope("prototype")
public class SurfingCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	public SurfingCoach() {
		System.out.println("Inside Surfing coach default constructor");
	}

	@Override
	public String getDailySchedule() {
		return "Learn to swim in high tide !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
