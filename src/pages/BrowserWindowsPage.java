package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindowsPage {
    private WebDriver webDriver;
    private WebDriverWait wdwait;
    public BrowserWindowsPage(WebDriver webDriver, WebDriverWait wdwait) {
        this.webDriver = webDriver;
        this.wdwait = wdwait;
        PageFactory.initElements(this.webDriver, this);
    }

    @FindBy (id = "tabButton")
    private WebElement newTabButton;

    @FindBy (id = "windowButton")
    private WebElement newWindowButton;

    @FindBy (id = "messageWindowButton")
    private WebElement newWindowMessageButton;

    public void clickTab(){
        newTabButton.click();
    }

    public void clickNewWindow(){
        newWindowButton.click();
    }

    public void clickNewWindowMessage(){
        newWindowMessageButton.click();
    }
}
