package com.company.class22.task1;

public class Student {
    void study(){
        System.out.println("Student must study");
    }
    void doHomeWork(){
        System.out.println("Student must do homework");
    }
    void practice (){
        System.out.println("Student must practice");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Student must study 25 hours a week");
    }
    @Override
    void doHomeWork(){
        System.out.println("Student must solve repls");
    }
    void doResearch(){
        System.out.println("Syntax student must do additional research");
    }
}
class CollegeStudent extends Student{
    void doHomeWork(){
        System.out.println("Collage Student must do homework");
    }
}
class SchoolStudent extends Student{

}