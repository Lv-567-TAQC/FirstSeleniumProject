package com.ss.greencity.locators;

import org.openqa.selenium.By;

public enum EcoNewsLocators implements BaseLocator{
    HEADER (By.cssSelector(".main-header")),
    GALLERY_BUTTON (By.cssSelector(".btn-tiles")),
    LIST_BUTTON (By.cssSelector(".btn-bars"))
    ;

    private By path;
    EcoNewsLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
