package com.company.class25.collectionFramework;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> subject1=new ArrayList<>();
        subject1.add("SDLC");
        subject1.add("Manual Testing");
        subject1.add("Java");
        subject1.add("GIT");
        subject1.add("Selenium");

        ArrayList<String>subject2=new ArrayList<>();

        subject2.add("TestNg");
        subject2.add("Cucumber");
        subject2.add("Sql");
        subject2.add("APIs");
        subject2.add("Docker");
        subject2.add("AWS");
        subject2.add("Mobile Testing");
        subject2.add("Mock Interview");

        ArrayList<String>subjects=new ArrayList<>();
        subjects.addAll(subject1);
        subjects.addAll(2,subject2);
        System.out.println(subjects);
        subject1.clear();
        subject2.clear();
        System.out.println(subject1);
        System.out.println(subject2);


    }
}
