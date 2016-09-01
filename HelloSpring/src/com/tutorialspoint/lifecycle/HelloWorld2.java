package com.tutorialspoint.lifecycle;

public class HelloWorld2 {
	private String message;

	public void getMessage() {
		System.out.println("Your Message: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void defaultInit(){
		System.out.println("do init2()...");
	}
	
	public void defaultDestroy(){
		System.out.println("do destroy2()...");
	}
}
