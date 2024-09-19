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
		//this dependency saying: Hello from say hello : my first class, my name: first bean


	}
//


}
