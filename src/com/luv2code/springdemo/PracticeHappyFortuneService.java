package com.luv2code.springdemo;

public class PracticeHappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
