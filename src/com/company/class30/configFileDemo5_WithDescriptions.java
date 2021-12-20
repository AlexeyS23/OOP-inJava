package com.company.class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configFileDemo5_WithDescriptions {
    public static void main(String[] args) throws IOException {

        String path="Files/Config.properties";
        //Reading the data in the form of raw bytes in the java program
        FileInputStream fileInputStream=new FileInputStream(path); // см.строка 16
        Properties properties=new Properties();
        properties.load(fileInputStream);// если писать без этих команд, то данные которые были удалятся и будут только новые
        System.out.println(properties.getProperty("Password"));
        System.out.println(properties.getProperty("userName"));
        System.out.println("*******************************");
        properties.setProperty("URL","www.google.com");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"Added new Property URL");



    }

}
