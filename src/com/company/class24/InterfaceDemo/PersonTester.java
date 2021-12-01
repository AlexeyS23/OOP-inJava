package com.company.class24.InterfaceDemo;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new SDETInstructor();
        person.sleep();
        person.eat();
        //person.teach();- not person

        Employee employee=new SDETInstructor();
        employee.work();
       // employee.eat(); not employee

        SyntaxEmployee syntaxEmployee=new SDETInstructor();
        syntaxEmployee.teach();
        syntaxEmployee.eat();
        syntaxEmployee.sleep();
        syntaxEmployee.work();

        SDETInstructor sdetInstructor=new SDETInstructor();
        sdetInstructor.teach();
        sdetInstructor.eat();
        sdetInstructor.sleep();
        sdetInstructor.work();
        }

            }



