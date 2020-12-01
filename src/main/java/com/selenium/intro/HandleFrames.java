package com.selenium.intro;

import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleFrames extends WebUtilities {
    @Test
    public void handleFrame() throws Exception {
        WebDriver driver=launchBrowser("chrome","https://paytm.com/");
        driver.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
        WebElement frame=driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Watch')]")).click();
        driver.switchTo().defaultContent();
    }
}
