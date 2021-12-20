package com.company.class30;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExelDemo3 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anastasia\\IdeaProjects\\SDETBatch11\\Files\\ExelData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Лист1");
        int noOfRows = sheet1.getPhysicalNumberOfRows();//номера строк, которые заполнены
        List<Map<String,String>> exelData=new ArrayList<>(); // 2-й пример (Выводим как Лист Мепс)
        System.out.println(noOfRows);
        for (int i = 0; i <noOfRows ; i++) {
            XSSFRow row = sheet1.getRow(i);
            HashMap<String,String>hashMap=new HashMap<>(); //2-й пример
            int noCells=row.getPhysicalNumberOfCells(); // Выключить этот луп для 2 примера
            hashMap.put("FirstName",row.getCell(0).toString());// 2-й пример
            hashMap.put("LasttName",row.getCell(1).toString());// 2-й пример
            hashMap.put("Age",row.getCell(2).toString());// 2-й пример
            hashMap.put("City",row.getCell(3).toString());// 2-й пример
            for (int j = 0; j <noCells ; j++) { // Выключить этот луп для 2 примера
                System.out.print(row.getCell(j)+" ");// Выключить этот луп для 2 примера
                exelData.add(hashMap); // 2-й пример

            }
            System.out.println();// Выключить этот луп для 2 примера
            System.out.println(exelData);
            fileInputStream.close();
        }
// Еще один вариант 2 примера для Лист лупс
        //Скопированно с 22 строки

        ////System.out.println(noOfRows);
       // for (int i = 0; i <noOfRows ; i++) {
        //ROW row0=sheet1.getROW(0);
           // XSSFRow row = sheet1.getRow(i);
           // HashMap<String,String>hashMap=new HashMap<>(); //2-й пример

           // hashMap.put(row0.getCell(0).tjString,row.getCell(0).toString());// 2-й пример
            //hashMap.put(row0.getCell(1).tjString,row.getCell(1).toString());// 2-й пример
          //  hashMap.put(row0.getCell(2).tjString,row.getCell(2).toString());// 2-й пример
           // hashMap.put(row0.getCell(3).tjString,row.getCell(3).toString());// 2-й пример
           // exelData.add(hashMap); // 2-й пример

            }

            //System.out.println(exelData);

    }

