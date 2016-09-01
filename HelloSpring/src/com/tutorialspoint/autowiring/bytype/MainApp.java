package com.tutorialspoint.autowiring.bytype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor)context.getBean("awTextEditorByType");
		
		System.out.println("=== auto wiring by type ===");
		
		te.getName();
		te.spellCheck();
		
		context.close();
	}

}
