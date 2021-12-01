package com.company.class24.InterfaceDemo.Task1;

import javax.sound.midi.Soundbank;

public interface WebDriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour:
    // openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("By click");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Close by click");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Bla bla");
    }
    @Override
    public void findElement(){
        System.out.println("By By By");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Fire By click");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Fire Close by click");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Fire Bla bla");
    }
    @Override
    public void findElement(){
        System.out.println("Fire By By By");
    }
}