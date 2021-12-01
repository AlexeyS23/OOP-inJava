package com.company.class19.HomeWork1;

public class userClass {
    String name;
    int number;


            }

class userInfo extends userClass {
    String address;

    userInfo(String name,int number, String address){
        this.name=name;
        this.number=number;
        this.address=address;
            }
    void print(){
        System.out.println(name+" "+number+" "+address);
    }
}