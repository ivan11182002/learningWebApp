package com.tutorialspoint.annotation.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Profile pf = (Profile)context.getBean("annoQualifier");
		
		pf.printName();
		pf.printAge();
		
		context.close();
		
	}

}
