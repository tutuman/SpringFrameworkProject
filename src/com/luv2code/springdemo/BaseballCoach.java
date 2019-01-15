package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for dependency Injection
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getBall() {
		return "baseball";
	}

	@Override
	public String getDailyFortune() {
		return "Juse Do it! "+fortuneService.getFortune();
	}
}
