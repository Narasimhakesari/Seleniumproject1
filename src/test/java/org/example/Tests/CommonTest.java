package org.example.Tests;

import org.example.PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommonTest {

    @Test
    public  void tst1()
    {
        WebDriver driver;
        driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://parabank.parasoft.com/parabank/index.htm");


    }

}
