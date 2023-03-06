package com.StepDefinitions;

import com.Page.MainPage;
import com.Utilities.BrowserUtils;
import com.Utilities.CRMUtilities;
import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainModule extends DataProviderForTest {

    @Test(dataProvider = "hR",groups = {"P1"})
    public void MainModulesAppearedForHRUsers(String username) {
        MainPage mainPage = new MainPage();

        //go to test environment page and verify
        ConfigurationReader.getProperty("env1");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Authorization");
        //login as HR
        CRMUtilities.LogIn(username);

        BrowserUtils.highlight(mainPage.more);
        mainPage.more.click();
        BrowserUtils.sleep(2);

        //expected Modules
        List<String> expectedModules = new ArrayList<>(Arrays.asList("Activity Stream", "Tasks", "Chat and Calls", "Workgroups", "Drive",
                "Calendar", "Contact Center", "CRM", "Time and Reports", "Employees", "Services", "Company", "Open Channels", "Applications", "Workflows"));
        //verify WebElements
        BrowserUtils.verifyWebElementList(mainPage.allModulesOnLeft,expectedModules);

       /*
       //actual Modules
       List<String> actualModules = new ArrayList<>();
        for (WebElement each : mainPage.allModulesOnLeft) {
            actualModules.add(each.getText());
        }
        //verify modules
        Assert.assertEquals(actualModules, expectedModules);*/
    }
}
