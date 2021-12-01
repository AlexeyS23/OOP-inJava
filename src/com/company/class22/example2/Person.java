package com.company.class22.example2;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
   void eat(){
       System.out.println(name+" eating");
   }
    void performDailyTasks (){
        System.out.println(name+" Eat sleep repeat");
    }

}
class Employee extends Person{
    Employee(String name){
        super (name);
            }
    void performDailyTasks (){
        System.out.println(name+" Work hard");
    }
    }
    class Student extends Person{
    Student (String name){
        super(name);

    }
        void performDailyTasks (){
            System.out.println(name+" Attending the class at day reading at night");
        }
    }
    class Teacher extends Person{
    Teacher (String name){
        super(name);
    }
        void performDailyTasks (){
            System.out.println(name+" Do a home work every day");
        }
        void design () {
            System.out.println(name + " Do a design");
        }}