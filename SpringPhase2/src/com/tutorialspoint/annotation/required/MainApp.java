package com.tutorialspoint.annotation.required;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.annotation.Student;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student s = (Student)context.getBean("annoRequired");
		
		System.out.println("Name: " + s.getName());
		System.out.println("Age: " + s.getAge());
		
		context.close();

	}

}
