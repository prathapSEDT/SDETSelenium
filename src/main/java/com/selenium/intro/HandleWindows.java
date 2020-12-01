package com.selenium.intro;

import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class HandleWindows extends WebUtilities {
    @Test
    public void validateWindows() throws Exception {
        WebDriver driver=launchBrowser("chrome","https://www.naukri.com/");

        // collect the parent window id
        String parentID=driver.getWindowHandle();

        //collect all the window id including parent and child
        Set<String> allWindows=driver.getWindowHandles();

        allWindows.remove(parentID);

        for (String window:allWindows) {
            driver.switchTo().window(window);
            driver.close();
        }
        driver.switchTo().window(parentID);

    }

}
