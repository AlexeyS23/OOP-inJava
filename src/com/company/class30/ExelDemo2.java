package com.company.class30;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDemo2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anastasia\\IdeaProjects\\SDETBatch11\\Files\\ExelData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Лист1");
        int noOfRows = sheet1.getPhysicalNumberOfRows();//номера строк, которые заполнены
        System.out.println(noOfRows);
        for (int i = 0; i <noOfRows ; i++) {
            XSSFRow row = sheet1.getRow(i);
            int noCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noCells ; j++) {
                System.out.print(row.getCell(j)+" ");

            }
            System.out.println();
            fileInputStream.close();
        }


    }
}
