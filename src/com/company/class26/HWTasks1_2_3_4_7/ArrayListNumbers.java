package com.company.class26.HWTasks1_2_3_4_7;

import java.util.ArrayList;

//Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
public class ArrayListNumbers {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>();
        for (int a=2; a<=50; a+=2){
            if (a%5!=0){
                num.add(a);
            }
        }System.out.println(num);
    }
}
