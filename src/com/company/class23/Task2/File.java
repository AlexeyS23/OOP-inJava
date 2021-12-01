package com.company.class23.Task2;

public abstract class File {
    //Create a class File that will have the following behaviors:
    // open, edit, close. Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile
    // that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text,
    // to open .doc file we need Microsoft word to be installed etc

    abstract void open();

    void edit(){
        System.out.println("Edit a file");
    }
    void close(){
        System.out.println("Close a file");
    }
}
 class JavaFile extends File{
    //
    @Override
     void open(){
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}
 class WordFile extends File{
//
@Override
 void open(){
    System.out.println("to open .doc file we need Microsoft word to be installed etc");
}
}
 class PdfFile extends File{
    @Override
      void open(){
        System.out.println("bla bla bla");
    }



}