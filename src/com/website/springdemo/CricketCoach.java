package com.website.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//create fields para literal value injection
	private String emailAddress; 
	private String team; 
	

	//constructor sin argumentos
	public CricketCoach() {
		System.out.println("CricketCoach: dentro de no-argument constructor"); 
	}
	
	//Setter method para injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: dentro de setter method - setFortuneService"); 
		this.fortuneService = fortuneService;
	}
	


	//Setters para literal value injections
	public void setEmailAddress(String emailAdress) {
		System.out.println("CricketCoach: dentro de setter method -  setEmailAdress");
		this.emailAddress = emailAdress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: dentro de setter method -  setTeam");
		this.team = team;
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practicar 20 minutos";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
