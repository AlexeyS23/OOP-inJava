package com.company.class30.HW;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskWithExel {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anastasia\\IdeaProjects\\SDETBatch11\\Files\\Bath11\\HWClass30.xlsx";
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("Sheet1");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Testq");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);


    }
}
