package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		// call a method on the bean
		System.out.println("Tennis Coach - getDailyWorkout: " + theCoach.getDailyWorkout());
		
		System.out.println("Soccer Coach - getDailyWorkout: " + soccerCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println("Tennis Coach - getDailyFortune: " + theCoach.getDailyFortune());
		
		System.out.println("Soccer Coach - getDailyFortune: " + soccerCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
