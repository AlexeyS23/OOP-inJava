package com.company.class24.InterfaceDemo.Interfase4;

public interface I1 {
    void method();
    static void method2(){
        System.out.println("I am method 2 from interfase 1");
    }
}
interface I2{
    void method();
    static void method2(){
        System.out.println("I am method 2 from interfase 2");
    }

}
class Test implements I1,I2{
    @Override
    public void method(){
        System.out.println("I will call for both methods from both classes");
    }
}
class Main{
    public static void main(String[] args) {
        I1 i1=new Test();
        i1.method();
       I2 i2=new Test();
          i2.method();
          I1.method2();
          I2.method2();

       }
   }
