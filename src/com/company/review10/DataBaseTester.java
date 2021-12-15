package com.company.review10;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new MySQLServer(50);
        dataBase.openDataBase();
        dataBase.readDataBase();
        dataBase.editDataBase();
        dataBase.closeDataBase();

        DataBase dataBase1=new GoodleDataBase(40);
        dataBase1.openDataBase();
        dataBase1.readDataBase();
        dataBase1.editDataBase();
        dataBase1.closeDataBase();
    }
}
