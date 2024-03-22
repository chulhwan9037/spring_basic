package com.ict.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("com/ict/ex03/config.xml");
	
		
		MyProcess myprocess = (MyProcess) context.getBean("mp3");
		myprocess.prn();
		
		
	
	}
}



























