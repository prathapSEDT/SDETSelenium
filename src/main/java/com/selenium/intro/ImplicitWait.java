package com.selenium.intro;

import com.selenium.applicationpages.HomePage;
import com.selenium.genericmethods.WebUtilities;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWait extends WebUtilities {
    @Test
    public void Validate_Tc_02() throws Exception {
        WebDriver driver= launchBrowser("ff","https://demo.nopcommerce.com/");
        //driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        HomePage homePage=new HomePage(driver);
        homePage.navigateToRegistrationPage();

        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='FirstName']")));



        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Hello");

        /*
        Explicit wait , works on condition for a sepecific element
         */

    }
}
