package com.tutorialspoint.inheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloIndia obj = (HelloIndia) context.getBean("inheritChild");
		obj.getMessage1();
		obj.getMessage2();
		obj.getMessage3();
		
		context.close();
	}

}
