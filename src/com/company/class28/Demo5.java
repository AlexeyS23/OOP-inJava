package com.company.class28;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("Egg",5.5);
        grocery.put("Tomato",6.5);
        grocery.put("Milk",4.3);
        grocery.put("Rice",4.3);

        Set<String> keys = grocery.keySet();
        System.out.println(keys);
        Collection<Double> values = grocery.values();
        System.out.println(values);

    }
}
