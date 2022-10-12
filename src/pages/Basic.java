package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;

public class Basic {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
//    public WebTablesPage webTablesPage;
//    public ButtonsPage buttonsPage;
//    public LinksPage linksPage;
//    public BrokenLinksImagesPage brokenLinksImagesPage;
//    public UploadAndDownloadPage uploadAndDownloadPage;
//    public DynamicPropertiesPage dynamicPropertiesPage;
    public BrowserWindowsPage browserWindowsPage;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);
        checkBoxPage = new CheckBoxPage(driver, wdwait);
        radioButtonPage = new RadioButtonPage(driver, wdwait);
//        webTablesPage = new WebTablesPage(driver, wdwait);
//        buttonsPage = new ButtonsPage(driver, wdwait);
//        linksPage = new LinksPage(driver, wdwait);
//        brokenLinksImagesPage = new BrokenLinksImagesPage(driver, wdwait);
//        uploadAndDownloadPage = new UploadAndDownloadPage(driver, wdwait);
//        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wdwait);
        browserWindowsPage = new BrowserWindowsPage(driver, wdwait);

    }

    public void visabilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickabilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public boolean containtsString(String prvi, ArrayList<String> lista) {
        boolean nijeTu = true;
        for (String clan : lista) {
            if (!prvi.toLowerCase().contains(clan.toLowerCase())) {
                nijeTu = false;
                break;
            }
        }
        return nijeTu;
    }

    @BeforeMethod
    public void refresh(){
        driver.navigate().refresh();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}