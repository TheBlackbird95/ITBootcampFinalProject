package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {
    private WebDriver webDriver;
    private WebDriverWait wdwait;
    public RadioButtonPage(WebDriver webDriver, WebDriverWait wdwait) {
        this.webDriver = webDriver;
        this.wdwait = wdwait;
        PageFactory.initElements(this.webDriver, this);
    }

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]")
    private WebElement yesButton;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/label[1]")
    private WebElement impressiveButton;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/label[1]")
    private WebElement noButton;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/p[1]")
    private WebElement resultText;

    public WebElement getResultText() {
        return resultText;
    }

    public WebElement getYesButton() {
        return yesButton;
    }

    public WebElement getImpressiveButton() {
        return impressiveButton;
    }

    public WebElement getNoButton() {
        return noButton;
    }

    public void clickYes(){
        yesButton.click();
    }

    public void clickImpressive(){
        impressiveButton.click();
    }

    public void clickNo(){
        noButton.click();
    }
}
