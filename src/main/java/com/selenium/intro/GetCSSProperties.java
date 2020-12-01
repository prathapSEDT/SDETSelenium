package com.selenium.intro;

import com.selenium.applicationpages.HomePage;
import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GetCSSProperties extends WebUtilities {
    @Test
    public void getCSSProperties() throws Exception {
        WebDriver driver= launchBrowser("chrome","https://demo.nopcommerce.com/");
        HomePage homePage=new HomePage(driver);
        homePage.navigateToRegistrationPage();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        List<WebElement> errorElements=driver.findElements(By.xpath("//span[contains(@id,'error')]"));

        for (WebElement error:errorElements) {
            System.out.println(error.getText());
            System.out.println(error.getCssValue("color"));
        }


    }
}
