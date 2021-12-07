package com.company.class25.collectionFramework;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> subject=new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("GIT");
        //subject.add("Selenium");
        subject.add("TestNg");
        subject.add("Cucumber");
        subject.add("Sql");
        subject.add("APIs");
        subject.add("Docker");
        subject.add("AWS");
        subject.add("Mobile Testing");
        subject.add("Mock Interview");
        System.out.println(subject);
        subject.add(4,"Selenium");
        System.out.println(subject);
    }
}
