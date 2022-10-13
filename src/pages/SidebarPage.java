package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage {
    private WebDriver webDriver;
    private WebDriverWait wdwait;
    public SidebarPage(WebDriver webDriver, WebDriverWait wdwait) {
        this.webDriver = webDriver;
        this.wdwait = wdwait;
        PageFactory.initElements(this.webDriver, this);
    }

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
    public WebElement textBox;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
    public WebElement checkBox;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")
    public WebElement radioButton;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]")
    public WebElement browserWindows;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]")
    public WebElement bookStoreLogin;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[2]")
    public WebElement bookStoreBookStore;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[3]")
    public WebElement bookStoreProfile;

}
