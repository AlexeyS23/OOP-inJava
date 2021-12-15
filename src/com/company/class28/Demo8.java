package com.company.class28;

import java.util.*;

public class Demo8 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("Egg",5.5);
        grocery.put("Tomato",6.5);
        grocery.put("Milk",4.3);
        grocery.put("Rice",4.3);

        System.out.println(grocery);

        Set<Map.Entry<String, Double>> entrySet = grocery.entrySet();//map=>set=>iterator;
        for (Map.Entry<String,Double> entry: entrySet
             ) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
