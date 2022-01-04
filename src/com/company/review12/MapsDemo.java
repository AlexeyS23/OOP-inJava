package com.company.review12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MapsDemo {
    public static void main(String[] args) {
        Hashtable<String,Integer>hashtable=new Hashtable<>(); //Thread safe
        hashtable.put("Hasim",22);
        hashtable.put("Demir",25);
        hashtable.put("Alona",17);
        hashtable.put("Marina",16);

        System.out.println(hashtable);
        Set<String> keys = hashtable.keySet();
       // keys.removeIf(x->x.length()==5); remove the elements whitch have a name that is more than 5 char
       // System.out.println(hashtable);
       // hashtable.values().removeIf(x->x>16); remove the elements that more 16
       // System.out.println(hashtable);

        hashtable.entrySet().removeIf(entry->entry.getKey().endsWith("a")&&entry.getValue()==16);
        System.out.println(hashtable);

      //  Iterator<String>iterator=keys.iterator();

       // while (iterator.hasNext()){
       //     String key=iterator.next();
       // }



    }

}
