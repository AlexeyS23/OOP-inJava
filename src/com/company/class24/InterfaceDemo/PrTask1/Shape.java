package com.company.class24.InterfaceDemo.PrTask1;
//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
// Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
// Test your code.
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    double p=3.14;
    double r=5.5;
    double area=p*(r*r);
    @Override
   public void calculateArea(){
        System.out.println("Area of Circle is "+area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter=2*p*r;
        System.out.println("Perimeter of Circle is "+perimeter);
    }
}
class Square implements Shape{
    double a=5;
    double area=a*a;
    @Override
    public void calculateArea() {
        System.out.println("Area of Square is "+area);
    }
    double perimeter=4*a;
    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter of Square is "+perimeter);
    }
}