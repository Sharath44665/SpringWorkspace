package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);

		MyFirstClass first = context.getBean("myFirstClass", MyFirstClass.class); // myFirstClass is a bean name
		// contd. can be found in ApplicationConfig
		System.out.println(first.sayHello()); // Hello from say hello : my first class, my name: Chandra

		MyDemo demo = context.getBean("demoBean", MyDemo.class);
		System.out.println(demo.getMyDemoText()); // this is coming from getMyDemoText

	}
//


}
