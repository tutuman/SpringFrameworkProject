package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load spring Configuration Files
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call method on that bean
		System.out.println(theCoach.getBall());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
