package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component // this is works for get bean
//@Service // same as above
//@Repository // same as above
public class MyFirstClass {


    public String sayHello(){
        return "Hello from say hi = my first class";
    }
}