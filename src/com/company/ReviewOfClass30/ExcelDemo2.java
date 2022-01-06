package com.company.ReviewOfClass30;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anastasia\\IdeaProjects\\SDETBatch11\\Files\\ExelData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Лист1");
        //how many rows are not enpty
        int noOfRows = sheet1.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        //all the rows one by one
        for (int i = 0; i < noOfRows; i++) {
            XSSFRow row = sheet1.getRow(i);
            int noOfCells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                System.out.print(row.getCell(j)+" ");

            }
            System.out.println();
        }



    }
}
