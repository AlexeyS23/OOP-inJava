package com.company.class21;

public class MethodOverloadingDemo {

    void method(int number) {
        System.out.println(number);
    }

    void method(String name) {
        System.out.println(name);
    }
    void method(String name, int number) {
        System.out.println(name);
        System.out.println("Hello");
    }
    void method(int number, String name) {
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Hello");
    }

}