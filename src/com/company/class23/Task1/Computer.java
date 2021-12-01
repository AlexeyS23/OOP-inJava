package com.company.class23.Task1;

import java.util.logging.SocketHandler;

public class Computer {
    String model;
    Computer (String model){
        this.model=model;
        }
        void operatingSystem(){
            System.out.println(model+"Has operating system");
        }
        void playVideo(){
            System.out.println("Can play videos");
        }
}
// class Apple extends Computer{
  //  Apple(String model){
    //    super(model);
   // }
 //  @Override
    //void operationSystem(){
    //   System.out.println(model+ "has MacOs");
   // }
//}
