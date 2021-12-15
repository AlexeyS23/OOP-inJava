package com.company.class28;

import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("Egg",5.5);
        grocery.put("Tomato",6.5);
        grocery.put("Milk",4.3);
        grocery.put("Rice",4.3);

        System.out.println(grocery);

        Iterator<Map.Entry<String, Double>> iterator = grocery.entrySet().iterator();//map=>set=>iterator;
        while (iterator.hasNext()){
            Map.Entry<String, Double> entry=iterator.next();
            if (entry.getKey().equals("Milk") && entry.getValue()==4.3){
                iterator.remove();
            }
        }
        System.out.println(grocery);
    }

}
