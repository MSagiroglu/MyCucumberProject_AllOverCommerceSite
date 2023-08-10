package allOverCommerce.stepdefinitions.US_01_AND_US_02;

import allOverCommerce.pages.AllOverCommerce;
import allOverCommerce.utilities.ConfigReader;
import allOverCommerce.utilities.Driver;
import allOverCommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;


public class US_01 {
    AllOverCommerce allOverCommerce= new AllOverCommerce();
    Faker faker = new Faker();
    @Given("AllOverCommerce sitesine gider")
    public void allovercommerceSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("allOverCommerceUrl"));
    }

    @And("Register butonunu tıklar")
    public void registerButonunuTıklar() {
        allOverCommerce.register.click();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeEmailUrl"));
        ReusableMethods.click(allOverCommerce.fakeMailCopy);
        ReusableMethods.switchToWindow(0);

    }

    @And("Username kutucuğuna geçerli bir username girer")
    public void usernameKutucugunaGecerliBirUsernameGirer() {
        allOverCommerce.username.sendKeys(faker.name().firstName()+faker.number().numberBetween(1,100));
    }

    @And("Mail kutucuğuna geçerli bir mail girer")
    public void mailKutucugunaGecerliBirMailGirer() {
       allOverCommerce.registerEmail.sendKeys(Keys.CONTROL,"v");

    }

    @And("Password kutucuğuna geçerli bir password girer")
    public void passwordKutucugunaGecerliBirPasswordGirer() {
        String password = faker.internet().password();
        allOverCommerce.registerPassword.sendKeys(password);
    }


    @And("I agree to the privacy policy kutucuğuna tıklar")
    public void ıAgreeToThePrivacyPolicyKutucugunaTıklar() {
        allOverCommerce.checkBox.click();
    }

    @When("Sign up butonuna tıklar")
    public void signUpButonunaTıklar() {
        allOverCommerce.signUp.click();
    }

    @Then("Kayıt işleminin başarıyla gerçekleştiğini doğrular")
    public void kayıtIslemininBasarıylaGerceklestiginiDogrular() {
        Assert.assertTrue(allOverCommerce.verifySignOut.isDisplayed());

    }



    @But("Kullanıcı {int} saniye bekler")
    public void kullanıcıSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @When("Sayfayı Kapatır")
    public void sayfayıKapatır() {
        Driver.closeDriver();
    }

    @When("Sekmeleri Kapatır")
    public void sekmeleriKapatır() {
        Driver.quitDriver();
    }

    @Then("Kayıt işleminin başarıyla gerçekleşmediğini doğrular")
    public void kayıtIslemininBasarıylaGerceklesmediginiDogrular() {
        String message=allOverCommerce.checkBox.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("İlerlemek istiyorsanız lütfen bu kutuyu işaretleyin."));

    }
}
