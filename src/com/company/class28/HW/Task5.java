package com.company.class28.HW;

import java.util.Collection;
import java.util.LinkedList;

//Create the collection that will store single uniques Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.
public class Task5 {
    public static void main(String[] args) {
        Collection<Integer>number=new LinkedList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(600);

        for (Integer num:number
             ) {
            System.out.print(num+" ");
        }
        
        System.out.println(number);
    }



}
