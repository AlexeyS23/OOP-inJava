package com.company.class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo2 {
    public static void main(String[] args) throws IOException {

        String path="D:\\Games\\Config.properties";

        FileInputStream fileInputStream=new FileInputStream(path);

        Properties properties=new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.get("UserName"));
        //System.out.println(properties.get(""));
        fileInputStream.close();
    }
}
