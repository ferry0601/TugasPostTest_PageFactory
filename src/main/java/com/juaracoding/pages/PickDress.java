package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PickDress {
    private WebDriver driver;

    public PickDress(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //outfit
    @FindBy(xpath = "//div[@class='noo-product-item noo-product-sm-4 not_featured post-1485 product type-product status-publish has-post-thumbnail product_cat-t-shirt product_tag-t-shirt product_tag-women has-featured last instock shipping-taxable purchasable product-type-variable']//a[@class='noo-thumbnail-product hover-device']")
    WebElement outfitTerpilih;





   public void dressCode(){
        outfitTerpilih.click();
        System.out.println("Choosing Outfit");

   }




}
