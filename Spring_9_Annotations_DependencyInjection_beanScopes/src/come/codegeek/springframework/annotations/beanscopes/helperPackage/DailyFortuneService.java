package come.codegeek.springframework.annotations.beanscopes.helperPackage;

import org.springframework.stereotype.Component;

@Component("dailyFortuneService")
public class DailyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "An apple a day keeps the doctor away!!";
	}

}
