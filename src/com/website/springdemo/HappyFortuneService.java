package com.website.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "hoy es tu dia de suerte!";
	}


}
