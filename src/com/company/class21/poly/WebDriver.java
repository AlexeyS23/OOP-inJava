package com.company.class21.poly;

public class WebDriver {
    void openWebsite(){
        System.out.println("Opening a website");
    }
       void signup(){
           System.out.println("Signup on the website");
       }
       void login(){
           System.out.println("Login to website");
       }
       void enterUserPassword(){
           System.out.println("Entering a user password");
       }
       void clickSubmit(){
           System.out.println("click to submit button");
       }
       void closeBrowser(){
           System.out.println("closing the browser");
       }

}
class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in Google Chrome");
    }
    void signup(){
        System.out.println("Signup on the website Google Chrome");
    }
    void login(){
        System.out.println("Login to website inGoogle Chrome");
    }
    void enterUserPassword(){
        System.out.println("Entering a user password in Google Chrome");
    }
    void clickSubmit(){
        System.out.println("click to submit button in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("closing the browser in Google Chrome");
    }

}
class FireFox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in FireFox");
    }
    void signup(){
        System.out.println("Signup on the website FireFox");
    }
    void login(){
        System.out.println("Login to website in FireFox");
    }
    void enterUserPassword(){
        System.out.println("Entering a user password in FireFox");
    }
    void clickSubmit(){
        System.out.println("click to submit button in FireFox");
    }
    void closeBrowser(){
        System.out.println("closing the browser in FireFox");
    }

}
class Safari extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in Safari");
    }
    void signup(){
        System.out.println("Signup on the website Safari");
    }
    void login(){
        System.out.println("Login to website in Safari");
    }
    void enterUserPassword(){
        System.out.println("Entering a user password in Safari");
    }
    void clickSubmit(){
        System.out.println("click to submit button in Safari");
    }
    void closeBrowser(){
        System.out.println("closing the browser in Safari");
    }

}