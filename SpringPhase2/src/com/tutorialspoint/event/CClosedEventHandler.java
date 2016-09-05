package com.tutorialspoint.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CClosedEventHandler implements ApplicationListener<ContextClosedEvent>{

	@Override
	public void onApplicationEvent(ContextClosedEvent e) {
		System.out.println("ContextClosedEvent Received!");
	}

}
