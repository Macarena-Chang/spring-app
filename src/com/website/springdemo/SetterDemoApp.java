package com.website.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load spring config file		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from container
		CricketCoach theCoach = context.getBean("myCricketCoach" , CricketCoach.class); 
		
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close(); 
		
		/*
		 * Spring is injecting fortuneService using the setter injection.
		 * */
		
		//call new methods to get the literal values
		System.out.println(theCoach.getEmailAdress()); 
		
		System.out.println(theCoach.getTeam()); 

	}

}
