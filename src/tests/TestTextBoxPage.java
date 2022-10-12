package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Basic;

import java.util.ArrayList;
import java.util.List;

public class TestTextBoxPage extends Basic {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;

    @BeforeClass
    public void pageSetUp (){
        homePage.goToElements();
        sidebarPage.textBox.click();
    }

    @Test
    public void happyFlow (){
        fullName = Faker.instance().funnyName().name();
        email = Faker.instance().internet().emailAddress();
        currentAddress = Faker.instance().address().fullAddress();
        permanentAddress = Faker.instance().address().secondaryAddress();
        textBoxPage.sendFullName(fullName);
        textBoxPage.sendEmail(email);
        textBoxPage.sendCurrentAddress(currentAddress);
        textBoxPage.sendPermanentAddress(permanentAddress);
        textBoxPage.clickSubmit();
        scrollIntoView(textBoxPage.getConformationBox());
        Assert.assertTrue(containtsString(textBoxPage.getConformationBox().getText(), new ArrayList<>(List.of(fullName,email,currentAddress,permanentAddress))), "Conformation box error");
    }

    @Test
    public void invalidEmail() {
        fullName = Faker.instance().funnyName().name();
        email = Faker.instance().internet().emailAddress().replace("@", "&");
        currentAddress = Faker.instance().address().fullAddress();
        permanentAddress = Faker.instance().address().secondaryAddress();
        textBoxPage.sendFullName(fullName);
        textBoxPage.sendEmail(email);
        textBoxPage.sendCurrentAddress(currentAddress);
        textBoxPage.sendPermanentAddress(permanentAddress);
        textBoxPage.clickSubmit();
        Assert.assertFalse(textBoxPage.getConformationBox().isDisplayed(), "Email should be invalid");
    }
}
