package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
	public MyFirstClass myFirstBean(){
		return new MyFirstClass("Chandra");
	}

//	@Bean
//	public MyFirstClass mySecondBean(){
//		return new MyFirstClass("second Bean");
//	}


}
