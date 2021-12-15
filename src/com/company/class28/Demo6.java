package com.company.class28;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("Egg",5.5);
        grocery.put("Tomato",6.5);
        grocery.put("Milk",4.3);
        grocery.put("Rice",4.3);

        System.out.println(grocery);
        //Iterator<String> keys = grocery.keySet().iterator();//map=>set=>iterator;
        //while (keys.hasNext()){
        //    System.out.println(keys.next());
       // }
        Iterator<String> iterator = grocery.keySet().iterator();//map=>set=>iterator;
        while (iterator.hasNext()){
            String key=iterator.next();
            if (key.contains("e")){
                iterator.remove();
            }

        }
        System.out.println(grocery);
    }

}
