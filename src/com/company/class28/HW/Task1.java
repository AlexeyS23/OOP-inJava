package com.company.class28.HW;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.
        TreeMap<String, String> country = new TreeMap<>();
        country.put("Italy", "Rome");
        country.put("Austria", "Vienna");
        country.put("Ukraine", "Kyiv");
        country.put("Germany", "Berlin");
        country.put("USA", "Washington");

        System.out.println(country);
        System.out.println("***********************************************");

        Set<String> keys1 = country.keySet();
        System.out.println(keys1);
        Collection<String> values = country.values();
        System.out.println(values);


        Set<Map.Entry<String, String>> entrySet1 = country.entrySet();
        for (Map.Entry<String,String> entry: entrySet1
        ) {
            System.out.print(entry.getKey()+" ");

        }
        Set<Map.Entry<String, String>> entrySet2 = country.entrySet();
        for (Map.Entry<String,String> entry: entrySet2
        ) {
            System.out.println(entry.getValue());
        }
        System.out.println("***********************************************");

        Iterator<Map.Entry<String, String>> iterator = country.entrySet().iterator();
       while (iterator.hasNext()){
            Map.Entry<String, String> entry=iterator.next();
    }
        System.out.println(country);
    }
}












