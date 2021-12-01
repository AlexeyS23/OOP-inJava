package com.company.class21.poly;

public class CarTester {
    public static void main(String[] args) {
        //Car car=new BMW();
       // car.start();

        Car [] cars={new BMW(), new Tesla(),new Toyota()};
        for (Car car:cars) {
            car.start();
            car.park();
            car.stop();
        }

    }


}
