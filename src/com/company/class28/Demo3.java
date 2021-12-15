package com.company.class28;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(10,"Alexey");
        students.put(10,"Denis"); // must be qnic
        students.put(20,"Ahmet");
        students.put(100,"Henok");
        System.out.println(students);
    }
}
