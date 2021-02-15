package com.greencity.econewstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicTest {
    protected static WebDriver driver;

    @BeforeClass
    public void setUpClass(){
        String webDriverPath = System.getenv("chromeWebDriver");
        System.setProperty("webdriver.chrome.driver",webDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
    }



    @AfterClass
    public void tearDownClass(){
        driver.close();
        driver.quit();
    }
}
