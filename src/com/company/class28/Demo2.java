package com.company.class28;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String,Integer>fruit=new HashMap<>();
        fruit.put("Apple",10); // using put metod
        fruit.put("Mango",15);
        fruit.put("Orange",20);
        fruit.put("Kiwi",18);
        fruit.put("Apricoat",50);
        System.out.println(fruit.get("Kiwi"));
        System.out.println(fruit.remove("Orange"));
        System.out.println(fruit);
        System.out.println(fruit.containsKey("cow"));
        System.out.println(fruit.containsKey("Mango"));
        System.out.println(fruit.containsValue(100));
        System.out.println(fruit.isEmpty());
        //System.out.println(fruit.replace());


    }


}
