package com.company.class27_Review_class26.Task5;

public abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;

    public Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    @Override
    public void getQuote() {
        System.out.println(carModel+insuranceName);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Cancels the incurance"+carModel);
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }
    @Override
    public void getQuote() {
        System.out.println(petType+insuranceName);
    }
    @Override
    public void cancelInsurance() {
        System.out.println(petType);
    }
}
class Health extends Insurance{
    public Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    public void getQuote() {
        System.out.println(insuranceName);
            }
    @Override
    public void cancelInsurance() {
        System.out.println("NO"+insuranceName);
    }
}