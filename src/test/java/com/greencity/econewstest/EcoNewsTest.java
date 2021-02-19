package com.greencity.econewstest;

import com.ss.greencity.pageobjct.EcoNewsFilters;
import com.ss.greencity.pageobjct.EcoNewsListPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EcoNewsTest extends BasicTest{

    @Test
    public void goToEcoNewsPageTest(){
        driver.findElement(By.linkText("Eco news")).click();
        EcoNewsListPage ecoNewsListPage = (EcoNewsListPage) new EcoNewsListPage(driver).goToURL("https://ita-social-projects.github.io/GreenCityClient/#/news");
        ecoNewsListPage.clickListButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ecoNewsListPage.clickGalleryButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void initNewsPageTest() {
        driver.findElement(By.linkText("Eco news")).click();
        EcoNewsListPage ecoNewsListPage = (EcoNewsListPage) new EcoNewsListPage(driver).goToURL("https://ita-social-projects.github.io/GreenCityClient/#/news");
        ecoNewsListPage.getFilters()
                .clickEducationButton()
                .clickAddsButton()
                .clickEducationButton();
        Assert.assertTrue(ecoNewsListPage.getFilters().isSelectedAddsButton());
        Assert.assertFalse(ecoNewsListPage.getFilters().isSelectedEducationButton());
    }
}
