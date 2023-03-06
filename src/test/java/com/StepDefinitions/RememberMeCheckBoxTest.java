package com.StepDefinitions;

import com.Page.LoginPage;
import com.Utilities.BrowserUtils;
import com.Utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RememberMeCheckBoxTest extends DataProviderForTest{
    @Test(dataProvider = "allUsers")
    public void RememberMeButtonDisplayedAndSelected(String username) {
        //RememberMeButtonDisplayed
        LoginPage loginPage = new LoginPage();
        //Navigate LoginPage
        ConfigurationReader.getProperty("env1");

        BrowserUtils.highlight(loginPage.rememberMeCheckBox);
        Assert.assertTrue(loginPage.rememberMeCheckBox.isDisplayed());
        //RememberMeCheckBoxSelected
        BrowserUtils.highlight(loginPage.rememberMeCheckBox);
        loginPage.rememberMeCheckBox.click();
        Assert.assertTrue(loginPage.rememberMeCheckBox.isSelected());
        //RememberMeCheckBoxUnselect
        BrowserUtils.highlight(loginPage.rememberMeCheckBox);
        loginPage.rememberMeCheckBox.click();
        Assert.assertFalse(loginPage.rememberMeCheckBox.isSelected());
    }
}
