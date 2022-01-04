package com.company.review12;

import java.util.Collections;
import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(20);//Duplicateds are not allowed so it will be ignored
        hashSet.add(30);

        hashSet.removeIf(x->x>10);
        System.out.println(hashSet);

        // hashSet.removeIf(x->true);
        //        System.out.println(hashSet);
    }
}
