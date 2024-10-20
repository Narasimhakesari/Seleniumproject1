package org.Tests;

import org.PageObjects.HomePage;
import org.PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterAndLogin extends CommonTest{



    @Test(enabled = true, dependsOnMethods ={"registerAccount"} )
    public  void testLoginWithWrongInfo()
    {

        homePage.setUserName("naru");
        homePage.setPassword("Narasimha@26");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(homePage.loginError));
//        Assert.assertEquals("The username and password could not be verified.", homePage.loginError.getText());
    }

    @Test(enabled = true)
    public void registerAccount()
    {

        RegisterPage registerPage = homePage.register();


        registerPage.setFirstName("Narasimha");
        registerPage.setLastName("Kesari");
        registerPage.setAddress("Vijayawada, Andhra Pradesh");
        registerPage.setCity("Vijayawada");
        registerPage.setState("Andhra Pradesh");
        registerPage.setZipCode("520113");
        registerPage.setPhnNumber("7729962889");
        registerPage.setSsnNumber("87482");
        registerPage.setUserName("naru");
        registerPage.setPassword("Narasimha@26");
        registerPage.setConfirmPassword("Narasimha@26");

    }

    @Test(enabled = false)
    public void leftMenulinks()
    {
        homePage.leftMenucontains("Services");
    }
}
