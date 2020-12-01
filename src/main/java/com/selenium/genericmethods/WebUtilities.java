package com.selenium.genericmethods;

import com.selenium.resourcesproperties.Resources;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.ByteArrayInputStream;

public class WebUtilities {
    WebDriver driver=null;
    @Step("Launching browser")
    protected WebDriver launchBrowser(String browser,String url) throws Exception {

        switch (browser.toLowerCase()){

            case "ff":
                System.setProperty("webdriver.gecko.driver", Resources.FIREFOXDRIVER.getValue());
                driver=new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", Resources.CHROMEDRIVERPATH.getValue());
                driver=new ChromeDriver();
                break;
            default:
                throw new Exception("invalid browser type");

    }
        driver.manage().window().maximize();
        driver.get(url);
        getScreenShot();
        return driver;
    }

    @Step("Click the element {0} on the page {1}")
    protected void clickElement(String element, String pageName, WebElement webelement){
        webelement.click();
        System.out.println("The Element "+element+" is clicked sucessfully on the "+pageName);
    }
    @Step("Enter data for the element{0} on the webpage {1}")
    protected void sendData(String element, String pageName, WebElement webelement,String data){
        webelement.click();
        webelement.clear();
        webelement.sendKeys(data);
        System.out.println("The Element "+element+" is entered with data sucessfully on the "+pageName);
    }
    @Attachment(value = "Screenshot", type = "image/png")
    protected void getScreenShot(){
        Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES)));
    }

}
