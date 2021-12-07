package com.company.class26;

import java.util.ArrayList;

public class ArrayLIstDemo1 {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits=new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());
        for (Fruit f:fruits){
            f.printName();
        }
    }
}
class Fruit{
    void printName(){
        System.out.println("I am a fruit");
    }
}
class Apple extends Fruit{
    void printName(){
        System.out.println("I am apple");
    }}
class Orange extends Fruit{
    void printName(){
        System.out.println("I am orange");
    }
}