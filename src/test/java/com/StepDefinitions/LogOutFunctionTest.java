package com.StepDefinitions;

import com.Page.LoginPage;
import com.Utilities.BrowserUtils;
import com.Utilities.CRMUtilities;
import org.testng.annotations.Test;

public class LogOutFunctionTest extends DataProviderForTest {

    @Test(dataProvider = "userTypes")
    public static void Logout(String userName) {

        CRMUtilities.LogIn(userName);

        LoginPage loginPage = new LoginPage();
        BrowserUtils.highlight(loginPage.userProfile);
        loginPage.userProfile.click();
        BrowserUtils.highlight(loginPage.logOutButton);
        loginPage.logOutButton.click();
    }
}
