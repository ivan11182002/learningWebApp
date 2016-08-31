package com.tutorialspoint;

public class DestroyMethod {
	private String message;

	public void getMessage() {
		System.out.println("Your Message: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void destroyMethod() {
		System.out.println("In DestroyMethod >>> destroyMethod()");;
	}
}
