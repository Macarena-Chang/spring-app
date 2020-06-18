package com.website.springdemo;

import java.util.ArrayList;

public class HappyFortuneService implements FortuneService {

	private ArrayList<String> fortuneList = new ArrayList<String>(); 
	
	public void inicializarLista(){
		fortuneList.add("Today is your lucky day!"); 
		fortuneList.add("You can do it!"); 
		fortuneList.add("You'll get 1st place!"); 
	}

	@Override
	public String getFortune(){
		inicializarLista();
		String fortune; 		
		int randomIndex = (int) (Math.random() * fortuneList.size());
		fortune = fortuneList.get(randomIndex); 
		return fortune;
	}


	public ArrayList<String> getFortuneList() {
		return fortuneList;
	}

	public void setFortuneList(ArrayList<String> fortuneList) {
		this.fortuneList = fortuneList;
	}




}
