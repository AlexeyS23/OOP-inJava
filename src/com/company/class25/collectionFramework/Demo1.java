package com.company.class25.collectionFramework;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {


    String name="Hasim";
    String name2="Ahmet";
    String[]names={"Maryum", "Amram"};

        ArrayList<String> listOfNames=new ArrayList<>();
        System.out.println("Size of lisyOfNames "+ listOfNames.size());
        listOfNames.add("Mustafa");
        listOfNames.add("Aysha");
        listOfNames.add("Tammana");
        System.out.println("Size of lisyOfNames "+ listOfNames.size());

        listOfNames.remove("Tammana");
        System.out.println("Size of lisyOfNames "+ listOfNames.size());

}
}