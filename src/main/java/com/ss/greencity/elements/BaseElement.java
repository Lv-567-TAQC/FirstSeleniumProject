package com.ss.greencity.elements;

import com.ss.greencity.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseElement {
    protected By path;
    protected WebElement element;
    protected WebDriver driver;

    public BaseElement(WebDriver driver, BaseLocator locator){
        this.driver = driver;
        this.path = locator.getPath();
        this.element = driver.findElement(path);
    }

}
