package com.tutorialspoint.di.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
		jc.getAddrList();
		jc.getAddrSet();
		jc.getAddrMap();
		jc.getAddrProp();
		
		context.close();
	}

}
