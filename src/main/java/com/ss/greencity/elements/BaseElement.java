package com.ss.greencity.elements;

import com.ss.greencity.locators.BaseLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public abstract class BaseElement {
    protected By path;
    protected WebElement element;
    protected WebDriver driver;

    public BaseElement(WebDriver driver, BaseLocator locator){
        this.driver = driver;
        this.path = locator.getPath();
        this.element = driver.findElement(path);
    }

    public BaseElement(WebElement element, BaseLocator locator){
        this.path = locator.getPath();
        this.element = element.findElement(path);
    }

    public BaseElement(WebElement element){
        this.element = element;
    }

    public List<String> getCSSClasses(){
        return  Arrays.asList(element.getAttribute("class").split(" "));
    }
}
