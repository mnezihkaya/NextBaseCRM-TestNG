package com.StepDefinitions;

import com.Page.MainPage;
import com.Utilities.BrowserUtils;
import com.Utilities.CRMUtilities;
import com.Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskTabIframe extends DataProviderForTest {
    @Test(dataProvider = "marketingUsers")
    public void TaskTabTest(String username) {

        CRMUtilities.LogIn(username);

        MainPage mainPage = new MainPage();
        BrowserUtils.highlight(mainPage.taskTab);
        mainPage.taskTab.click();
        BrowserUtils.sleep(3);

        Driver.getDriver().switchTo().frame(mainPage.messageTab_iframe);
        BrowserUtils.highlight(mainPage.messageTab_body);
        mainPage.messageTab_body.click();
        mainPage.messageTab_body.sendKeys("Body message");

        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.highlight(mainPage.messageTab_sendButton);
        mainPage.messageTab_sendButton.click();

        Assert.assertTrue(mainPage.messageTab_errorText.isDisplayed());


    }
}
