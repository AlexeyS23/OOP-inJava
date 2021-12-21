package com.company.review11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1_WithDescriptions {
    public static void main(String[] args) {
       List<String>list=new ArrayList<>();//if not planing poly
       ArrayList<String>drinks=new ArrayList<String>();
       drinks.add("Coke");
       drinks.add(0,"Pepsi"); //use it to add element at specific index
// if index not exist we will get the indexOotBound
        drinks.add("Fanta");
        System.out.println(drinks);
        drinks.remove("Fanta");
        System.out.println(drinks);
        drinks.remove(0);
        System.out.println(drinks);
        System.out.println(drinks.get(0));
        drinks.set(0,"Coke");//replace the eliment at this index
        System.out.println(drinks);



}
}