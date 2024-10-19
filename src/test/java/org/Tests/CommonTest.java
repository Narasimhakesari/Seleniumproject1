package org.Tests;

import org.PageObjects.HomePage;
import org.PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommonTest {
    WebDriver driver;
    HomePage homePage;
    RegisterPage registerPage;
    @BeforeMethod
    public void before()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @Test(priority = 2)
    public  void testLoginWithWrongInfo()
    {
        homePage = new HomePage(driver);
        homePage.setUserName("narasimha");
        homePage.setPassword("kesari");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(homePage.loginError));
        Assert.assertEquals("The username and password could not be verified.", homePage.loginError.getText());
    }

    @Test(priority = 1)
    public void registerAccount()
    {
        homePage = new HomePage(driver);
        homePage.register();
        registerPage = new RegisterPage(driver);

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

    @Test
    public void loginAccount()
    {

    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }

}
