package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass firstdemo;

    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    // setter method
    @Autowired
    public void setMyFirstClass( @Qualifier("mySecondBean") MyFirstClass firstClass){
        this.firstdemo = firstClass;
    }

    public String tellAStory(){
        return "this dependency saying: " +firstdemo.sayHello();
    }

    // using environment show java version
    public String getJavaVersion(){
        return  environment.getProperty("java.version");
    }

    // show os type
    public String getOSType(){
        return environment.getProperty("os.name");
    }

    public String readAppProperty(){
        return environment.getProperty("my.custom.property");
    }

}
