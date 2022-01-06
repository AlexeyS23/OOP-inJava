package com.company.ReviewOfClass30;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Important line of code");
        System.out.println("Important line of code");
        try {
            System.out.println(10/2);
        }catch (Exception e){
            System.out.println("Deviding by zero not possible in java");
        }

        System.out.println("Important line of code");
        System.out.println("Important line of code");;
    }
}
