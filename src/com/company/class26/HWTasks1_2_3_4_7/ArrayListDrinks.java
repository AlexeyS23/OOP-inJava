package com.company.class26.HWTasks1_2_3_4_7;
//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

import java.util.ArrayList;

public class ArrayListDrinks {
    public static void main(String[] args) {
        ArrayList<String> drink = new ArrayList<>();
        drink.add("Milk");
        drink.add("Juice");
        drink.add("Gin");
        drink.add("Tea");
        drink.add("Whiskey");
        drink.add("Coffee");


        for (int i = 0; i < drink.size(); i++) {
            if(drink.get(i).contains("a")){
                //drink.replaceAll('a', "water");
                //drink.set(i,drink.get(i).replaceAll("Water"));
            }
            System.out.println(drink.get(i));



        }
    }}
