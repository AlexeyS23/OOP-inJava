package com.company.class26.HWSetTask1_2_3;

import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;

//Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;
public class cities {
    public static void main(String[] args) {
        TreeSet<String>city=new TreeSet<>();
        city.add("Kiev");
        city.add("Atlanta");
        city.add("Lviv");
        city.add("Chicago");
        city.add("Ankara");
        city.add("France");
        city.add("Athens");
        System.out.println(city);

        Iterator<String>iterator=city.iterator();
        while (iterator.hasNext()){
            String element=iterator.next();
            if (element.toUpperCase().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(city);
    }
}
