package com.company.class25.collectionFramework;

import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that

        ArrayList<String>name=new ArrayList<>();
        name.add("Ahmet");
        name.add("Aysha");
        name.add("Sorbon");
        name.add("Alexey");
        name.add("Arwa");
        System.out.println(name.isEmpty());
        System.out.println(name.contains("Alexey"));
        System.out.println(name.size());
        System.out.println(name);

    }
}
