package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private WebDriver driver;

    public Checkout(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    //tombol menuju checkout
    @FindBy(xpath = "//i[@class='icon_bag_alt']")
    WebElement btnView;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    WebElement checkout;

    //fill form checkout
    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement lastName;
    @FindBy(xpath = "//span[@id='select2-billing_country-container']")
    WebElement country;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement streetName;
    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement city;
    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    WebElement state;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement postCode;
    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phoneNumber;

    //tombol menuju checkout
    @FindBy(xpath = "//span[@class='woocommerce-terms-and-conditions-checkbox-text']")
    WebElement checkBox;
    @FindBy(xpath = "//button[@id='place_order']")
    WebElement placeOrder;

    public void setCheckout(String firstname, String lastname,String negara, String streetname, String kota,
                            String province, String postcode, String nomor ){
        btnView.click();
        checkout.click();

        //kondisi untuk nama depan
        if(firstName != null){
            firstName.clear();
            firstName.sendKeys(firstname);
        }else{
            firstName.sendKeys(firstname);
        }

        //kondisi untuk nama belakang
        if(lastname != null) {
            lastName.clear();
            lastName.sendKeys(lastname);
        }else {
            lastName.sendKeys(lastname);
        }


        DriverSingleton.selection(negara);

        //kondisi untuk alamat
        if(streetName != null) {
            streetName.clear();
            streetName.sendKeys(streetname);
        }else {
            streetName.sendKeys(streetname);
        }

        //kondisi untuk kota
        if(city != null) {
            city.clear();
            city.sendKeys(kota);
        }else{
            city.sendKeys(kota);
        }


        DriverSingleton.selectionState(province);

        //kondisi untuk kode pos
        if(postCode != null) {
            postCode.clear();
            postCode.sendKeys(postcode);
        }else{
            postCode.sendKeys(postcode);
        }

        //kondisi untuk nomor HP
        if(phoneNumber != null) {
            phoneNumber.clear();
            phoneNumber.sendKeys(nomor);
        } else{
            phoneNumber.sendKeys(nomor);
        }

        checkBox.click();
        DriverSingleton.delay(2);
        placeOrder.click();

    }

}
