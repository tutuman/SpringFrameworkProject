package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load spring config files
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");
		
		//retreive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		//check if they are same beans
		boolean result = (theCoach == alphaCoach);
		
		//print out result
		System.out.println("\npointing to the same object: "+result);
		System.out.println("\nMemory locarion for theCoach: "+ theCoach);
		System.out.println("\nMemory locarion for theCoach: "+ alphaCoach);
		
		context.close();

	} 

}
