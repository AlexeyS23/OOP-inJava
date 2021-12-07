package com.company.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {


    ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");

        Iterator<String>iterator=subjects1.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());





        //System.out.println(iterator.hasNext());
       // iterator.next();
       // iterator.remove();
       // System.out.println(iterator.next());
       // iterator.remove();
        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
        //System.out.println(subjects1);

}
}