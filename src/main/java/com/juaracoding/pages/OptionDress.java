package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OptionDress {
    private WebDriver driver;

    public OptionDress(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //select color
    @FindBy(xpath = "//option[@value='black']")
    WebElement colorfit;


    //select size
    @FindBy(xpath = "//option[@value='34']")
    WebElement sizefit;


    // button add cart
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnCart;

    public void optioning(){
        colorfit.click();
        sizefit.click();
        btnCart.click();
        System.out.println("Button Add Cart Success");
    }

}
