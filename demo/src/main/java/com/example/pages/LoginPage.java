package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private final String url = "https://the-internet.herokuapp.com/login";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public void login(String username, String password) {
        open();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public String getFlashText() {
        return driver.findElement(By.id("flash")).getText();
    }

    public boolean isSecureAreaVisible() {
        return driver.getCurrentUrl().contains("/secure")
                && getFlashText().contains("You logged into a secure area!");
    }
}
