package com.company.class27_Review_class26.Task7;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Names {

        public static void main(String[] args) {
            ArrayList<String> aList = new ArrayList<>();
            aList.add("John");
            aList.add("Jane");
            aList.add("James");
            aList.add("Jasmine");
            aList.add("Jane");
            aList.add("James");

            Set<String>set=new LinkedHashSet<>(aList);
            System.out.println(set);



        }
        }
