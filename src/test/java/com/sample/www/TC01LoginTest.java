package com.sample.www;

import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC01LoginTest extends TestBase {
    LoginCredentials loginPage;




    @Test
    public void tc01LoginInWeb()  {

        loginPage = new LoginCredentials(driver);

        test = extent.createTest("Verify Login in the web", "Case 4: Verify login in the page with the correct and the incorrect email and password")
                .assignCategory("Functional_testcase")
                .assignAuthor("xhoni");


        //click login
        loginPage.openHomePage();
        //go to login form
        loginPage.GetCredencialLogin("tomsmith", "SuperSecretPassword!");
        //message isDisplayed
        Assert.assertTrue(LoginCredentials.loginSuccessAlert.isDisplayed());
        System.out.println("Login was successful");
        //logout
        LoginCredentials.logoutButton.click();
        //close window

    }
    @Test
    public void tc02LoginInWebWithWrongCredentials()  {

        loginPage = new LoginCredentials(driver);


        loginPage.openHomePage();
        //go to login form
        loginPage.GetCredencialLogin("tomsmith2", "SuperSecretPassword!23");
        //message isDisplayed
        Assert.assertTrue(LoginCredentials.loginErrorAlert.isDisplayed());
        System.out.println("Login wasn't successful");

    }
}
