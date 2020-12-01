package com.selenium.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOR {
    @FindBy(linkText="Register")
    public WebElement registerLink;
    @FindBy(linkText="Log in")
    public WebElement loginLink;

}
