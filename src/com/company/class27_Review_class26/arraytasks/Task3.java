package com.company.class27_Review_class26.arraytasks;
import java.util.ArrayList;
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList <>();
        arrayList.add("Tea");
        arrayList.add("Coffee");
        arrayList.add("Soft drinks");
        arrayList.add("Pepsi");
        arrayList.add("Water");
        arrayList.add("Hot Chocolate");
        arrayList.add("Lemon Tea");

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).toLowerCase().contains("e")||arrayList.get(i).toLowerCase().contains("a")){
                arrayList.set(i,"Water");
            }
        }
        System.out.println(arrayList);

        //One more ex..
        //for (int i = 0; i < arrayList.size(); i++) {
        //    if(arrayList.get(i).toLowerCase().replaceAll("[aeifdnk]","").length()< arrayList.get(i).length()){
        //        arrayList.set(i,"Water");
        //    }
        //}
        //System.out.println(arrayList);
    }
}
