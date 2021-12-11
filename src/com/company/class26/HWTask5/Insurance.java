package com.company.class26.HWTask5;
//Create a class Insurance that will have an attribute as insuranceName
//and unimplemented behaviour as getQuote and cancelInsurance.
//Create 3 subclasses Car, Pet, Health.
// Car class has it’s own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Insurance<insuranceName> {
    String insuranceName;
    Insurance (String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
    }
    class Car extends Insurance{
    String carModel;

        Car(String insuranceName, String carModel) {
            super(insuranceName);
            carModel=carModel;
        }

        @Override
        void getQuote() {
            System.out.println(insuranceName+" "+carModel+ " A car to drive");
        }
        @Override
        void cancelInsurance() {
            System.out.println("For breaking the rules ");
        }
    }

    class Pet extends Insurance{
    String petType;

        Pet(String insuranceName,String petType) {
            super(insuranceName);
            this.petType=petType;
        }


        @Override
        void getQuote() {
            System.out.println(petType+" like bark");
        }

        @Override
        void cancelInsurance() {
            System.out.println("I don't know what can I say about cancelInsurance");
        }
    }
    class Health extends Insurance{

        Health(String insuranceName) {
            super(insuranceName);
        }

        @Override
        void getQuote() {
            System.out.println("Strong health");
        }

        @Override
        void cancelInsurance() {
            System.out.println("Must have insurance");

        }
    }




