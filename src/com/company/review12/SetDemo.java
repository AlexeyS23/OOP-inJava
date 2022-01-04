package com.company.review12;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(20);//Duplicateds are not allowed so it will be ignored
        hashSet.add(30);
        System.out.println(hashSet);

        for (Integer number: hashSet
             ) {
            System.out.println(number); // print elements one by one
        }

        //hashSet.remove(20);
        System.out.println(hashSet);

        Iterator <Integer>iterator=hashSet.iterator();
        while (iterator.hasNext()){
            Integer number=iterator.next();
            if (number>10){
                iterator.remove();
            }
        }
        System.out.println(hashSet);
    }

}
