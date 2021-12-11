package com.company.class26.HWTasks1_2_3_4_7;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

//How can you remove all duplicates from ArrayList?
//aList.add("John");
//aList.add("Jane");
//aList.add("James");
//aList.add("Jasmine");
//aList.add("Jane");
//aList.add("James");

public class RemoveAllDuplicates {
    public static void main(String[] args) {
    ArrayList<String>aList=new ArrayList<>();
    aList.add("John");
    aList.add("Jane");
    aList.add("James");
    aList.add("Jasmine");
    aList.add("Jane");
    aList.add("James");
    aList.retainAll(aList);


        LinkedHashSet<String>List=new LinkedHashSet<>();
        List.addAll(aList);
        System.out.println(List);




    }

}
