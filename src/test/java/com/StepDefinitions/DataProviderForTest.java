package com.StepDefinitions;

import com.Utilities.CRMUtilities;
import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProviderForTest {

    private static final String env = ConfigurationReader.getProperty("env1");


    @BeforeMethod
    public void SetUp() {
        Driver.getDriver().get(env);
    }

    @AfterMethod(onlyForGroups = {"P1"})
    public void TearDown() {
        CRMUtilities.LogOut();
        Driver.closeDriver();
    }

    @DataProvider(name = "userTypes")
    public Object[][] userTypes() {
        return new Object[][]{
                {ConfigurationReader.getProperty("username1")},
                {ConfigurationReader.getProperty("username4")},
                {ConfigurationReader.getProperty("username7")},
        };

    }

    @DataProvider(name = "allUsers")
    public Object[][] allUsers() {
        return new Object[][]{
                {ConfigurationReader.getProperty("username1")},
                {ConfigurationReader.getProperty("username2")},
                {ConfigurationReader.getProperty("username4")},
                {ConfigurationReader.getProperty("username5")},
                {ConfigurationReader.getProperty("username7")},
                {ConfigurationReader.getProperty("username8")},
        };
    }

    @DataProvider(name = "hR")
    public Object[][] hRUsers() {
        return new Object[][]{
                {ConfigurationReader.getProperty("username1")},
                {ConfigurationReader.getProperty("username2")},
                {ConfigurationReader.getProperty("username3")},

        };
    }

    @DataProvider(name = "helpDeskUsers")
    public Object[][] helpDeskUsers() {
        return new Object[][]{

                {ConfigurationReader.getProperty("username4")},
                {ConfigurationReader.getProperty("username5")},
                {ConfigurationReader.getProperty("username6")},
        };
    }

    @DataProvider(name = "marketingUsers")
    public Object[][] marketingUsers() {
        return new Object[][]{
                {ConfigurationReader.getProperty("username7")},
                {ConfigurationReader.getProperty("username8")},
                {ConfigurationReader.getProperty("username9")},
        };
    }
    @DataProvider(name = "invalidUserName")
    public Object[][] invalidUserName() {
        return new Object[][]{
                {ConfigurationReader.getProperty("invalidUsername1")},
        };
    }


}