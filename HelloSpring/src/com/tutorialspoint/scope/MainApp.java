package com.tutorialspoint.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//http://www.tutorialspoint.com/spring/spring_bean_scopes.htm
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//"singleton" test
		System.out.println("=== 'singleton' scope demo ===");
		
		HelloWorld sObjA = (HelloWorld)context.getBean("singleton");
		sObjA.setMessage("I'm singleton object A");
		sObjA.getMessage();
		
		HelloWorld sObjB = (HelloWorld)context.getBean("singleton");
		sObjB.getMessage();
		
		//"prototype" test
		System.out.println("=== 'prototype' scope demo ===");
		HelloWorld pObjA = (HelloWorld)context.getBean("prototype");
		pObjA.setMessage("I'm prototype object A");
		pObjA.getMessage();
		
		HelloWorld pObjB = (HelloWorld)context.getBean("prototype");
		pObjB.getMessage();
		
		context.registerShutdownHook();
		
		context.close();
		
	}

}
