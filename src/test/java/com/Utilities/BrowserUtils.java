package com.Utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException ignored) {

        }
    }

    public static void switchWindowAndVerify(String expectedUrl, String expectedInTitle) {
        Set<String> allWindowsHandle = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandle) {
            Driver.getDriver().switchTo().window(each);

            if (Driver.getDriver().getCurrentUrl().contains(expectedUrl)) {
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    public static void verifyContainsTitle(String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

    public static void verifyUrlContains(String expectedUrl){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));
    }

    public static void verifyBackgroundColor(WebElement webElement, String expectedHexColor){
        String actualBackgroundColor= webElement.getCssValue("background-color");
        String hexColor= org.openqa.selenium.support.Color.fromString(actualBackgroundColor).asHex();
        Assert.assertEquals(hexColor,expectedHexColor);
    }
    public static void verifyFontSize(WebElement webElement, String expectedFontSize) {
        String actualFontSize = webElement.getCssValue("font-size");
        Assert.assertEquals(actualFontSize, expectedFontSize);
    }

    public static void verifyBackgroundColorChangedWhenHoover(WebElement webElement){
        //actual Background
        String actualBackgroundColor= webElement.getCssValue("background-color");
        //convert to hexColor
        String hexColor= Color.fromString(actualBackgroundColor).asHex();

        //hover the element
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(webElement).perform();

        //get the background color when hoover on the element
        String actualBackgroundColor1= webElement.getCssValue("background-color");
        String hexColor1= Color.fromString(actualBackgroundColor1).asHex();

        Assert.assertNotEquals(hexColor1, hexColor);

    }

    public static void highlight(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();

        jsExecutor.executeScript("arguments[0].style.border='3px solid orange'", element);
        jsExecutor.executeScript("arguments[0].style.backgroundColor='yellow'", element);
        jsExecutor.executeScript("arguments[0].style.color='black'", element);
        //BrowserUtils.sleep(0.01);

        jsExecutor.executeScript("arguments[0].style.backgroundColor=''", element);
        jsExecutor.executeScript("arguments[0].style.border='0px solid black'", element);
        jsExecutor.executeScript("arguments[0].style.color=''", element);
    }


    public static void verifyWebElementList(List<WebElement> ListOfWebElements,List<String> ListOfExpectedWebElements){

        List<String> actualElements = new ArrayList<>();
        for (WebElement each : ListOfWebElements) {
            actualElements.add(each.getText());
        }
        //verify modules
        Assert.assertEquals(actualElements, ListOfExpectedWebElements);
    }

    public static void verifyWebElement(WebElement actualWebElement,String expectedWebElement){
        Assert.assertEquals(actualWebElement.getText(),expectedWebElement);
    }
}