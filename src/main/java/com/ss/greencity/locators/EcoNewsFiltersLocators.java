package com.ss.greencity.locators;

import org.openqa.selenium.By;

public enum EcoNewsFiltersLocators implements BaseLocator{
    FILTER_TAGS (By.className("custom-chip"))

    ;

    private By path;
    EcoNewsFiltersLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
