package com.selenium.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageOR {
    @FindBy(xpath="//input[@id='gender-male']")
    public WebElement gender_Male;
    @FindBy(xpath="//input[@id='gender-female']")
    public WebElement gender_FeMale;
    @FindBy(xpath="//input[@name='FirstName']")
    public WebElement firstName;
    @FindBy(xpath="//input[@name='LastName']")
    public WebElement lastName;
    @FindBy(xpath="//select[@name='DateOfBirthDay']")
    public WebElement day;
    @FindBy(xpath="//select[@name='DateOfBirthMonth']")
    public WebElement month;
    @FindBy(xpath="//select[@name='DateOfBirthYear']")
    public WebElement year;
    @FindBy(xpath="//input[@name='Email']")
    public WebElement email;
    @FindBy(xpath="//input[@name='Password']")
    public WebElement password;
    @FindBy(xpath="//input[@name='ConfirmPassword']")
    public WebElement confirmpassword;
    @FindBy(xpath="//input[@name='register-button']")
    public WebElement registerbutton;
}
