package com.website.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService; 
	
	//constructor
	public TrackCoach() {
	}
	
	//constructor
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Correr 5 kilometros"; 
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it :) " +  fortuneService.getFortune();
	}

}
