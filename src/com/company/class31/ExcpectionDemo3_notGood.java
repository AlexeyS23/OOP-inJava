package com.company.class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcpectionDemo3_notGood {
    public static void main(String[] args) throws FileNotFoundException {
        String path="Files/Tramp.properties";
        File file=new File(path);
        if (file.exists()){
            System.out.println("Yes file exist");
            FileInputStream fileInputStream=new FileInputStream(path);
        }else {
            System.out.println("No exist");
        }



    }
}
