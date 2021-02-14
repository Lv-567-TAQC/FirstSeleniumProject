package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppSelenium {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver",
                "./lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        driver.findElement(By.linkText("Eco news")).click();
    }
}
