package com.company.review10;

public abstract class DataBase {
    int numberOfConnections;
    DataBase (int numberOfConnections){
        this.numberOfConnections=numberOfConnections;
    }
    abstract void openDataBase();
    abstract void readDataBase();
    abstract void editDataBase();
    abstract void closeDataBase();

}
class MySQLServer extends DataBase{

    MySQLServer(int numberOfConnections) {
        super(numberOfConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the DataBace from Microsoft");
    }

    @Override
    void readDataBase() {
        System.out.println("Reading the DataBace from Microsoft");
    }

    @Override
    void editDataBase() {
        System.out.println("Eding the DataBace from Microsoft");
    }

    @Override
    void closeDataBase() {
        System.out.println("Close the DataBace from Microsoft");
    }
}
class InformixDataBase extends DataBase{

    InformixDataBase(int numberOfConnections) {
        super(numberOfConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Open the DataBace from IBM");
    }

    @Override
    void readDataBase() {
        System.out.println("Read the DataBace from IBM");
    }

    @Override
    void editDataBase() {
        System.out.println("Edit the DataBace from IBM");
    }

    @Override
    void closeDataBase() {
        System.out.println("Close the DataBace from IBM");
    }
}
class GoodleDataBase extends DataBase{

    GoodleDataBase(int numberOfConnections) {
        super(numberOfConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Open the DataBace from Google DataBase");
    }

    @Override
    void readDataBase() {
        System.out.println("Read the DataBace from Google DataBase "+numberOfConnections);
    }

    @Override
    void editDataBase() {
        System.out.println("Edit the DataBace from Google DataBase "+ numberOfConnections);
    }

    @Override
    void closeDataBase() {
        System.out.println("Close the DataBace from Google DataBase");
    }
}