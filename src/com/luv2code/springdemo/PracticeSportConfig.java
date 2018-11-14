package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSportConfig {
	
	// define bean for our happy fortune service
	@Bean
	public FortuneService practiceHappyFortuneService() {
		return new PracticeHappyFortuneService();
	}
	
	// define bean for our wrestling coach AND inject dependency
	@Bean
	public Coach wrestlingCoach() {
		WrestlingCoach myWrestlingCoach = new WrestlingCoach( practiceHappyFortuneService());

		return myWrestlingCoach;
	}

}
