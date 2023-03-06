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
    @FindBy(xpath = "//span[@class=\"bx-desktop-tab-counter\"]")
    public List<WebElement> fourIconsOnTheLeftSide;

}
