package com.StepDefinitions;

import com.Page.MainPage;
import com.Page.ProfileSubmodule;
import com.Utilities.BrowserUtils;
import com.Utilities.CRMUtilities;
import org.testng.annotations.Test;

public class ProfileSubmoduleTest extends DataProviderForTest {

    @Test(dataProvider = "userTypes", groups = {"P1"})
    public static void ProfileSubmodule(String username) {
        CRMUtilities.LogIn(username);
        ProfileSubmodule profileSubmodule = new ProfileSubmodule();
        MainPage mainPage = new MainPage();

        BrowserUtils.highlight(mainPage.profile);
        mainPage.profile.click();
        BrowserUtils.highlight(mainPage.myProfile);
        mainPage.myProfile.click();

        BrowserUtils.highlight(ProfileSubmodule.general);
        ProfileSubmodule.general.isDisplayed();
        BrowserUtils.highlight(ProfileSubmodule.drive);
        ProfileSubmodule.drive.isDisplayed();
        BrowserUtils.highlight(ProfileSubmodule.tasks);
        ProfileSubmodule.tasks.isDisplayed();
        BrowserUtils.highlight(ProfileSubmodule.calender);
        ProfileSubmodule.calender.isDisplayed();
        BrowserUtils.highlight(ProfileSubmodule.conversations);
        ProfileSubmodule.conversations.isDisplayed();


    }


}
