package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Basic;

public class TestBookStoreLoginPage extends Basic {
    @BeforeTest
    public void pageSetUp() {
        scrollIntoView(homePage.bookStoreApplication);
        homePage.goToBookStoreApplication();
        sidebarPage.bookStoreLogin.click();
    }

    @Test
    public void userRegistration() {
        String firstName = Faker.instance().name().firstName();
        String lastName = Faker.instance().name().lastName();
        String userName = Faker.instance().leagueOfLegends().champion();
        String password = Faker.instance().internet().password(9,11,true,true,true);
        System.out.println(password);

        bookStoreLoginPage.clickNewUser();
        bookStoreLoginPage.sendFirstName(firstName);
        bookStoreLoginPage.sendLastName(lastName);
        bookStoreLoginPage.sendUserName(userName);
        bookStoreLoginPage.sendPassword(password);
        //automatic click on reCaptcha opens new captcha with pictures
        bookStoreLoginPage.reCaptcha();
        bookStoreLoginPage.clickRegister();
        Assert.assertTrue(driver.switchTo().alert().getText().contains("User Register Successfully"));
        driver.switchTo().alert().accept();
        bookStoreLoginPage.clickBackToLogin();
        bookStoreLoginPage.sendUserName(userName);
        bookStoreLoginPage.sendPassword(password);
        bookStoreLoginPage.clickLogin();
    }

    @Test
    public void loginExistingUser(){
        String userName = "perica123";
        String password = "Perko135!";

        bookStoreLoginPage.sendUserName(userName);
        bookStoreLoginPage.sendPassword(password);
        bookStoreLoginPage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
}
