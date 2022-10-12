package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {
    private WebDriver webDriver;
    private WebDriverWait wdwait;
    public CheckBoxPage (WebDriver webDriver, WebDriverWait wdwait) {
        this.webDriver = webDriver;
        this.wdwait = wdwait;
        PageFactory.initElements(this.webDriver, this);
    }

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]")
    private WebElement expandHome;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]")
    private WebElement checkHome;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]")
    private WebElement expandAll;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[2]")
    private WebElement shrinkAll;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]")
    private WebElement expandDesktop;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]")
    private WebElement expandDocuments;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]")
    private WebElement expandDownloads;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/button[1]")
    private WebElement expandWorkSpace;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/button[1]")
    private WebElement expandOffice;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]")
    private WebElement checkVeu;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]")
    private WebElement checkWorkSpace;

    @FindBy (xpath = "//input[@id='tree-node-veu']")
    private WebElement checkBoxVeu;

    //region Getters
    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWdwait() {
        return wdwait;
    }

    public WebElement getExpandHome() {
        return expandHome;
    }

    public WebElement getCheckHome() {
        return checkHome;
    }

    public WebElement getExpandAll() {
        return expandAll;
    }

    public WebElement getShrinkAll() {
        return shrinkAll;
    }

    public WebElement getExpandDesktop() {
        return expandDesktop;
    }

    public WebElement getExpandDocuments() {
        return expandDocuments;
    }

    public WebElement getExpandDownloads() {
        return expandDownloads;
    }

    public WebElement getExpandWorkSpace() {
        return expandWorkSpace;
    }

    public WebElement getExpandOffice() {
        return expandOffice;
    }

    public WebElement getCheckVeu() {
        return checkVeu;
    }
    //endregion

    //region Expand
    public void clickExpandHome(){
        expandHome.click();
    }

    public void clickExpandAll(){
        expandAll.click();
    }

    public void clickShrinkAll(){
        shrinkAll.click();
    }

    public void clickExpandDesktop(){
        expandDesktop.click();
    }

    public void clickExpandDocuments(){
        expandDocuments.click();
    }

    public void clickExpandDownloads(){
        expandDownloads.click();
    }

    public void clickExpandWorkSpace(){
        expandWorkSpace.click();
    }

    public void clickExpandOffice(){
        expandOffice.click();
    }

    //endregion

    //region Checkers
    public void clickCheckVeu(){
        checkVeu.click();
    }

    public void clickCheckWorkSpace(){
        checkWorkSpace.click();
    }

    public void clickCheckHome(){
        checkHome.click();
    }

    //endregion

    //region checkboxes
    public WebElement getCheckBoxVeu() {
        return checkBoxVeu;
    }

    //endregion
}
