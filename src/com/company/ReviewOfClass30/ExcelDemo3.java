package com.company.ReviewOfClass30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anastasia\\IdeaProjects\\SDETBatch11\\Files\\ExelData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Лист1");
        //how many rows are not enpty
        int noOfRows = sheet1.getPhysicalNumberOfRows();

       List<Map<String,String>> excelData=new ArrayList<>();
        System.out.println(noOfRows);

        Row row0=sheet1.getRow(0);// получать данные с 1 строки//если не писать этот код, просто вводи, то что написанно на 35 и 36.

        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row = sheet1.getRow(i);
            HashMap<String,String> hashMap=new HashMap<>();
            int noOfCells = row.getPhysicalNumberOfCells();
            hashMap.put(row0.getCell(0).toString(), row.getCell(0).toString());
            hashMap.put(row0.getCell(1).toString(), row.getCell(1).toString());
            hashMap.put("Age", row.getCell(2).toString());
            hashMap.put("City", row.getCell(3).toString());

            excelData.add(hashMap);
        }
        System.out.println(excelData);



    }
}
