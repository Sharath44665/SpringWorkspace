package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//       Dev obj = new Dev();
//       obj.build();
        Dev obj = context.getBean( Dev.class);
//        System.out.println(obj.getAge());
        obj.build();
    }
}
