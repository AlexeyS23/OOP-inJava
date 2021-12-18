package com.company.class29;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        Set<String>list=new LinkedHashSet<>();
        list.add("chair");
        list.add("sky");
        list.add("tree");
        list.add("sky");

        StringBuilder values=new StringBuilder();
        for (String str:list
             ) {
            values.append(str);
        }
        System.out.println(values);
    }
}
