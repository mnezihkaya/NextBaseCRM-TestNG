package com.Page;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name=\"USER_LOGIN\"]")
    public WebElement userName;

    @FindBy(xpath = "//input[@name=\"USER_PASSWORD\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@class=\"login-btn\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//a[@class=\"login-link-forgot-pass\"]")
    public WebElement forgotYourPassword;

    @FindBy(xpath = "//div[@id=\"user-block\"]")
    public WebElement userProfile;

    @FindBy(xpath = "//div[@class=\"errortext\"]")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[text()=\"Log out\"]")
    public WebElement logOutButton;

}
