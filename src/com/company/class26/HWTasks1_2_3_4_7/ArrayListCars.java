package com.company.class26.HWTasks1_2_3_4_7;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class ArrayListCars {
    public static void main(String[] args) {
        ArrayList<String>car=new ArrayList<>();
        car.add("Mersedes");
        car.add("Opel");
        car.add("BMW");
        car.add("Honda");
        System.out.println(car);

        for (String c: car){
            System.out.println(c);
        }

        Iterator<String>iterator=car.iterator();
        System.out.print(iterator.next()+" ,");
        System.out.print(iterator.next()+" ,");
        System.out.print(iterator.next()+" ,");
        System.out.print(iterator.next()+" ");


    }
}
