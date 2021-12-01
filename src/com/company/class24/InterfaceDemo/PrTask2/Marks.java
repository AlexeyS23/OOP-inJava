package com.company.class24.InterfaceDemo.PrTask2;
//We have to calculate the average of marks obtained in three subjects by student A and by student B.
// Create class 'Marks' with an abstract method 'getPercentage'
// that will be returning the average percentage of marks.
// Provide implementation of abstract method in classes 'A' and 'B'.
// The constructor of student A takes the marks in three subjects as its parameters
// and the marks in four subjects as its parameters for student B. Test your code
public abstract class Marks {
abstract void getPersentage();
}
class A extends Marks{
    double a1;
    double a2;
    double a3;

    A (double a1,double a2, double a3){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
    }
    @Override
    void getPersentage(){
        double gradeA=(a1+a2+a3)/3;
        System.out.println("Marks of student A: "+a1+", "+a2+", "+a3+", and a Grade is: "+gradeA);
    }
}
class B extends Marks{
    double b1;
    double b2;
    double b3;
    double b4;

    B (double b1,double b2, double b3, double b4){
        this.b1=b1;
        this.b2=b2;
        this.b3=b3;
        this.b4=b4;
    }
    @Override
       void getPersentage(){
        double gradeB=(b1+b2+b3+b4)/4;
        System.out.println("Marks of student B: "+b1+", "+b2+", "+b3+", "+b4+", and a Grade is: "+gradeB);
    }
}