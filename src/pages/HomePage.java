package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver webDriver;
    private WebDriverWait wdwait;
    public HomePage (WebDriver webDriver, WebDriverWait wdwait) {
        this.webDriver = webDriver;
        this.wdwait = wdwait;
        PageFactory.initElements(this.webDriver, this);
    }

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement elements;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]")
    WebElement forms;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]")
    WebElement alertsFrameWindows;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]")
    WebElement widgets;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]")
    WebElement interactions;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]")
    public WebElement bookStoreApplication;

    public void goToElements(){
        elements.click();
    }
    public void goToForms(){
        forms.click();
    }
    public void goToAlertsFrameWindows(){
        alertsFrameWindows.click();
    }
    public void goToWidgets(){
        widgets.click();
    }
    public void goToInteractions(){
        interactions.click();
    }
    public void goToBookStoreApplication(){
        bookStoreApplication.click();
    }
}
