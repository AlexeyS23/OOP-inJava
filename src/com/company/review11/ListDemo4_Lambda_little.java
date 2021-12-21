package com.company.review11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo4_Lambda_little {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(30);
        System.out.println(arrayList.stream().count());
        System.out.println(arrayList.stream().filter(x -> x > 3).count());

        Object[] obj = arrayList.stream().filter(x -> x > 3).toArray();
        System.out.println(obj);

        // List<Integer> list = arrayList.subList(3, 5);// ALT+enterя, чтобы быстро создать...
       // System.out.println(list);

    }
}
