package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Basic;

import java.util.ArrayList;

public class TestBrowserWindowsPage extends Basic {

    @BeforeTest
    public void pageSetUp() {
        homePage.goToAlertsFrameWindows();
        sidebarPage.browserWindows.click();
    }

    @Test
    public void newTab() {
        browserWindowsPage.clickTab();
        Assert.assertEquals(driver.getWindowHandles().size(), 2, "It should be two tabs!");
        ArrayList<String> mySet = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySet.get(1));
        driver.close();
        driver.switchTo().window(mySet.get(0));
    }

    @Test
    public void newWindow() {
        browserWindowsPage.clickNewWindow();
        Assert.assertEquals(driver.getWindowHandles().size(), 2, "It should be two windows!");
        ArrayList<String> mySet = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySet.get(1));
        driver.close();
        driver.switchTo().window(mySet.get(0));
    }

    @Test
    public void newWindowMessage() throws InterruptedException {
        browserWindowsPage.clickNewWindowMessage();
        ArrayList<String> mySet = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySet.get(1));
        Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]")).getText().contains("Knowledge increases by sharing but not by saving."));
        driver.close();
        Thread.sleep(2000);
    }
}
