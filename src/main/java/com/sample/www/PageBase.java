package com.sample.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {
    protected WebDriver driver;
    public Select select;
    public Actions actions;
    public WebElement element=null;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected static void clickOnElement(WebElement element) {
        element.click();
    }

    protected static void setTxtElement(WebElement element, String text) {
        element.sendKeys(text);
    }



}
