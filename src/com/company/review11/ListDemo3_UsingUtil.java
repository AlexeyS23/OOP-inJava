package com.company.review11;

import com.company.utils.ArraysUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo3_UsingUtil {
    public static void main(String[] args) {
        int[]arr={10,5,3,4,25};
        ArrayList<Integer>arrayList=ArraysUtil.convertToArrayList(arr);
        System.out.println(arrayList);



    }
}
