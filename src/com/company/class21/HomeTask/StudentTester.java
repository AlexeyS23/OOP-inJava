package com.company.class21.HomeTask;

public class StudentTester {
    public static void main(String[] args) {
        Student []student={new syntaxStudent(), new collegeStudent(),new schoolStudent()};
        for (Student S: student){
            S.read();
            S.learn();
            S.write();

        }
        System.out.println("*****************************");
        schoolStudent school=new schoolStudent();
        schoolStudent ch=(schoolStudent) school;
        ch.play();

        System.out.println("*****************************");
        collegeStudent college=new collegeStudent();
        collegeStudent col=(collegeStudent) college;
        col.sport();

        System.out.println("*****************************");
        syntaxStudent syntax=new syntaxStudent();
        syntaxStudent syn=(syntaxStudent) syntax;
        syn.study();



    }
}
