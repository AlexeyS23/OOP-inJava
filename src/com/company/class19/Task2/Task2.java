package com.company.class19.Task2;

public class Task2 {
    //Write program to inherit class A that has
    //	method printF which is static and call or reuse that method into class B
    public static void main(String[] args) {
        A.B.printF();
    }
}
class A{
    static void printF(){
        System.out.println("Print F from A");
    }
    class B extends A{

    }
}