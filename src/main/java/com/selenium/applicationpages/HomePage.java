package com.selenium.applicationpages;

import com.selenium.applicationor.HomePageOR;
import com.selenium.genericmethods.WebUtilities;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebUtilities {
    HomePageOR homePageOR;
    public HomePage(WebDriver driver){
        homePageOR= PageFactory.initElements(driver,HomePageOR.class);
    }
@Step("Navigating to registration page")
    public void navigateToRegistrationPage(){

        clickElement("Register","Home Page",homePageOR.registerLink);
        getScreenShot();
    }
    @Step("Navigating to login page")
    public void navigateToLoginPage(){
        clickElement("Login","Home Page",homePageOR.loginLink);
        getScreenShot();
    }

}
