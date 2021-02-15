package com.greencity.econewstest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EcoNewsTest extends BasicTest{

    @Test
    public void goToEcoNewsPageTest(){
        driver.findElement(By.linkText("Eco news")).click();
    }
}
