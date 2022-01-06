package com.company.ReviewOfClass30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDemo5 {
    public static void main(String[] args) throws IOException {
        //Realitive path to the file always better
        String path="Files/Config.properties";
        //Reading the data in the form or raw bytes in the java program
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("Password"));
        properties.setProperty("URL2","www.facebook.com");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream, "Added new Property URL2");

// Обязательно использовать ФаилИнпутСтрим, иначе ФайлАутпут перезапишет новые даные!!!!

    }
}
