package com.tutorialspoint.di.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor)context.getBean("setTextEditor");
		te.spellCheck();
		
		context.close();
	}

}
