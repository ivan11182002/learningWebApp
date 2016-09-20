package com.tutorialspoint.log4j;

import org.junit.Test;

import com.tutorialspoint.log4j.Log4J2PropertiesConf;

public class Log4J2PropertiesConfTest {
	@Test
	public void testPerformSomeTask(){
		Log4J2PropertiesConf conf = new Log4J2PropertiesConf();
		conf.performSomeTask();
	}
}
