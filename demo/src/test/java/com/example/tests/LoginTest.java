package com.example.tests;

import com.example.base.BaseClass;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void shouldLogInToHerokuApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(loginPage.isSecureAreaVisible(), "User should land in the secure area after login.");
    }
}
