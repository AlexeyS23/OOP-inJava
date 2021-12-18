package com.company.class29;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList <Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        int sum=0;
        for (Integer number:numbers) {

            sum+=number;
        }
        System.out.println(sum);
    }

}
