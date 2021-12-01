package com.company.class24.InterfaceDemo.interfase3;

public interface Interface {
    default void method1(){
        System.out.println("I am a default method in Interfase");
    }
    static void method2(){
        System.out.println("I am static method in Interfase");
    }
}
class Test implements Interface{

}
class Main{
    public static void main(String[] args) {
        Interface.method2(); // only for static
        Interface I1=new Test();
        I1.method1();
        new Test().method1();
    }
}