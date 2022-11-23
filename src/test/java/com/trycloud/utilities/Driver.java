package com.trycloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private Driver() {
    } // private constructor, no access to the object of this class

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>(); // making our driver instance private , so it is not reachable, we make it static, because we want to run it before anything else

    public static WebDriver getDriver() { // create re-usable utility which will return same driver instance when we call it. Depending on browserType our switch statement will determine to open specific type of browser

        if (driverPool.get() == null) {
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    //.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }
        }
        return driverPool.get(); // same driver instance will be return everytime we call Driver.getDriver() method
    }
    public static void closeDriver(){
        if(driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
