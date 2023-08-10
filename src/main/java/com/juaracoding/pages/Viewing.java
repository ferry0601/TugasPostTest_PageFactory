package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Viewing {
    private WebDriver driver;

    public Viewing(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@role='alert']")
    WebElement scraping;


    @FindBy(xpath = "//a[@class='button wc-forward wp-element-button']")
    WebElement btnView;

    public void viewer(){
        String scrap = scraping.getText();
        System.out.println(scrap);
        String result = scrapAndView(scrap,"“black lux graphic t-shirt” has been added to your cart.");
        System.out.println(result);
    }

    public static String scrapAndView(String actual, String expected){
        if(actual.contains(expected)){
            return "Product Added";
        } else{
            return "Product Invalid Added";
        }


    }
}
