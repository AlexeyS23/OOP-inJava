package com.company.class21.poly;

public class WebDriverTester{
    public static void main(String[] args) {
       // GoogleChrome googleChrome=new GoogleChrome();
        //googleChrome.openWebsite();
        //googleChrome.signup();
        //googleChrome.signup();
        //googleChrome.login();
      //  googleChrome.enterUserPassword();
       // googleChrome.clickSubmit();
      //  googleChrome.closeBrowser();

        WebDriver webDriver=new FireFox();
        webDriver.clickSubmit();
        webDriver.closeBrowser();
        webDriver.login();
        webDriver.enterUserPassword();
        webDriver.openWebsite();
        webDriver.signup();

        WebDriver [] webDrivers={new GoogleChrome(),new FireFox(),new Safari()};
        for (WebDriver wd:webDrivers){
            wd.clickSubmit();
            wd.closeBrowser();
            wd.login();
            wd.enterUserPassword();
            wd.openWebsite();
            wd.signup();
        }

    }
}
