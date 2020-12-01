package com.selenium.intro;

import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class GetAllLinks extends WebUtilities {
    @Test
    public void getLinks() throws Exception {
        WebDriver driver= launchBrowser("chrome","https://www.amazon.in/");
        //create a xpath to get all the links from the webpage
        List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
        for (WebElement link:allLinks) {

            //check if the element is available in the UI or not

            try{
                //isDisplayed, if the elements is not available on the DOM, then this method will
                // throw an exception
                if (link.isDisplayed()){
                    //print each link name
                    System.out.println(link.getText());

                    //check the link is active or not
                    HttpURLConnection httpURLConnection=(HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
                    int statusCode=httpURLConnection.getResponseCode();
                    if(statusCode==200){
                        System.out.println("Link is active");
                    }else {
                        System.out.println("Link is not active"+statusCode);
                    }



                }
            }catch (Exception e)
            {
                System.out.println("Unable to print the link");
            }




        }
    }
}
