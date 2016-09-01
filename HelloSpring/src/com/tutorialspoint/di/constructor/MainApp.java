package com.tutorialspoint.di.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor)context.getBean("ccTextEditor");
		te.spellCheck();
		
		context.close();
	}

}
