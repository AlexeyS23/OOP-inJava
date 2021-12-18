package com.company.class29;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {


        TreeMap<String,String> capital= new TreeMap<>();
        capital.put("USA","WASHINGTON");
        capital.put("TURKEY", "ANKARA");
        capital.put("FRANCE","PARIS");
        capital.put("ITALY","ROME");
        //System.out.println(capital);

       Set<Map.Entry<String,String>> set =capital.entrySet();
       for (Map.Entry<String,String> entry:set){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
        Iterator<Map.Entry<String,String>> iterator =capital.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<String,String> entry=iterator.next();
           System.out.println(entry.getKey()+entry.getValue());
                }
        System.out.println("********************************");
        for (String value: capital.values()) {
            System.out.println(value);

        }
        System.out.println("********************************");
        Iterator<String>valueIterator=capital.values().iterator();
        while (valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }

}
}
