package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);

		MyFirstClass first = context.getBean("myFirstClass", MyFirstClass.class); // myFirstClass is a bean name
		// contd. can be found in ApplicationConfig
		System.out.println(first.sayHello()); // Hello from say hi = my first class

		MyDemo demo = context.getBean("demoBean", MyDemo.class);
		System.out.println(demo.getMyDemoText()); // this is coming from getMyDemoText

	}
//


}
