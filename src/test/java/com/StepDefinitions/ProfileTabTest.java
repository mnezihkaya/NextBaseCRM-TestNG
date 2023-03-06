package com.StepDefinitions;

import com.Page.LoginPage;
import com.Page.MainPage;
import com.Utilities.BrowserUtils;
import com.Utilities.CRMUtilities;
import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfileTabTest extends DataProviderForTest{

    //check my profile
    @Test(dataProvider = "userTypes")
    public static void ProfileTabs(String userName) {

        MainPage mainPage=new MainPage();
        LoginPage loginPage=new LoginPage();

        //login as
        CRMUtilities.LogIn(userName);

        BrowserUtils.highlight(mainPage.profile);

        mainPage.profile.click();
        BrowserUtils.sleep(2);

        List<String>expectedProfileTabs=new ArrayList<>(Arrays.asList("My Profile","Edit Profile Settings","Themes","Configure notifications","Log out"));

        List<String>actualProfileTabs=new ArrayList<>();
        for (WebElement each: mainPage.profileTab_allModules) {
            actualProfileTabs.add(each.getText());
        }
        Assert.assertEquals(actualProfileTabs,expectedProfileTabs);

        BrowserUtils.highlight(loginPage.logOutButton);
        loginPage.logOutButton.click();

    }
}
