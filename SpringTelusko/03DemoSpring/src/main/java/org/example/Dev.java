package org.example;

public class Dev {
    private int age;
    private Computer computer;
    Dev(){
        System.out.println("Dev constructor");
    }

//    public Dev(int age) {
//        this.age = age;
//    }


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void build(){
        System.out.println("working on awesome project");
        computer.getComputer();
    }
}
