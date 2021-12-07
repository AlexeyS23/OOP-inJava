package com.company.class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("TestNg");
        subjects1.add("Cucumber");
        subjects1.add("Sql");
        subjects1.add("APIs");

        ArrayList<String> subjects2=new ArrayList<>();

        subjects2.add("TestNg");
        subjects2.add("Cucumber");
        subjects2.add("Sql");
        subjects2.add("APIs");
        subjects2.add("Docker");
        subjects2.add("AWS");
        subjects2.add("Mobile Testing");
        subjects2.add("Mock Interview");
        subjects1.retainAll(subjects2);
        System.out.println(subjects1);
        subjects2.retainAll(subjects1);
        System.out.println(subjects2);
    }
}
