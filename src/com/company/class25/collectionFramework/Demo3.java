package com.company.class25.collectionFramework;

public class Demo3 {

    public static void main(String[] args) {
        int primitiveNumber=10;
        Integer classNumber=primitiveNumber;
        System.out.println(classNumber);


        Integer number=new Integer(10); // boxing
        Integer number2=10; //auto in boxing
        int another=number.intValue(); //un boxing
        int another2=number2; //auto unboxing

        



    }
}
