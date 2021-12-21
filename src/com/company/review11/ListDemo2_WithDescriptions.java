package com.company.review11;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo2_WithDescriptions {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(50);
        arrayList.remove(5);//remove by index
        arrayList.remove(new Integer(5));//remove by object
        System.out.println(arrayList);
        Collections.sort(arrayList); // metod from class, to sort the data
        System.out.println(arrayList);
        Collections.reverse(arrayList);//reverse
        System.out.println(arrayList);
        Collections.shuffle(arrayList);//перетасовать все цифры
        System.out.println(arrayList);

    }
}
