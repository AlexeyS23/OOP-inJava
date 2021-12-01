package com.company.class23.Task2;

public class FileTester {
    public static void main(String[] args) {
        File [] files={new JavaFile(),new WordFile(),new PdfFile()};
        for (File f:files){
            f.open();
            f.close();
            f.edit();
        }
    }
}
