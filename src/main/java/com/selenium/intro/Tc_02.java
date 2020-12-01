package com.selenium.intro;

import com.selenium.applicationpages.HomePage;
import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tc_02 extends WebUtilities {

    @Test
    public void Validate_Tc_02() throws Exception {
        WebDriver driver= launchBrowser("ff","https://demo.nopcommerce.com/");
        HomePage homePage=new HomePage(driver);
        homePage.navigateToLoginPage();
    }
}
