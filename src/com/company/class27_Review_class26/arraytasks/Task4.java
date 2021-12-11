package com.company.class27_Review_class26.arraytasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer>evenNum=new ArrayList<>();
        for(int i=2; i<=50; i=i+2){
           // if (i%5!=0){
                evenNum.add(i);
           // }
                        }
        System.out.println(evenNum);

        Iterator<Integer>iterator=evenNum.iterator();
        while (iterator.hasNext()){
            Integer number=iterator.next();
            if (number%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNum);
    }
}
