package com.selenium.testcases;

import com.selenium.applicationpages.HomePage;
import com.selenium.genericmethods.WebUtilities;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_01_RegisterUser extends WebUtilities {
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Registration of new user")
    @Story("US1932")
    @Feature("Registration")
    @Description("validate E2E scenrio of new user creation")
    @Test(testName = "TC_ID_001")
    public void registerUser() throws Exception {
        WebDriver driver= launchBrowser("ff","https://demo.nopcommerce.com/");
        HomePage homePage=new HomePage(driver);
        homePage.navigateToLoginPage();
    }
}
