package com.tutorialspoint.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("=== init-method, destroy-method ===");
		HelloWorld objA = (HelloWorld)context.getBean("lifecycle");
		objA.getMessage();
		
		System.out.println("=== default-init-method, default-destroy-method ===");
		HelloWorld2 objB = (HelloWorld2)context.getBean("lifecycle2");
		objB.getMessage();
		
		context.registerShutdownHook();
		
		context.close();
		
	}

}
