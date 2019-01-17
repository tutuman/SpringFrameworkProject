package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	@Override
	public String getBall() {
		return "trackball";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// add an init method(custom hook)
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpMethod");
		
	}
	//add an destroy method(custom hook)
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
