package com.company.class28.HW;

import java.util.Collection;
import java.util.LinkedList;

//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers
public class Task6 {
    public static void main(String[] args) {
        Collection<Integer> number=new LinkedList<>();
        Integer sum=0;
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(600);

        for (Integer num:number){
            sum+=num;

        }
        System.out.println(sum);
    }
}
