package com.company.review12;

import java.util.LinkedHashSet;

public class SetDemo3 {
    public static void main(String[] args) {
        LinkedHashSet<Person>persons=new LinkedHashSet<>();
        persons.add(new Person("Naiya",16));
        persons.add(new Person("Hasim",22));
        persons.add(new Person("Aysha",16));
        persons.add(new Person("Alexey",26));

        System.out.println(persons);

        System.out.println(new Person("Naiya",16));
        persons.remove(new Person("Naiya",16));
        System.out.println(persons);
        persons.removeIf(p->p.name.contains("H"));// удалили Хасима
        System.out.println(persons);
        persons.forEach(p-> System.out.println(p));//print one by one

    }
}
