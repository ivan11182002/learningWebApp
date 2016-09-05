package com.tutorialspoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student s = (Student)context.getBean("student");
		
		s.getName();
		System.out.println();

		s.getAge();
		System.out.println();
		
		try {
			s.printThrowException();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		context.close();
		
	}

}
