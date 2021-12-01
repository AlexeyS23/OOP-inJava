package com.company.class20.task2.Task4;

public class Task4 {
    private void method(){
        System.out.println("void method");
    }
    private int method (int num){
        System.out.println("int method");
        return num;
    }
    private int method (String str){
        System.out.println("str method hello");
        return 5;
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.method();
        task4.method(44);
        task4.method("Hello");
    }
}
