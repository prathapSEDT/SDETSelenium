package com.selenium.resourcesproperties;

public enum Resources {
    CHROMEDRIVERPATH("src/main/resources/drivers/chromedriver"),
    FIREFOXDRIVER("src/main/resources/drivers/geckodriver"),
    JSONDATA("src/main/resources/testdata/Testdata.json");
    String value;
    Resources(String value) {
        this.value=value;
    }
    public String getValue()
    {
        return value;
    }
}
