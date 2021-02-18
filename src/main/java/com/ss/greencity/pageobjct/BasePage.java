package com.ss.greencity.pageobjct;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public BasePage goToURL(String url){
        driver.get(url);
        return this;
    }
    public String getURL(){
        return driver.getCurrentUrl();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
}
