package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
	public MyFirstClass myFirstClass(){
		return new MyFirstClass("Chandra");
	}

	@Bean("demoBean")
	public MyDemo myDemo(){
		return  new MyDemo();
	}
}
