package org.example.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;
    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[name=\"customer.firstName\"]")
    WebElement firstName;

    @FindBy(css ="input[name=\"customer.lastName\"]")
    WebElement lastName;

    @FindBy(css = "input[name=\"customer.address.street\"]")
    WebElement address;

    @FindBy(css = "input[name=\"customer.address.city\"]")
    WebElement city;

    @FindBy(css = "input[name=\"customer.address.city\"]")
    WebElement state;

    @FindBy(css = "input[name=\"customer.address.zipCode\"]")
    WebElement zipCode;

    @FindBy(css = "input[name=\"customer.phoneNumber\"]")
    WebElement phnNumber;

    @FindBy(css = "input[name=\"customer.ssn\"]")
    WebElement ssnNumber;

    @FindBy(css = "input[name=\"customer.username\"]")
    WebElement userName;

    @FindBy(css = "input[name=\"customer.password\"]")
    WebElement password;

    @FindBy(css = "input[name=\"repeatedPassword\"]")
    WebElement confirmPassword;

    @FindBy(css = "input[value=\"Register\"]")
    WebElement registerBtn;

    public void setFirstName(String firstName1)
    {
        firstName.sendKeys(firstName1);
    }

    public void setLastName(String lastName1)
    {
        lastName.sendKeys(lastName1);
    }

    public void setAddress(String address1)
    {
        address.sendKeys(address1);
    }

    public void setCity(String city1)
    {
        city.sendKeys(city1);
    }

    public void setState(String state1)
    {
        state.sendKeys(state1);
    }

    public void setZipCode(String zipCode1)
    {
        zipCode.sendKeys(zipCode1);
    }

    public void setPhnNumber(String phnNumber1)
    {
        phnNumber.sendKeys(phnNumber1);
    }

    public void setSsnNumber(String ssnNumber1)
    {
        ssnNumber.sendKeys(ssnNumber1);
    }

    public void setUserName(String userName1)
    {
        userName.sendKeys(userName1);
    }

    public void setPassword(String password1)
    {
        password.sendKeys(password1);
    }

    public void setConfirmPassword(String confirmPassword1)
    {
        confirmPassword.sendKeys(confirmPassword1);
        clickRegister();
    }

    public void clickRegister()
    {
        registerBtn.click();
    }

}
