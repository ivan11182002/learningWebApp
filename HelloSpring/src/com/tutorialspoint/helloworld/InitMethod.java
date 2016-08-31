package com.tutorialspoint.helloworld;

public class InitMethod {
	private String message;

	public void getMessage() {
		System.out.println("Your Message: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void initMethod() {
		System.out.println("In InitMethod >>> initMethod()");;
	}
}
