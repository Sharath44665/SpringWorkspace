package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//@PropertySource("classpath:custom.properties") // for single custom file
@PropertySources(
        {
                @PropertySource("classpath:custom.properties"),
                @PropertySource("classpath:second.custom.properties")
        }
)
public class MyFirstService {

    private final MyFirstClass firstdemo;

    // reading application.property (default)
    @Value("${demo.custom.name}")
    private String appProperyCustomName;

    // reading from diff file
    @Value("${demo.custom.name}")
    private String customPropDiffFile;

    // reading from diff file
    @Value("${demo.prop.name}")
    private String customPropDiffFile2;

    public MyFirstService(@Qualifier("mySecondBean") MyFirstClass firstdemo) {
        this.firstdemo = firstdemo;
    }


    public String tellAStory(){
        return "this dependency saying: " +firstdemo.sayHello();
    }

    public String getCustomPropDiffFile() {
        return customPropDiffFile;
    }

    public String getCustomPropDiffFile2() {
        return customPropDiffFile2;
    }

    public String getAppProperyCustomName() {
        return appProperyCustomName;
    }
}
