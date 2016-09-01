package com.tutorialspoint.beanpostprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		HelloWorld objA = (HelloWorld)context.getBean("beanPostProcessor");
		objA.getMessage();
		
		context.registerShutdownHook();
		
		context.close();
	}

}
