package com.ss.greencity.elements;

import com.ss.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;

public class Button extends BaseElement{
    public Button(WebDriver driver, BaseLocator locator) {
        super(driver, locator);
    }

    public void click(){
        this.element.click();
    }
}
