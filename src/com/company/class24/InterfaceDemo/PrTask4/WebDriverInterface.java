package com.company.class24.InterfaceDemo.PrTask4;
public interface WebDriverInterface {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenshotInterfase{
    void getScreenshot();
}
interface RemoteWebDriverInterface extends WebDriverInterface, TakeScreenshotInterfase{
    void navigate();
}
class ChromeDriver implements RemoteWebDriverInterface{
    @Override
    public void open() {
    }
    @Override
    public void close() {
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void getScreenshot() {
    }
    @Override
    public void navigate() {
    }
    }
    class FirefoxDriver implements RemoteWebDriverInterface{
        @Override
        public void open() {
        }
        @Override
        public void close() {
        }
        @Override
        public String getTitle() {
            return null;
        }
        @Override
        public void getScreenshot() {
        }
        @Override
        public void navigate() {
        }
    }
    class SafariDrivwer implements RemoteWebDriverInterface{
        @Override
        public void open() {
        }
        @Override
        public void close() {
        }
        @Override
        public String getTitle() {
            return null;
        }
        @Override
        public void getScreenshot() {
        }
        @Override
        public void navigate() {
        }
    }