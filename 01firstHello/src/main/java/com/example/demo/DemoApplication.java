package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);

		MyFirstClass first = context.getBean(MyFirstClass.class);
		System.out.println(first.sayHello());
	}
//
//	@Bean
//	public MyFirstClass myFirstClass(){
//		return new MyFirstClass();
//	}

}
