package com.tutorialspoint.autowiring.byname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor)context.getBean("awTextEditorByName");
		
		System.out.println("=== auto wiring by name ===");
		
		te.getName();
		te.spellCheck();
		
		context.close();
	}

}
