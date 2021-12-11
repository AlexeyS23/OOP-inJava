package com.company.class27_Review_class26.arraytasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        cars.add("BMW M3");
        cars.add("Ford");
        cars.add("Ferrari");
        cars.add("Mersedes");
        cars.add(1,"Toyota");
        System.out.println(cars);

        //#2
        for (String car: cars
             ) {
            System.out.println(car);
        }
        //#3
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i)+" has numbers of letters "+cars.get(i).length());
        }
        //#4
        int i=0;
        while (i<cars.size()){
            System.out.println(cars.get(i));
            i++;
        }
        //#5
        System.out.println("******************************");
        Iterator <String> iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //#6
        //cars.stream().spliterator().forEachRemaining(System.out.println(););
        System.out.println("******************************");
        System.out.println(cars.get(cars.size()-1));

    }
}
