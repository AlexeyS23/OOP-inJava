package com.company.class23.abstraction;

public class VenicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("132xl","Sedan", "BMW","X%");
        bmw.printVehicleCount();
        bmw.speed();
        bmw.start();
        bmw.drive();
        bmw.stop();

        Vehicle toyota=new Toyota("452ty", "Sedan", "Toyota", "Corola");


    }
}
