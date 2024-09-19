package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass firstdemo;

    @Autowired
    public void demoMethodInjectioin( @Qualifier("first") MyFirstClass firstClass){
        this.firstdemo = firstClass;
    }

    public String tellAStory(){
        return "this dependency saying: " +firstdemo.sayHello();
    }
}
