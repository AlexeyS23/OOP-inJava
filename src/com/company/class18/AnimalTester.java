package com.company.class18;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="Boby";
        dog.bark();
        dog.sleep();

        Cat cat=new Cat();
        cat.name="Texy";
        cat.meow();
        System.out.println(dog.name);
    }
}
