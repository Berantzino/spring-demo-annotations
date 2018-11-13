package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Deliver 10 straight passes to your teammate";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
