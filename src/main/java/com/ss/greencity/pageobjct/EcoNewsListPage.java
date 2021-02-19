package com.ss.greencity.pageobjct;

import com.ss.greencity.elements.Button;
import com.ss.greencity.locators.EcoNewsLocators;
import org.openqa.selenium.WebDriver;

public class EcoNewsListPage extends BasePage{
    public EcoNewsListPage(WebDriver driver) {
        super(driver);
    }

    private Button listButton;
    private Button galleryButton;
    private Button newsCategoryButton;
    private EcoNewsFilters filters;

    public EcoNewsFilters getFilters(){
        filters= new EcoNewsFilters(driver);
        return filters;
    }

    public EcoNewsListPage clickGalleryButton(){
        galleryButton = new Button(driver, EcoNewsLocators.GALLERY_BUTTON);
        galleryButton.click();
        return this;
    }

    public EcoNewsListPage clickListButton(){
        listButton = new Button(driver, EcoNewsLocators.LIST_BUTTON);
        listButton.click();
        return this;
    }


}
