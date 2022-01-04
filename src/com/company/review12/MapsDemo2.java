package com.company.review12;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import static com.company.utils.MapUtil.sortByValue;

public class MapsDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
       linkedHashMap.put("Hasim",22);
       linkedHashMap.put("Demir",25);
       linkedHashMap.put("Alona",17);
       linkedHashMap.put("Marina",16);

        linkedHashMap = sortByValue(linkedHashMap);
        System.out.println(linkedHashMap);
    }
}
