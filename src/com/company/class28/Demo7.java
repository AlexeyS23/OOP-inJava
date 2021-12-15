package com.company.class28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("Egg",5.5);
        grocery.put("Tomato",6.5);
        grocery.put("Milk",4.3);
        grocery.put("Rice",4.3);

        System.out.println(grocery);

        Iterator<Double> iterator = grocery.values().iterator();//map=>set=>iterator;
        while (iterator.hasNext()){
            Double value=iterator.next();
            if (value==4.3){
                iterator.remove();
            }

        }
        System.out.println(grocery);
    }

}
