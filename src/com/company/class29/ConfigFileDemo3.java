package com.company.class29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo3 {
    public static void main(String[] args) throws IOException {

        String path="Files/Tramp.properties";
        Properties properties=new Properties();
        properties.put("userName","Alex");
        properties.put("password","pas123");


        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream, "Creating a new file");

fileOutputStream.close();


    }
}
