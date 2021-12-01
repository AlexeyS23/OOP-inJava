package com.company.class23;

public class Parent {
    private final String NAME = "Fatma";
    protected final int AGE = 20;
    public final double WEIGHT_OF_HUMAN = 30;
    final double HEIGHT = 5.4;
    static final int NO_OF_LEGS = 2;
    String hairColor="Black";

    private final void printName() {   //final is a same as private
        System.out.println(NAME);
    }

    final void printAge() {
        System.out.println(AGE);
    }

    protected final void printHeight() {
        System.out.println(HEIGHT);
    }

    public final void printWeight() {
        System.out.println(WEIGHT_OF_HUMAN);
    }
    public static final void printNoOfLegs(){
        System.out.println(NO_OF_LEGS);
        //System.out.println(WEIGHT_OF_HUMAN); no allowed bacause its instance field
    }
}
class Child extends Parent{
   // public static void printNoOfLegs(){
       // System.out.println("From Child"+NO_OF_LEGS);


   // }
    void printHairColor(){
        System.out.println("Black from CHILD");
    }
}