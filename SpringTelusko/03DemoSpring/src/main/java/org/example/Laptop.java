package org.example;

public class Laptop implements Computer{
    Laptop(){
        System.out.println("Laptop constructor");
    }
    public void getComputer(){
        System.out.println("This is a new laptop");
    }
}
