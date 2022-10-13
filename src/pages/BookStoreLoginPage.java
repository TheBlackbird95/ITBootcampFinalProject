package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreLoginPage {
    private WebDriver webDriver;
    private WebDriverWait wdwait;

    public BookStoreLoginPage(WebDriver webDriver, WebDriverWait wdwait) {
        this.webDriver = webDriver;
        this.wdwait = wdwait;
        PageFactory.initElements(this.webDriver, this);
    }

    @FindBy (id = "userName")
    private WebElement userName;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (id = "login")
    private WebElement loginButton;

    @FindBy (id = "newUser")
    private WebElement newUserButton;

    @FindBy (id = "firstname")
    private WebElement firstName;

    @FindBy (id = "lastname")
    private WebElement lastName;

    @FindBy (id = "submit")
    private WebElement logOutButton;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[1]/button[1]")
    private WebElement registerButton;

    @FindBy (id = "gotologin")
    private WebElement backToLogin;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/div/div/iframe")
    private WebElement captchaIFrame;

    @FindBy (xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
    private WebElement captchaCheckbox;

    public void clickLogin(){
        loginButton.click();
    }

    public void clickNewUser(){
        newUserButton.click();
    }

    public void sendUserName(String user){
        userName.sendKeys(user);
    }

    public void sendPassword(String pass){
        password.sendKeys(pass);
    }

    public void sendFirstName(String name){
        firstName.sendKeys(name);
    }

    public void sendLastName(String last){
        lastName.sendKeys(last);
    }

    public void clickLogOut(){
        logOutButton.click();
    }

    public void clickRegister(){
        registerButton.click();
    }

    public void clickBackToLogin(){
        backToLogin.click();
    }

    public void reCaptcha(){
        webDriver.switchTo().frame(captchaIFrame);
        captchaCheckbox.click();
    }
}
