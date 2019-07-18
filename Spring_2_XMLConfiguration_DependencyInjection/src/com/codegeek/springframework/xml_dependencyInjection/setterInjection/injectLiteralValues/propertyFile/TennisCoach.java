package com.codegeek.springframework.xml_dependencyInjection.setterInjection.injectLiteralValues.propertyFile;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	private String team;

	private String email;

	private String captain;

	private String coach;

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	@Override
	public String getDailyWorkout() {
		return "Learn to serve aces";
	}

	@Override
	public String getDailyFortune() {
		return "All your ventures yield fruitful results today";
	}

}
