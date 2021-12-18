package com.company.class28.HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
       //Create a Map that will store Employee name and salary.
        // Write a logic to retrieve an employee who gets the highest salary.
        // Output should be in the below format
        //John Smith=$100000

        HashMap<String,Double>cardSalary=new HashMap<>();
        cardSalary.put("Sorbon", 150300.50);
        cardSalary.put("Alexey", 99000.00);
        cardSalary.put("Asghar", 149000.99);
        cardSalary.put("Moazzam",155000.00);
        cardSalary.put("Ahmet",145000.00);

        Set<Map.Entry<String, Double>> entrySet = cardSalary.entrySet();
        Map.Entry<String, Double> highSalary = null;
        for (Map.Entry<String, Double> entry : entrySet
        ) {
            if (highSalary == null || entry.getValue().compareTo(highSalary.getValue()) > 0) {
                highSalary = entry;
            }
        }
        System.out.println(highSalary.getKey() + "=$" + highSalary.getValue());


    }

}
