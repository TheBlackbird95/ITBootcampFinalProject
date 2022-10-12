package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    private WebDriver webDriver;
    private WebDriverWait wdwait;

    public TextBoxPage(WebDriver webDriver, WebDriverWait wdwait) {
        this.webDriver = webDriver;
        this.wdwait = wdwait;
        PageFactory.initElements(this.webDriver, this);
    }

    @FindBy (id = "userName")
    private WebElement inputFullName;

    @FindBy (id = "userEmail")
    private WebElement inputEmail;

    @FindBy (id = "currentAddress")
    private WebElement inputCurrentAddress;

    @FindBy (id = "permanentAddress")
    private WebElement inputPermanentAddress;

    @FindBy (id = "submit")
    private WebElement buttonSubmit;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]")
    private WebElement conformationBox;

    public WebElement getConformationBox() {
        return conformationBox;
    }

    public void sendFullName (String fullName) {
        inputFullName.sendKeys(fullName);
    }

    public void sendEmail (String email) {
        inputEmail.sendKeys(email);
    }

    public void sendCurrentAddress (String currentAddress){
        inputCurrentAddress.sendKeys(currentAddress);
    }

    public void sendPermanentAddress (String permanentAddress){
        inputPermanentAddress.sendKeys(permanentAddress);
    }

    public void clickSubmit (){
        buttonSubmit.click();
    }
}
