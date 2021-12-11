package com.company.class26.HWTasks1_2_3_4_7;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of words. Remove every word that ends with “e”.
public class ArrayListWords {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Apple");
        word.add("Car");
        word.add("Woman");
        word.add("File");
        word.add("Quizze");
        word.add("Star");

       // word.removeIf(words -> words.endsWith("e")); - More short code;
        Iterator<String>iterator=word.iterator();
        while (iterator.hasNext()) {
            String words = iterator.next();
            if (words.endsWith("e")) {
                iterator.remove();
            }
        }
               System.out.println(word);
    }
}