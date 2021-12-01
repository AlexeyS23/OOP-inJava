package com.company.class18;

public class MultiClassConsDemo {
    public MultiClassConsDemo () {
        System.out.println("1");
    }
    public MultiClassConsDemo(String name, int age) {
        System.out.println("2");
    }

    public MultiClassConsDemo(int age, String name) {
        System.out.println("3");
    }

    public MultiClassConsDemo(String name, int age, double weigth) {
        System.out.println("4");
    }
}