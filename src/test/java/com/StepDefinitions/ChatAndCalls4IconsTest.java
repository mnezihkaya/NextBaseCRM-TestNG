package com.StepDefinitions;

import com.Page.ChatAndCallsPage;
import com.Page.MainPage;
import com.Utilities.BrowserUtils;
import com.Utilities.CRMUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChatAndCalls4IconsTest extends DataProviderForTest{

    @Test(dataProvider = "userTypes")
    public void fourIcons(String userName){
        MainPage mainPage=new MainPage();

        CRMUtilities.LogIn(userName);


        ChatAndCallsPage chatAndCallsPage=new ChatAndCallsPage();
        BrowserUtils.highlight(mainPage.chatAndCalls);
        mainPage.chatAndCalls.click();
        BrowserUtils.sleep(2);

       chatAndCallsPage.messageIcon.isDisplayed();
       chatAndCallsPage.notificationIcon.isDisplayed();
       chatAndCallsPage.settingsIcon.isDisplayed();
       chatAndCallsPage.activityStreamIcon.isDisplayed();


    }


}
