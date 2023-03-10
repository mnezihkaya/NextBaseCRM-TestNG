package com.StepDefinitions;

import com.Page.LoginPage;
import com.Page.MainPage;
import com.Utilities.BrowserUtils;
import com.Utilities.CRMUtilities;
import com.Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickMoreButton extends DataProviderForTest {

    @Test(dataProvider = "userTypes", groups = {"P1"})
    public void emptyMessage(String userName) {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        //Login and click more button to see submodules
        CRMUtilities.LogIn(userName);
        BrowserUtils.highlight(mainPage.moreTab);
        mainPage.moreTab.click();
        //click appreciation submodule
        BrowserUtils.highlight(mainPage.moreTab_appreciation);
        mainPage.moreTab_appreciation.click();
        //click send button to send empty message
        BrowserUtils.highlight(mainPage.appreciation_SendButton);
        mainPage.appreciation_SendButton.click();
        //check if the error message is displayed
        BrowserUtils.highlight(mainPage.appreciationErrorMessage);
        mainPage.appreciationErrorMessage.isDisplayed();

        String actualMessage = mainPage.appreciationErrorMessage.getText();
        ;
        String expectedMessage = "The message title is not specified";
        Assert.assertEquals(actualMessage, expectedMessage, "Something went wrong");

    }

    @Test(dataProvider = "userTypes", groups = {"P1"})
    public void sendMessage(String userName) {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        //Login and click more button to see submodules
        CRMUtilities.LogIn(userName);
        BrowserUtils.highlight(mainPage.moreTab);
        mainPage.moreTab.click();
        //click appreciation submodule
        BrowserUtils.highlight(mainPage.moreTab_appreciation);
        mainPage.moreTab_appreciation.click();
        //click Body to send message
        Driver.getDriver().switchTo().frame(mainPage.messageTab_iframe);
        mainPage.appreciation_SendBodyMessage.sendKeys("test test test");
        Driver.getDriver().switchTo().parentFrame();
        //click send button to send message
        BrowserUtils.highlight(mainPage.appreciation_SendButton);
        mainPage.appreciation_SendButton.click();

    }
}
