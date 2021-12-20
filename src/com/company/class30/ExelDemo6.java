package com.company.class30;

import com.company.utils.ExelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExelDemo6 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anastasia\\IdeaProjects\\SDETBatch11\\Files\\ExelData.xlsx";
               List<Map<String,String>> exelData= ExelReader.read(path);
        System.out.println(exelData);
        System.out.println(exelData.get(1).get("LastName"));//если нужно достать только одно значение



    }
}
