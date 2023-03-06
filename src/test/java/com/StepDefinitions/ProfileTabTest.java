package com.StepDefinitions;

import com.Page.MainPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfileTabTest extends DataProviderForTest{

    //check my profile
    @Test(dataProvider = "userTypes",groups = {"P1"})
    public static void ProfileTabs(String userName) {

        MainPage mainPage=new MainPage();

        List<String>expectedProfileTabs=new ArrayList<>(Arrays.asList("My Profile","Edit Profile Settings","Themes","Configure notifications","Log Out"));
        List<String>actualProfileTabs=new ArrayList<>();
        for (WebElement each: mainPage.profileTab_allModules) {
            actualProfileTabs.add(each.getText());
        }
        Assert.assertEquals(actualProfileTabs,expectedProfileTabs);

        //My Profile
        //Edit Profile Settings
        //Themes
        //Configure notifications
        //Log Out
    }
}
