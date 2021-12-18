package com.company.class28.HW.task3;

import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {

        TreeMap<Double, String> person1 = new TreeMap<>();
        Person p1=new Person("Alexey", "Sitalo", 38.5, 99000.00);
        String value1=p1.userInformation();
        person1.put(44444.44,value1);
        //p1.setAge();



       // Person obj1 = new Person("Alexey","Sitalo",28,8540.50);
        //String value1 = obj1.userInformation();
        //object.put(,value1);


   // FacebookAccount fb= new FacebookAccount();
        //        fb.setUserName("asasasasasasasasas");

    }
}
