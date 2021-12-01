package com.company.class19;

public class Employee {
    String name;
    int age;
    int baseSalary=30000;
    int baseNoDaysOf=20;

void printSalaru(){
    System.out.println(baseSalary);
}
void printNoDaysOff(){
    System.out.println(baseNoDaysOf);
}
}
class Manager extends Employee{
    int bonus=10;
    int travelingAllowance=200;

    void printSalary(){
        super.printSalaru();
        System.out.println(bonus+travelingAllowance);
    }
}