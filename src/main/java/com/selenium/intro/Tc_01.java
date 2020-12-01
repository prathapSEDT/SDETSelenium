package com.selenium.intro;

import com.selenium.applicationpages.HomePage;
import com.selenium.applicationpages.RegistartionPage;
import com.selenium.genericmethods.WebUtilities;
import com.selenium.jsondataprovider.ReadJson;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_01 extends WebUtilities {

    @Test
    public void Validate_Tc_01() throws Exception {
        ReadJson readJson=new ReadJson();
        readJson.loadJsonData();
        readJson.getData("firstname",2);



//        WebDriver driver=launchBrowser("chrome","https://demo.nopcommerce.com/");
//
//        HomePage homePage=new HomePage(driver);
//        homePage.navigateToRegistrationPage();
//
//        RegistartionPage registartionPage=new RegistartionPage(driver);
//        registartionPage.fillRegistartionForm();



    }
}
