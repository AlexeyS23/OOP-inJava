package com.company.class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo1 {
    public static void main(String[] args) throws IOException {
        //location of the file inside our project
        String path="Files/Config.properties";
        //create navigation to the file
        FileInputStream fileInputStream=new FileInputStream(path);
        //use to read the data
        Properties properties=new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.get("userName"));
        System.out.println(properties.get("Password"));

fileInputStream.close();

    }
}
