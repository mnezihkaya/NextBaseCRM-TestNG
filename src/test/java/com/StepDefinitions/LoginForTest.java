package com.StepDefinitions;

import com.Page.LoginPage;
import com.Page.MainPage;
import com.Utilities.BrowserUtils;
import com.Utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginForTest extends DataProviderForTest {
    @Test(dataProvider = "allUsers",groups = {"P1"})
    public void crmLoginPositiveTest(String username) {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();

        //enter Valid username
        BrowserUtils.highlight(loginPage.userName);
        loginPage.userName.clear();
        loginPage.userName.sendKeys(username);
        //enter valid password
        BrowserUtils.highlight(loginPage.password);
        loginPage.password.clear();
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        //click LogIn button
        BrowserUtils.highlight(loginPage.loginButton);
        loginPage.loginButton.click();
        BrowserUtils.sleep(2);
        //verify LogIn
        BrowserUtils.verifyContainsTitle("Portal");
    }

    @Test(dataProvider = "invalidUserName")
    public void crmLoginNegativeTestWithValidUserNameInvalidPassword(String username) {
        LoginPage loginPage = new LoginPage();

        //enter Valid username
        BrowserUtils.highlight(loginPage.userName);
        loginPage.userName.clear();
        loginPage.userName.sendKeys(username);
        //enter invalid password
        BrowserUtils.highlight(loginPage.password);
        loginPage.password.clear();
        loginPage.password.sendKeys(ConfigurationReader.getProperty("invalidPassword1"));
        //click LogIn button
        BrowserUtils.highlight(loginPage.loginButton);
        loginPage.loginButton.click();
        //verify errorMessage
        BrowserUtils.highlight(loginPage.errorMessage);
        Assert.assertEquals(loginPage.errorMessage.getText(), "Incorrect login or password");

    }

    @Test(dataProvider = "allUsers")
    public void crmLoginNegativeTestWithValidUserNameEmptyPassword(String username) {
        LoginPage loginPage = new LoginPage();

        //enter Valid username
        BrowserUtils.highlight(loginPage.userName);
        loginPage.userName.clear();
        loginPage.userName.sendKeys(username);
        //enter invalid password
        BrowserUtils.highlight(loginPage.password);
        loginPage.password.clear();
        loginPage.password.sendKeys(ConfigurationReader.getProperty("emptyPassword"));
        //click LogIn button
        BrowserUtils.highlight(loginPage.loginButton);
        loginPage.loginButton.click();
        //verify errorMessage
        BrowserUtils.highlight(loginPage.errorMessage);
        Assert.assertEquals(loginPage.errorMessage.getText(), "Incorrect login or password");

    }

    @Test(dataProvider = "invalidUserName")
    public void crmLoginNegativeTestWithInValidUserNameValidPassword(String username) {
        LoginPage loginPage = new LoginPage();

        //enter Valid username
        BrowserUtils.highlight(loginPage.userName);
        loginPage.userName.clear();
        loginPage.userName.sendKeys(username);
        //enter invalid password
        BrowserUtils.highlight(loginPage.password);
        loginPage.password.clear();
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        //click LogIn button
        BrowserUtils.highlight(loginPage.loginButton);
        loginPage.loginButton.click();
        //verify errorMessage
        BrowserUtils.highlight(loginPage.errorMessage);
        Assert.assertEquals(loginPage.errorMessage.getText(), "Incorrect login or password");

    }

    @Test(dataProvider = "invalidUserName")
    public void crmLoginNegativeTestWithInValidUserNameInValidPassword(String username) {
        LoginPage loginPage = new LoginPage();

        //enter Valid username
        BrowserUtils.highlight(loginPage.userName);
        loginPage.userName.clear();
        loginPage.userName.sendKeys(username);
        //enter invalid password
        BrowserUtils.highlight(loginPage.password);
        loginPage.password.clear();
        loginPage.password.sendKeys(ConfigurationReader.getProperty("invalidPassword3"));
        //click LogIn button
        BrowserUtils.highlight(loginPage.loginButton);
        loginPage.loginButton.click();
        //verify errorMessage
        BrowserUtils.highlight(loginPage.errorMessage);
        Assert.assertEquals(loginPage.errorMessage.getText(), "Incorrect login or password");

    }


}
