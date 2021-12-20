package com.company.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExelDemo7 {
    public static void main(String[] args) throws IOException {
        //Paths where we want to create a file
        String path="C:\\Users\\Anastasia\\IdeaProjects\\SDETBatch11\\Files\\Bath11\\Test.xlsx";
        //creating a object XSSWorkbook
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        //Creating new sheet inside file
        Sheet sheet = xssfWorkbook.createSheet("Sheet1");
        //creating a new rows inside sheet
        Row row = sheet.createRow(0);
        //creating new cells inside row 0
        Cell cell = row.createCell(0);
        //setting the data
        cell.setCellValue("Tese");
        //creating the output stream
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //storing the data to exel file
        xssfWorkbook.write(fileOutputStream);

    }
}
