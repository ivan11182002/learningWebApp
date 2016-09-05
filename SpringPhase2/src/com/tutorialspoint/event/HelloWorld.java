package com.tutorialspoint.event;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your message: " + message);;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
