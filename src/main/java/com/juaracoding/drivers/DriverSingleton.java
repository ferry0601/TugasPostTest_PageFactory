package com.juaracoding.drivers;

import com.juaracoding.drivers.strategies.DriverStrategy;
import com.juaracoding.drivers.strategies.DriverStrategyImplementer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static com.juaracoding.drivers.DriverSingleton instance = null;
    private static WebDriver driver;
    private DriverSingleton(String driver){
        instantiate(driver);
    }

    public WebDriver instantiate(String strategy){
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    public static void scrolling(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
    }

    public static com.juaracoding.drivers.DriverSingleton getInstance(String driver){
        if(instance == null){
            instance = new com.juaracoding.drivers.DriverSingleton(driver);
        }
        return instance;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void selection(String country){
        WebElement kopi = driver.findElement(By.xpath("//*[@id=\"billing_country\"]"));
        Select cobain = new Select(kopi);
        cobain.selectByValue(country);
    }

    public static void selectionState(String state){
        WebElement pilih = driver.findElement(By.xpath("//*[@id=\"billing_state\"]"));
        Select cobain = new Select(pilih);
        cobain.selectByValue(state);
    }


    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeObjectInstance(){
        instance = null;
        driver.quit();
    }

}
