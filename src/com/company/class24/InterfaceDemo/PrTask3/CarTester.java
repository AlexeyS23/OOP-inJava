package com.company.class24.InterfaceDemo.PrTask3;

public class CarTester {
    public static void main(String[] args) {
        Car truck = new Truck(100, 2000);
        truck.calculateSalePrice();
        Car sedan=new Sedan(50,19.5);
        sedan.calculateSalePrice();
    }
}
