package com.company.class23.abstraction;

public abstract class Phone {
    void makePhoneCalls(){
        System.out.println("Making a call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPictures();
    abstract void unlockPhone();

}
class Iphone extends Phone {
    @Override
    void displayPictures(){
        System.out.println("Iphone uses photo app to display the pictures");
    }
    @Override
    void unlockPhone(){
        System.out.println("Use faseId to unlock the phone");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures(){
        System.out.println("Samsumg uses gelery app to display the pictures");
    }
    @Override
    void unlockPhone(){
        System.out.println("Use finger to unlock the phone");
    }
}