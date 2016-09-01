package com.tutorialspoint.beanpostprocessor;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your Message: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("do init()...");
	}
	
	public void destroy(){
		System.out.println("do destroy()...");
	}
}
