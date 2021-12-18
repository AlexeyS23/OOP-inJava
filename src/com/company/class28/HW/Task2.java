package com.company.class28.HW;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.

        HashMap<Double,String>bestBuy=new HashMap<>();
        bestBuy.put(1.0,"sweets");
        bestBuy.put(1.1,"cookies");
        bestBuy.put(1.2,"cakes");
        bestBuy.put(1.3,"pastries");
        bestBuy.put(1.4,"ice cream");
        bestBuy.put(1.5,"pies");
        bestBuy.put(1.6,"halva");
        bestBuy.put(1.7,"mayonnaise");

        Set<Map.Entry<Double, String>> entrySet = bestBuy.entrySet();
        for (Map.Entry<Double,String> entry: entrySet
        ) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
