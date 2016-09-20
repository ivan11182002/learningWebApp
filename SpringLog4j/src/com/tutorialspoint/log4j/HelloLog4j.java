package com.tutorialspoint.log4j;

public class HelloLog4j {
	private String message;

	public String getMessage() {
		System.out.println("Your message: " + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
