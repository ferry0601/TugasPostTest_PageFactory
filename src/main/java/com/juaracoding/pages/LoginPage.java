package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement btnLogin;

    @FindBy(xpath = "//strong[1]")
    WebElement userNameHello;





    public void login(){
        username.sendKeys("ferry0601");
        password.sendKeys("ferryFfly0601");
        btnLogin.click();

        String naming = userNameHello.getText();
        String result = assertLogin(naming,"ferry0601");
        System.out.println(result);
    }

    public static String assertLogin(String actual, String expected){

        if(actual.equalsIgnoreCase(expected)){
            return "Login Successfully";
        } else{
            return "Login Invalid";
        }
    }
}
