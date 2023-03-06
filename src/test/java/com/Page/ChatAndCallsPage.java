package com.Page;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChatAndCallsPage {
    public ChatAndCallsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class=\"bx-desktop-tab-icon bx-desktop-tab-icon-im\"]")
    public WebElement messageIcon;
    @FindBy(xpath = "//div[@class=\"bx-desktop-tab-icon bx-desktop-tab-icon-notify\"]")
    public WebElement notificationIcon;
    @FindBy(xpath = "//div[@class=\"bx-desktop-tab-icon bx-desktop-tab-icon-config\"]")
    public WebElement settingsIcon;
    @FindBy(xpath = "//div[@class=\"bx-desktop-tab-icon bx-desktop-tab-icon-im-lf\"]")
    public WebElement activityStreamIcon;

}
