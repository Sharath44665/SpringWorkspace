package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass firstdemo;

//    @Autowired // this is not required, because spring will look for constructor of MyFirstServ
    public MyFirstService(@Qualifier("bean2") MyFirstClass firstdemo) {
        this.firstdemo = firstdemo;
    }

    public String tellAStory(){
        return "this dependency saying: " +firstdemo.sayHello();
    }
}
