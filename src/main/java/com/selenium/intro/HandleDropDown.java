package com.selenium.intro;

import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropDown extends WebUtilities {
    @Test
    public void handleDropDown() throws Exception {
        WebDriver driver=launchBrowser("chrome","https://demo.nopcommerce.com/register?returnUrl=%2F");
        WebElement day=driver.findElement(By.xpath("(//select[@name='DateOfBirthDay']/option)[2]"));
//        Select select=new Select(day);
////        select.selectByIndex(3);
//        //select.selectByVisibleText("18");
//        select.selectByValue("14");//attribute value
        day.click();
    }
}
