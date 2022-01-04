package com.company.class31;

public class ExceptDemo1 {
    public static void main(String[] args) {
        String name=null;
        System.out.println("line 1");
        try {
            int number1 = 10;
            int number2 = 0;
            System.out.println(number1/number2);
            System.out.println(name.length());
            }catch (NullPointerException e){
            System.out.println("Work done bad");
        }catch (ArithmeticException e){
            System.out.println("we can drive a zero");
        }catch (Exception e){
            System.out.println("Something wrong");
        }
        System.out.println("Line 2");

}}
