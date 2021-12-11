package com.company.class26.HWSetTask1_2_3;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class namesCountries {
    //Create a Set collection in which you need to add names of the countries.
    //In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.
    public static void main(String[] args) {

        TreeSet<String> country=new TreeSet<>();
        country.add("Germany");
        country.add("Italy");
        country.add("France");
        country.add("Spain");
        country.add("Belgium");
        country.add("Ukraine");
        country.add("Turkey");
        System.out.println(country);
        country.retainAll(country);
        LinkedHashSet<String>country2=new LinkedHashSet<>();
        country2.addAll(country);
        System.out.println(country2);
    }
}
