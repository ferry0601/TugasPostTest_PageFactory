package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MoreShop {
    private WebDriver driver;

    public MoreShop(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[@class='icon_bag_alt']")
    WebElement btnView;

    @FindBy(xpath = "//a[@class='continue']")
    WebElement continueshop;

    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//a[1]//img[1]")
    WebElement shoes;

    @FindBy(id = "pa_color")
    WebElement color;

    @FindBy(id = "pa_size")
    WebElement size;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAdd;

    public void shopmore(){
        btnView.click();
        continueshop.click();
        shoes.click();
        Select selectcolor = new Select(color);
        selectcolor.selectByValue("black");

        Select selectsize = new Select(size);
        selectsize.selectByValue("38");

        btnAdd.click();
    }

}
