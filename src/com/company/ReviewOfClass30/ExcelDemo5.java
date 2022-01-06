package com.company.ReviewOfClass30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelDemo5 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anastasia\\IdeaProjects\\SDETBatch11\\Files\\ExelData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Лист1");
        int noOfRows = sheet1.getPhysicalNumberOfRows();//номера строк, которые заполнены
        List<Map<String,String>> exelData=new ArrayList<>(); // 2-й пример (Выводим как Лист Мепс)
        System.out.println(noOfRows);
        Row row0=sheet1.getRow(0);
        for (int i = 1; i <noOfRows ; i++) {
            XSSFRow row = sheet1.getRow(i);
            LinkedHashMap<String,String> hashMap=new LinkedHashMap<>(); //2-й пример

            int noCells=row.getPhysicalNumberOfCells();

            for (int j = 0; j < noCells; j++) {

                hashMap.put(row0.getCell(j).toString(),row.getCell(j).toString());
            }
            exelData.add(hashMap);
        }
        System.out.println(exelData);

        fileInputStream.close();
    }}



