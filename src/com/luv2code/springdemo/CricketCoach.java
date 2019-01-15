package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	

	
	//create no args constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no args constructor");
	}
	
	//our setter method
	public void setMyFortuneService(FortuneService myFortuneService) {
		System.out.println("CricketCoach: inside our setter method");
		this.myFortuneService = myFortuneService;
	}
	
	//getters and setters methods
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside  setEmailAddress method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside  setTeam method");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling 15 mins a day";
	}

	@Override
	public String getBall() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}

}
