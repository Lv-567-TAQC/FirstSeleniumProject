package com.ss.greencity.pageobjct;

import com.ss.greencity.elements.Button;
import com.ss.greencity.locators.EcoNewsFiltersLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class EcoNewsFilters extends BasePage {

    private Button newsButton;
    private Button addsButton;
    private Button eventsButton;
    private Button initiativesButton;
    private Button educationButton;

    public EcoNewsFilters(WebDriver driver) {
        super(driver);
        init();
    }


    public EcoNewsFilters clickNewsButton(){
        this.newsButton.click();
        return this;
    }

    public EcoNewsFilters clickAddsButton(){
        this.addsButton.click();
        return this;
    }

    public EcoNewsFilters clickEventsButton(){
        this.eventsButton.click();
        return this;
    }

    public EcoNewsFilters clickInitiativesButton(){
        this.initiativesButton.click();
        return this;
    }

    public EcoNewsFilters clickEducationButton(){
        this.educationButton.click();
        return this;
    }

    public boolean isSelectedNewsButton(){
        return newsButton.getCSSClasses().contains("global-tag-clicked");
    }

    public boolean isSelectedAddsButton(){
        return addsButton.getCSSClasses().contains("global-tag-clicked");
    }

    public boolean isSelectedEventsButton(){
        return eventsButton.getCSSClasses().contains("global-tag-clicked");
    }

    public boolean isSelectedInitiativesButton(){
        return initiativesButton.getCSSClasses().contains("global-tag-clicked");
    }

    public boolean isSelectedEducationButton(){
        return educationButton.getCSSClasses().contains("global-tag-clicked");
    }


    public void init() {
        List<WebElement> elements = driver.findElements(EcoNewsFiltersLocators.FILTER_TAGS.getPath());

        for (WebElement element : elements) {
            switch (element.getText()) {
                case "News":
                    newsButton = new Button(element);
                    break;
                case "Ads":
                    addsButton = new Button(element);
                    break;
                case "Events":
                    eventsButton = new Button(element);
                    break;
                case "Initiatives":
                    initiativesButton = new Button(element);
                    break;
                case "Education":
                    educationButton = new Button(element);
                    break;
            }
        }

    }
}
