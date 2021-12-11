package com.company.class27_Review_class26.arraytasks;
import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Lamp");
        arrayList.add("Purple");
        arrayList.add("Love");
        arrayList.add("Leve");
        // remove e wrom letters with e
        //for (int i = 0; i < arrayList.size(); i++) {
            //String str= arrayList.get(i);
            //if (str.toLowerCase().endsWith("e")){
               // arrayList.set(i,str.substring(0,str.length()-1));
           // }
       // }
      //  System.out.println(arrayList);

        //remove e to F
        //for (int i = 0; i < arrayList.size(); i++) {
            //String str= arrayList.get(i);
            //if (str.toLowerCase().contains("e")){
                //arrayList.set(i,str.replace("e","F"));
            //}

        //}

        Iterator<String>iterator=arrayList.iterator();
        while (iterator.hasNext()){
            String word=iterator.next();
            if (word.toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
