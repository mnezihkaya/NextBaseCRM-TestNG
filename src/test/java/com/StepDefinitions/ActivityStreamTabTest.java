package com.StepDefinitions;

import com.Page.LoginPage;
import com.Page.MainPage;
import com.Utilities.BrowserUtils;
import com.Utilities.CRMUtilities;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivityStreamTabTest extends DataProviderForTest{

    @Test(dataProvider = "hR")
    public static void ActivityStreamTabTestMoreHR(String userName) {

        MainPage mainPage=new MainPage();

        //login as
        CRMUtilities.LogIn(userName);

        mainPage.moreTab.click();
        BrowserUtils.sleep(2);

        List<String> expectedProfileTabs=new ArrayList<>(Arrays.asList("Appreciation","Announcement"));

        List<String>actualProfileTabs=new ArrayList<>();
        for (WebElement each: mainPage.moreTab_allModule) {
            actualProfileTabs.add(each.getText());
        }
        Assert.assertEquals(actualProfileTabs,expectedProfileTabs);

        CRMUtilities.LogOut();

    }
    @Test(dataProvider = "helpDeskUsers")
    public static void ActivityStreamTabTestMoreHelpDesk(String userName) {

        MainPage mainPage=new MainPage();

        //login as
        CRMUtilities.LogIn(userName);

        mainPage.moreTab.click();
        BrowserUtils.sleep(2);

        List<String> expectedProfileTabs=new ArrayList<>(Arrays.asList("File","Appreciation","Announcement","Workflow"));

        List<String>actualProfileTabs=new ArrayList<>();
        for (WebElement each: mainPage.moreTab_allModule) {
            actualProfileTabs.add(each.getText());
        }
        Assert.assertEquals(actualProfileTabs,expectedProfileTabs);

        CRMUtilities.LogOut();

    }
    @Test(dataProvider = "marketingUsers")
    public static void ActivityStreamTabTestMoreMarketing(String userName) {

        MainPage mainPage=new MainPage();

        //login as
        CRMUtilities.LogIn(userName);

        mainPage.moreTab.click();
        BrowserUtils.sleep(2);

        List<String> expectedProfileTabs=new ArrayList<>(Arrays.asList("File","Appreciation","Announcement","Workflow"));

        List<String>actualProfileTabs=new ArrayList<>();
        for (WebElement each: mainPage.moreTab_allModule) {
            actualProfileTabs.add(each.getText());
        }
        Assert.assertEquals(actualProfileTabs,expectedProfileTabs);

        CRMUtilities.LogOut();

    }
}
