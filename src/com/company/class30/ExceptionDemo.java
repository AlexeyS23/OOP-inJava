package com.company.class30;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Important line of code");
        System.out.println("Important line of code");
        try{
            System.out.println(10/0);//вместо нуля попробуй поставить 2
        }catch (Exception e){
            System.out.println("Dividing by zero not posible in java");
            //e.printStackTrace();
        }
        System.out.println("Important line of code");
        System.out.println("Important line of code");


    }
}
