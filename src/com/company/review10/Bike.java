package com.company.review10;

public class Bike {
    static int SPEED_LIMIT;// i can't change value, but inheritens ovveride;
    static int baseLimit=20;

    static {
        SPEED_LIMIT=baseLimit+80; // initilaize bloooks// for static fields for calc...
    }
    {
        maxSeatingCapacity=200;
    }
   final int maxSeatingCapacity;
   Bike (int maxSeatingCapacity ){
       //this.maxSeatingCapacity=maxSeatingCapacity;
       //this.SPEED_LIMIT=SPEED_LIMIT; //can't initialize static final fields
   }
    static void run (){
        System.out.println("Honda Bike can run "+ SPEED_LIMIT);
    }

}
class HondaBike extends Bike{
   static int SPEED_LIMIT=200;// overriden // static for hiding

    HondaBike(int maxSeatingCapacity) {
        super(maxSeatingCapacity);
    }

    static  void run(){
        //SPEED_LIMIT=300; - errorr;
        System.out.println("Honda Bike can run "+SPEED_LIMIT); //super keyword;
    }// inheritence
}
class Main {
    public static void main(String[] args) {
        HondaBike hondaBike=new HondaBike(50);
        hondaBike.run();
    }
}
