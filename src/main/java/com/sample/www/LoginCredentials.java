package com.sample.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class LoginCredentials extends PageBase {
    public LoginCredentials (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath="//input[@id='username']")
    public static WebElement finalEmail;
    @FindBy (xpath="//input[@id='password']")
    public static WebElement finalPassword;
    @FindBy (xpath="//button[@type='submit']")
    public static WebElement loginButton;
    @FindBy (xpath="//div[@class='flash success']")
    public static WebElement loginSuccessAlert;
    @FindBy (xpath="//a[@class='button secondary radius']")
    public static WebElement logoutButton;
    @FindBy (xpath="//div[@class='flash error']")
    public static WebElement loginErrorAlert;


    public void openHomePage() {
        driver.get("https://the-internet.herokuapp.com/login");
    }


    public void GetCredencialLogin(String email, String password) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        setTxtElement(finalEmail,email);
        setTxtElement(finalPassword,password);
        clickOnElement(loginButton);

    }

}

