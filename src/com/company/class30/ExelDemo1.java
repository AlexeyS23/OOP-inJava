package com.company.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "Files/ExelData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path); // reading file-не убирать ошибку
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream); // loading file-убрать ошибку с помощью Адд эксепшн то начер!

        Sheet sheet = xssfWorkbook.getSheet("Лист1"); // the name of Sheet(Лист) on Excel file
        Row row = sheet.getRow(0); // position of row-строка
        Cell cell = row.getCell(1); // position of column/cell
        System.out.println(cell);

        fileInputStream.close();
    }
}
