package com.company.class28;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<String,Double> groceriesList1=new TreeMap<>();
        groceriesList1.put("Eggs",3.99);
        groceriesList1.put("Tomato",3.2);
        groceriesList1.put("Potato",10.0);
        groceriesList1.put("Milk",5.0);
        groceriesList1.put("Steak",15.0);

        TreeMap<String,Double>groceriesList2=new TreeMap<>();
        groceriesList2.put("Soap",20.0);
        groceriesList2.put("Bear",2.3);

        TreeMap<String,Double>groceriseList=new TreeMap<>();
        groceriseList.putAll(groceriesList1);
        groceriseList.putAll(groceriesList2);
        System.out.println(groceriseList);




    }
}
