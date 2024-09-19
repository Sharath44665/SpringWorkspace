package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    @Autowired
    @Qualifier("mySecondBean") // method name
    private MyFirstClass firstdemo;


    public String tellAStory(){
        return "this dependency saying: " +firstdemo.sayHello();
    }
}
