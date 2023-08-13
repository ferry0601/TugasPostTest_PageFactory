package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement colorfit;


    //select size
    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement sizefit;


    // button add cart
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnCart;

    public void optioning(){
        //colorfit.click();
        //sizefit.click();
        //btnCart.click();
        Select selectcolor = new Select(colorfit);
        selectcolor.selectByValue("black");

        Select selectsize = new Select(sizefit);
        selectsize.selectByValue("36");

        Actions action = new Actions(driver);
        action.moveToElement(btnCart).click().perform();

        System.out.println("Button Add Cart Success");
    }

}
