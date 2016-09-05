package com.tutorialspoint.event;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld hw = (HelloWorld)context.getBean("eventHandler");
		
		context.start();
		
		hw.getMessage();
		
		context.stop();
		context.close();
		
	}

}
