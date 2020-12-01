package com.selenium.intro;

import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleSelect_NG extends WebUtilities {
    @Test
    public void testDropDown() throws Exception {
        WebDriver driver=launchBrowser("chrome","https://material.angular.io/components/select/overview");
Thread.sleep(5000);
        WebElement element=driver.findElement(By.xpath("((//h4[text()='Basic mat-select']/following-sibling::mat-form-field)[1]/div/div//div)[4]"));

        element.click();

        WebElement option=driver.findElement(By.xpath("//span[normalize-space(text())='Tacos']"));
        option.click();
    }
}
