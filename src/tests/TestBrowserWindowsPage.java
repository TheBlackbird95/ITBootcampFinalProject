package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestBrowserWindowsPage extends Basic {

    @BeforeTest
    public void pageSetUp() {
        homePage.goToAlertsFrameWindows();
        sidebarPage.browserWindows.click();
    }

    @Test
    public void newTab() {
        browserWindowsPage.clickTab();
        Assert.assertTrue(driver.getWindowHandles().size() != 1, "It should be two tabs!");
        ArrayList<String> mySet = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySet.get(1));
        driver.close();
    }

    @Test
    public void newWindow() {
        browserWindowsPage.clickNewWindow();
        Assert.assertTrue(driver.getWindowHandles().size()!=1, "It should be two windows!");
        ArrayList<String> mySet = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySet.get(1));
        driver.close();
    }

}
