package tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Basic;

public class TestRadioButtonPage extends Basic {

    @BeforeClass
    public void pageSetUp (){
        homePage.goToElements();
        sidebarPage.radioButton.click();
    }

    @Test
    public void yes(){
        clickabilityWait(radioButtonPage.getYesButton());
        radioButtonPage.clickYes();
        Assert.assertTrue(radioButtonPage.getResultText().getText().contains("Yes"));
    }

    @Test
    public void impressive(){
        clickabilityWait(radioButtonPage.getImpressiveButton());
        radioButtonPage.clickImpressive();
        Assert.assertTrue(radioButtonPage.getResultText().getText().contains("Impressive"));
    }

    @Test
    public void no(){
        clickabilityWait(radioButtonPage.getNoButton());
        radioButtonPage.clickNo();
        Assert.assertThrows(NoSuchElementException.class, ()->radioButtonPage.getResultText().getText().contains("No"));
    }
}
