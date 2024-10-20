package org.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "input[name=\"username\"]")
    WebElement userName;

    @FindBy(css = "input[name=\"password\"]")
    WebElement password;

    @FindBy(css = "input[value=\"Log In\"]")
    WebElement loginBtn;

    @FindBy(linkText = "Forgot login info?")
    WebElement forgotLoginInfo;

    @FindBy(linkText = "Register")
    WebElement register;

    @FindBy(css = ".error")
    public WebElement loginError;

    @FindBy(css = "ul.leftmenu li")
    public List<WebElement> leftMenu;

    public RegisterPage register()
    {
        register.click();
        RegisterPage registerPage = new RegisterPage(driver);
        return registerPage;
    }

    public void setUserName(String userName1)
    {
        userName.sendKeys(userName1);
    }

    public void setPassword(String password1)
    {
        password.sendKeys(password1);
        login();
    }

    public void login()
    {
        loginBtn.click();
    }

    public void leftMenucontains()
    {
        for(WebElement a: leftMenu)
        {
            System.out.println(a.getText());
        }
    }


}

