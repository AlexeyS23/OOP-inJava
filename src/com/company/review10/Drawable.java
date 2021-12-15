package com.company.review10;

public interface Drawable {
    //final void draw();  Added by the compiler auto, we can't use final with
  // private void draw(); not allowed; and protected tooo;
   //static void draw(); not allowed;
    //int paperSize; must assain; it's final!!!! NO CONSTRACTOR!!!
    //abstract  int paperSize=12; not allowed with filds anewhere!!!
    int paperSize=12; // filds are public static final by default;
    void draw();
    static void staticMethod(){
        System.out.println("I am a static method");
    }
    default  void defaultMethod(){
        System.out.println("I am a default method");
    }
    }
class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}