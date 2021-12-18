package com.company.class28.HW.task3;
// Create a Person class with following private fields: name, lastName, age, salary.
// Variables should be initialized through constructor.
// Inside the class also create a method to print user details.
// In Test Class create a Map that will store key in ascending order.
// In that map store personId and a Person Object. Print each object details.
public class Person {
    private String name;
    private String lastName;
    private Double age;
    private Double salary;

    public Person(String name, String lastName, Double age, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String userInformation() {
        System.out.println(name + lastName + age);

        return null;
    }
}



