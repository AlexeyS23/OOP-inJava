package com.company.class22.HomeWork;

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
        //Define common behavior within and some fields in parent class and override some of the methods in child classes
       // Define some methods specific to child classes
        //Create objects of child classes and store them into array. Loop through each object and execute available methods.


public class Computer {
    String name;

    Computer (String name){
        this.name=name;


    }

    void comp(){
        System.out.println(name+" Work as computer");
    }
    void electricity(){
        System.out.println(name+ " Need electricity ");
    }


}
class Apple extends Computer{
    Apple(String name){
        super(name);
    }
    @Override
    void comp(){
        System.out.println(name+" Work as computer but with own software ");
    }
    void electricity(){
        System.out.println("Need electricity ");
    }
    void cool(){
        System.out.println("Has a large number of fans ");
    }

}
class Lenovo extends Computer{
    Lenovo(String name){
        super(name);
    }

    void comp(){
        System.out.println(name+" Work as computer");
    }
    @Override
    void electricity(){
        System.out.println("Need electricity but have a problems with software");
    }
    void bad(){
        System.out.println("has a lot of bad reviews ");
    }

}
class HP extends Computer{
    HP(String name){
        super(name);
    }
    void comp(){
        System.out.println(name+" Work as computer");
    }
    void electricity(){
        System.out.println("Need electricity ");
    }
    void work(){
        System.out.println("Has proven itself well ");
    }

}
class Dell extends Computer{
    Dell(String name){
        super(name);
    }
    @Override
    void comp(){
        System.out.println(name+" Work as computer and have strong battery ");
    }
    void electricity(){
        System.out.println("Need electricity ");
    }
    void my(){
        System.out.println("I'm working on this comp");
    }

}