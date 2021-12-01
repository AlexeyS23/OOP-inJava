package com.company.class19.HomeWork2;

public class Shape {
    int radius;
    Shape (int radius){
        this.radius=radius;
           }


}
  class circle extends Shape {
  double pi;
   circle (int radius, double pi){
       super(radius);

       this. pi=pi;
        }

    void S() {
        System.out.println("The area of circle: "+pi * (radius * radius));
    }
}



