package com.company.class20.methodoverriding;

public class parent {
    String name ="sdet";
    void printname (){
        System.out.println("name is "+name);
    }
    void getMarried (){
        System.out.println("ahmet will get married by my choice");

    }

}
class Child extends parent{

    String name="Ahmet";
    void printname (){
        String name="Sharif";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    @Override
    void getMarried (){
        System.out.println("But I like someone else");
    }
    void letsDoSomethingCrazy(){
        super.getMarried();
        getMarried();
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.getMarried();
        child.letsDoSomethingCrazy();


    }
}
