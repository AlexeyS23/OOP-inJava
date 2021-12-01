package com.company.class24.InterfaceDemo.Task1;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver ch=new ChromeDriver();
        ch.closeBrowser();
        ch.findElement();
        ch.maximizeWindow();
        ch.findElement();

        FirefoxDriver fire=new FirefoxDriver();
        fire.closeBrowser();
        fire.findElement();
        fire.maximizeWindow();
        fire.openBrowser();

       // WebDriver webDriver={new ChromeDriver(), new FirefoxDriver()};
       // for (WebDriver web:webDriver){
        //    web.closeBrowser();
        //    web.findElement();
       //     web.maximizeWindow();
       //     web.openBrowser();
       // } Отличный метод!!!!
    }
}
