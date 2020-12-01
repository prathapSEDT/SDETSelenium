package com.selenium.applicationpages;

import com.selenium.applicationor.RegistrationPageOR;
import com.selenium.genericmethods.WebUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistartionPage extends WebUtilities {
    RegistrationPageOR registrationPageOR;

    public RegistartionPage(WebDriver driver){
        registrationPageOR= PageFactory.initElements(driver,RegistrationPageOR.class);
    }

    public void fillRegistartionForm() throws InterruptedException {
        Thread.sleep(2000);
        clickElement("Gender","Registartion Page",registrationPageOR.gender_Male);
        sendData("First Name","Registration",registrationPageOR.firstName,"firstName");
        sendData("Last Name","Registration",registrationPageOR.lastName,"lastName");
        sendData("Email","Registration",registrationPageOR.email,"firstName");


    }
}
