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
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    HomePage homePage;

    public String browserName1 = "chrome";
    public void selectchrome(String browserName)
    {
        if(browserName1.equals(browserName))
        {
            driver.set(new ChromeDriver());
        }

    }

    public static WebDriver getDriver()
    {
        return driver.get();
    }

    @BeforeMethod
    public HomePage before()
    {
        selectchrome("chrome");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        homePage = new HomePage(getDriver());
        return homePage;
    }


    @AfterMethod
    public void tearDown()
    {
        getDriver().close();
    }

}
