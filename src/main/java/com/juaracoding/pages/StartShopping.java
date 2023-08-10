package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StartShopping {
    private WebDriver driver;

    public StartShopping(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://shop.demoqa.com']")
    WebElement btnShopStart;


    public void shopStart(){
        btnShopStart.click();
        System.out.println("Click Shopping");


    }




}
