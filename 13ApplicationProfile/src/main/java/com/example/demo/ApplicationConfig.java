package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
	@Qualifier("first")
	public MyFirstClass myFirstBean(){
		return new MyFirstClass("first bean");
	}

		@Bean
		public MyFirstClass mySecondBean(){
			return new MyFirstClass("second Bean");
		}

	@Bean
//	@Primary // if primary used, then this is first priority
	public MyFirstClass myThirdBean(){
		return new MyFirstClass("third Bean");
	}



}
