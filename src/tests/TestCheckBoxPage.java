package tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Basic;

public class TestCheckBoxPage extends Basic {

    @BeforeClass
    public void pageSetUp() {
        homePage.goToElements();
        sidebarPage.checkBox.click();
    }

    @Test
    public void expandEverything() {
        checkBoxPage.clickExpandHome();
        checkBoxPage.clickExpandAll();
        visabilityWait(checkBoxPage.getCheckVeu());
        Assert.assertTrue(checkBoxPage.getCheckVeu().isDisplayed(), "Veu should be visible");
    }

    @Test
    public void checkToVeu(){
        checkBoxPage.clickExpandHome();
        checkBoxPage.clickExpandDocuments();
        checkBoxPage.clickExpandWorkSpace();
        checkBoxPage.clickCheckVeu();
        Assert.assertTrue(checkBoxPage.getCheckBoxVeu().isSelected(),"Veu should be selected");
    }

    @Test
    public void checkingAndUnchecking(){
        checkBoxPage.clickExpandAll();
        checkBoxPage.clickCheckHome();
        Assert.assertTrue(checkBoxPage.getCheckBoxVeu().isSelected(),"Veu should be selected");
        checkBoxPage.clickCheckWorkSpace();
        Assert.assertFalse(checkBoxPage.getCheckBoxVeu().isSelected(),"Veu should not be selected");
        checkBoxPage.clickCheckVeu();
        Assert.assertTrue(checkBoxPage.getCheckBoxVeu().isSelected(),"Veu should be selected");
    }

    @Test
    public void notVisible(){
        checkBoxPage.clickExpandAll();
        checkBoxPage.clickExpandWorkSpace();
        Assert.assertThrows(NoSuchElementException.class, ()-> checkBoxPage.getCheckVeu().isDisplayed());
    }
}
