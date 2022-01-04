package com.company.class31;

import java.io.FileInputStream;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
           // System.out.println(10/0);
            System.out.println("3");
            int [] arr=new int[-5];
            System.out.println("4");
            String name=null;
            System.out.println("5");
            name.toLowerCase();
            System.out.println("6");
            FileInputStream fileInputStream=new FileInputStream("sadsd");
        }catch (ArithmeticException e){
            System.out.println("7");
            e.printStackTrace();
        }catch (NegativeArraySizeException e){
            System.out.println("8");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("9");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("10");
            e.printStackTrace();
        }
        System.out.println("11");
    }
}
