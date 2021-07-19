package com.ss.greencity.locators;

import org.openqa.selenium.By;

public enum CreateNewsLocaators implements BaseLocator{
    CANCEL_BUTTON (By.className("custom-chip")),
    PREVIEW_BUTTON (By.className("custom-chip")),
    PUBLISH_BUTTON (By.className("custom-chip"))
    ;

    private By path;
    CreateNewsLocaators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}