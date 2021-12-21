package com.company.class30.HW;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//Create a property file to store following configurations:
//browser=chrome
//url=https://facebook.com
//username
//password
//Read file and extract values of browser & url
public class Task1 {
    public static void main(String[] args) throws IOException {
        String path="Files/Facebook.properties";
        Properties properties=new Properties();
        properties.put("username","Alex");
        properties.put("password","pas123");
        properties.put("browser","chrome");
        properties.put("url","https://facebook.com");

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream, "Creating a HomeWork file");

        System.out.println("The browser we are using: "+properties.get("browser"));
        System.out.println("URL is: "+properties.get("url"));

        fileOutputStream.close();




    }

}
