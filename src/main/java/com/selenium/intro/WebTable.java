package com.selenium.intro;

import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable extends WebUtilities {
    @Test
    public void handleWebTable() throws Exception {
        WebDriver driver=launchBrowser("chrome","https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
        List<WebElement> rows=driver.findElements(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr"));

        for(int r=1;r<= rows.size()-1;r++){

            List<WebElement> cols=driver.findElements(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr["+r+"]/td"));

for(int c=1;c<=cols.size()-1;c++){
    WebElement data=driver.findElement(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr["+r+"]/td["+c+"]"));
    System.out.println(data.getText());
}
            System.out.println("------------------------------------");


        }

    }
}
