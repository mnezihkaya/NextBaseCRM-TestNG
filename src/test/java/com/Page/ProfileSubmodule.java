package com.Page;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSubmodule {

    public ProfileSubmodule(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[.=\"General\"]")
    public static WebElement general;

    @FindBy(xpath ="//a[.=\"Drive\t\t\t\t\t\t\"]")
    public static WebElement drive;

    @FindBy(xpath = "//a[.=\"Tasks\t\t\t\t\t\t\"]")
    public static WebElement tasks;

    @FindBy(xpath = "//a[.=\"Calendar\t\t\t\t\t\t\"]")
    public static WebElement calender;

    @FindBy(xpath = "//a[.=\"Conversations\t\t\t\t\t\t\"]")
    public static WebElement conversations;
}
