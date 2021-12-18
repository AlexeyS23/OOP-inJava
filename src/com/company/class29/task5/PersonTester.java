package com.company.class29.task5;

import java.util.Collection;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {

        TreeMap<Integer,Person>personTreeMap=new TreeMap<>();
        Person person = new Person("Jimmy", "Castro", 30, 500000);
        Person person1 = new Person("Sebastian", "Castro", 4, 1000000);
        Person person2 = new Person("Mateo", "Castro", 5, 500000);
        Person person3 = new Person("Carolina", "Rojas", 30, 800000);

        personTreeMap.put(1,person);
        personTreeMap.put(20,person1);
        personTreeMap.put(30,person2);
        personTreeMap.put(15,person3);

        Collection<Person> value= personTreeMap.values();
        for (Person values: value
             ) {
            System.out.println(value);
        }


    }
}
