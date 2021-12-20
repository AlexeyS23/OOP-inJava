package com.company.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExelReader {
    public static List<Map<String,String>> read(String path) throws IOException {
        return read(path,"Лист 1");
    }
    public static List<Map<String,String>> read() throws IOException {
        return read("Files/ExelData.xls", "Лист 1");
    }
    public static List<Map<String,String>> read(String path, String sheetName) throws IOException {
        //Reading the row data from path parametr
        FileInputStream fileInputStream=new FileInputStream(path);
        //ussing XSSWorkbook class to convert that data to Exel format
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //Getting a sheet from Exel file
        XSSFSheet sheet1 = xssfWorkbook.getSheet(sheetName);
        // geting a number of rows that actualy contains data
        int noOfRows = sheet1.getPhysicalNumberOfRows();//номера строк, которые заполнены
        //creating a list of maps to store the data from Exel file inside java program
        List<Map<String,String>> exelData=new ArrayList<>(); // 2-й пример (Выводим как Лист Мепс)
        //System.out.println(noOfRows);
        //Getting row zero to get the header so that we can use it as keys in map
        Row row0=sheet1.getRow(0);
        //loop to get all the rows starting from row 1 by one
        for (int i = 1; i <noOfRows ; i++) {
            //getting the row one by one and storing them in row variable
            XSSFRow row = sheet1.getRow(i);
            //creating a new map for each row to store its data
            LinkedHashMap<String,String> hashMap=new LinkedHashMap<>(); //2-й пример
            //getting the count of actual cell yhat contain the data
            int noCells=row.getPhysicalNumberOfCells();
            // looping throw all the cells to get the data
            for (int j = 0; j < noCells; j++) {
                //inserting the data inside the map from a row
                hashMap.put(row0.getCell(j).toString(),row.getCell(j).toString());
            }
            //storing the that map to the list
            exelData.add(hashMap);
        }
        //System.out.println(exelData);

        // closing the file so that other programs can use it
        fileInputStream.close();
        // return the data
        return exelData;
    }}
