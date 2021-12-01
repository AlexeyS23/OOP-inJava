package com.company.class21.HomeTask;
   //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
        //Define common behavior within parent class and override some of the methods in child classes
        //Define some methods specific to child classes
       // Write example of achieving run time polymorphism

public class Student {
    void read(){
        System.out.println("Can read well");
    }
    void write (){
        System.out.println("Can write well");
    }
    void learn(){
        System.out.println("Studies various sciences  ");
    }

}

class syntaxStudent extends Student {
    void read(){
        System.out.println("Syntax student must always read slides");
    }
    void write(){
        System.out.println("Syntax student must always write hometasks");
    }
    void learn(){
        System.out.println("Syntax student must learn all rules");
    }
    void study(){
        System.out.println("Some Syntax student have lectures at night ");
    }
}

class collegeStudent extends Student {
    void read() {
        System.out.println("College Student must read many books");
    }

    void write() {
        System.out.println("College Student must write hometasks");
    }

    void learn() {
        System.out.println("College Student must learn a lot");
    }
    void sport() {
        System.out.println("College Student plays at different sport teams");
    }
}
class schoolStudent extends Student{
    void read(){
        System.out.println("School Student must read books");
    }
    void write(){
        System.out.println("School Student must write notes");
    }
    void learn(){
        System.out.println("School Student must learn all rules");
}
    void play() {
        System.out.println("School Student play a lot off games");
    }
}