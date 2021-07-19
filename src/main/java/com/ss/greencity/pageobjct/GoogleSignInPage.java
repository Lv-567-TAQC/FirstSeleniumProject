package com.ss.greencity.pageobjct;

import com.ss.greencity.elements.Button;
import com.ss.greencity.locators.SignInLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInWithGooglePage extends SignInPage{
    public SignInWithGooglePage(WebDriver driver) {
        super(driver);
    }

    private Button signIn;

    public SignInWithGooglePage clickGoogleButton(){
        signIn = new Button(driver, SignInLocators.SIGN_IN_GOOGLE_BUTTON);
        driver.findElement(By.xpath("//div[@class='header_navigation-menu']/nav/ul/li[last()]/a")).click();
        driver.findElement(By.xpath("//button[@class='google-sign-in']")).click();
    }

    public SignInWithGooglePage enterEmail(String email) {
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
        return this;
    }

    public SignInWithGooglePage enterPassword(String password) {
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);
        return this;
    }

    public MyHabitsPage clickSignIn() {
        signIn = new Button(driver, SignInLocators.SIGN_IN_BUTTON);
        signIn.click();
        return new MyHabitsPage(driver);
    }

}
