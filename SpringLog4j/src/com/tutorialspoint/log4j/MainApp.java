package com.tutorialspoint.log4j;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Logger log4j2 = LogManager.getLogger();		//Log4j2
	static Log log = LogFactory.getLog(MainApp.class);	//Jakarta Commons Logging (JCL)

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		log4j2.info("Going to create HelloWord Obj");
		
		HelloLog4j obj = (HelloLog4j)context.getBean("helloLog4j");
		obj.getMessage();
		
		context.close();
	}

}
