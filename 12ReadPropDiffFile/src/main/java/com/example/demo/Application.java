package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Recommended construction injection is preferred in Spring

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);

		MyFirstService first = context.getBean( MyFirstService.class);
		System.out.println(first.tellAStory());	
		//this dependency saying: Hello from say hello : my first class, my name: second bean
		System.out.println(first.getAppProperyCustomName()); // Sharathchandra custom name
		System.out.println(first.getCustomPropDiffFile());// Sharathchandra custom property property
		System.out.println(first.getCustomPropDiffFile2()); // hello this is demo property file
	}
//
}
