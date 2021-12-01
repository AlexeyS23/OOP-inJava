package com.company.class24.InterfaceDemo.ProjectClassOOP.PrTask1.PrTask5;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration=new Registration();
        registration.setUserName("Katerina");
        System.out.println(registration.getUserName());
        registration.setPassword("Katerina123");
        System.out.println(registration.getPassword());
        registration.setEmail("Katerina@yahoo.com");
        System.out.println(registration.getEmail());

    }
}
