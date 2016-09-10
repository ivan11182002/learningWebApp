package com.tutorialspoint.annotation.comp;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band"; 
	private String aritst = "The Beatles"; 
	
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + aritst);
	}

}
