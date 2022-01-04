package com.company.class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        String path="Files/Tramp.properties";
        File file=new File(path);
        try{
            System.out.println("Yes file exist");
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch (FileNotFoundException e){
            System.out.println("Not exist");
        }
        System.out.println("Last line");
    }
}
