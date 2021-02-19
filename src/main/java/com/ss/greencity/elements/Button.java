package com.ss.greencity.elements;

import com.ss.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button extends BaseElement{
    public Button(WebDriver driver, BaseLocator locator) {
        super(driver, locator);
    }

    public Button(WebElement element, BaseLocator locator) {
        super(element, locator);
    }

    public Button(WebElement element) {
        super(element);
    }

    public void click(){
        this.element.click();
    }
}
