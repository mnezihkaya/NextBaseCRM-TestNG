package com.Utilities;

import com.Page.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.text.Utilities;

public class CRMUtilities {

    public static void LogIn(String username) {
        LoginPage loginPage = new LoginPage();

        //enter Valid username
        BrowserUtils.highlight(loginPage.userName);
        loginPage.userName.clear();
        loginPage.userName.sendKeys(username);
        //enter valid password
        BrowserUtils.highlight(loginPage.password);
        loginPage.password.clear();
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        //click LogIn button
        BrowserUtils.highlight(loginPage.loginButton);
        loginPage.loginButton.click();
        //verify LogIn
        BrowserUtils.verifyContainsTitle("Portal");

    }

    public static void LogIn(String username, String password) {
        LoginPage loginPage = new LoginPage();

        //enter Valid username
        BrowserUtils.highlight(loginPage.userName);
        loginPage.userName.clear();
        loginPage.userName.sendKeys(username);
        //enter valid password
        BrowserUtils.highlight(loginPage.password);
        loginPage.password.clear();
        loginPage.password.sendKeys(password);
        //click LogIn button
        BrowserUtils.highlight(loginPage.loginButton);
        loginPage.loginButton.click();
        //verify LogIn
        BrowserUtils.verifyContainsTitle("Portal");
    }

    public static void LogOut() {
        LoginPage loginPage = new LoginPage();
        BrowserUtils.highlight(loginPage.userProfile);
        loginPage.userProfile.click();
        BrowserUtils.highlight(loginPage.logOutButton);
        loginPage.logOutButton.click();
    }



}
