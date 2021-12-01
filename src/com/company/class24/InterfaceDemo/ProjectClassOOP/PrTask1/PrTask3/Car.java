package com.company.class24.InterfaceDemo.ProjectClassOOP.PrTask1.PrTask3;
// Create a Class Car that would have the following fields:
//carPrice and color and method calculateSalePrice() which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck.
// The Truck class has field as weight and has its own implementation of calculateSalePrice() method
// in which returned price calculated as following:
//if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
// The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
// if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

public abstract class Car {
double carPrice;
String color;
Car (double carPrice){
    this.carPrice=carPrice;
}
abstract void calculateSalePrice();
}
class Truck extends Car {
    double weight;
    Truck(double carPrice, double weight){
        super(carPrice);
        this.weight=weight;
    }
    void calculateSalePrice(){
        if (weight>2000){
            System.out.println("Your Truck more than 2000, you get 10% discont. Now it cost: "+(carPrice-carPrice*0.1)+"$");
        } else if(weight<=0){
            System.out.println("Such a machine does not exist ");
        }else {
            System.out.println("Your Truck less than 2000, you get 20% discont. Now it cost: "+(carPrice-carPrice*0.2)+"$");
        }
    }
}
class Sedan extends Car{
    double length;
    Sedan(double carPrice, double length) {
        super(carPrice);
        this.length=length;
    }
    @Override
    void calculateSalePrice() {
        if (length>20){
            System.out.println("Your sedan is more than 20 feet, you get 5% discont. Now it cost: "+(carPrice-carPrice*0.05)+"$");
        } else if(length<=0){
            System.out.println("Such a machine does not exist ");
        }else {
            System.out.println("Your sedan is less than 20 feet, you get 10% discont. Now it cost: "+(carPrice-carPrice*0.1)+"$");
        }
    }
}