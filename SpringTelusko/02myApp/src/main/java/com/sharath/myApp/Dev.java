package com.sharath.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    Laptop laptop = new Laptop(); // dont want to use this statement
    @Autowired // field injection
    @Qualifier("laptop")
    private Computer myCom;

    public void build(){
        myCom.compile();
        System.out.println("working on awesome project");
    }
}
