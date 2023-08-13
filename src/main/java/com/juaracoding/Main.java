package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.*;
import org.openqa.selenium.WebDriver;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) {

        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com/my-account/");

        LoginPage loginPage = new LoginPage();
        loginPage.login();



        //startshop
        StartShopping shop = new StartShopping();
        shop.shopStart();
        DriverSingleton.scrolling();

        //pick dress
        PickDress pickDress = new PickDress();
        pickDress.dressCode();
        DriverSingleton.scrolling();

        //Option dress
        OptionDress optionDress = new OptionDress();
        optionDress.optioning();

        Viewing views = new Viewing();
        views.viewer();

        //shop again
        MoreShop more = new MoreShop();
        more.shopmore();

        views.viewerMore();

        //checkout
        Checkout checkout = new Checkout();

        checkout.setCheckout("Wahyu","Ferryansyah","ID","jl. griya kasih","Medan",
                "SU","22367","62812938742");

        views.cekCheckout("Thank you. Your order has been received.");

        DriverSingleton.delay(5);
        DriverSingleton.closeObjectInstance();
    }
}