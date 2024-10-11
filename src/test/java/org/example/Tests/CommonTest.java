package org.example.Tests;

import org.example.PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonTest {

    public static void main(String[] args)
    {
        WebDriver driver;
        driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);


    }

}
