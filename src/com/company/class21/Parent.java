package com.company.class21;

public class Parent {
    void method(int num){
        System.out.println("From Parent");
    }
    }
class Child extends Parent{
    @Override
    void method (int num){
        System.out.println("From Child");
    }
}
class Tester{
    public static void main(String[] args) {


    }
}