package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass firstdemo;

    // setter method
    @Autowired
    public void setMyFirstClass( @Qualifier("mySecondBean") MyFirstClass firstClass){
        this.firstdemo = firstClass;
    }

    public String tellAStory(){
        return "this dependency saying: " +firstdemo.sayHello();
    }
}
