package org.example.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "Narasimha")
    WebElement name;

    @FindBy(xpath = "Narasimha")
    WebElement name1;

    @FindBy(xpath = "Narasimha")
    WebElement name2;


}
