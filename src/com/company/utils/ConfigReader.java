package com.company.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String read (String path, String key) throws IOException {

        //opening that file
            FileInputStream fileInputStream = new FileInputStream(path);
            //create the object of Properties class
            Properties properties = new Properties();
            //loading all the proporities fron that file inside the object
            properties.load(fileInputStream);
            //geting the value for specific key and returning it
            return properties.getProperty(key);

        }
        public static String read(String key) throws IOException {
        return read("Files/Config.properties",key);

        }

}


