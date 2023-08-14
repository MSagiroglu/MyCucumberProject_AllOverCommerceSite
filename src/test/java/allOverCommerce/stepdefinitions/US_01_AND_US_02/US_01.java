package allOverCommerce.stepdefinitions.US_01_AND_US_02;

import allOverCommerce.pages.AllOverCommerce;
import allOverCommerce.utilities.ConfigReader;
import allOverCommerce.utilities.Driver;
import allOverCommerce.utilities.ExcelReader;
import allOverCommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;

import java.util.Map;


public class US_01 {
    AllOverCommerce allOverCommerce = new AllOverCommerce();
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
        String message = allOverCommerce.checkBox.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Please check this box if you want to proceed."));

    }

    @And("Username kutucuğuna geçerli bir {string} girer")
    public void usernameKutucugunaGecerliBirGirer(String username) {
        allOverCommerce.username.sendKeys(faker.name().firstName() + faker.number().numberBetween(1, 100));
    }

    @And("Mail kutucuğuna geçerli bir {string} mail girer")
    public void mailKutucugunaGecerliBirMailGirer(String mail) {
        allOverCommerce.registerEmail.sendKeys(Keys.CONTROL, "v");
    }

    @And("Password kutucuğuna geçerli bir {string} girer")
    public void passwordKutucugunaGecerliBirPasswordGirer(String password) {
        allOverCommerce.registerPassword.sendKeys(faker.internet().password());
    }

    @Then("Data table verilerini gerekli yerlere girer checkbox kutucuğuna tıklamadan kayıt olunamadığını doğrular")
    public void dataTableVerileriniGerekliYerlereGirer(DataTable data) {

        for (Map<String, String> w:data.asMaps()){
            allOverCommerce.username.sendKeys(w.get("username"));
            allOverCommerce.registerEmail.sendKeys(w.get("mail"));
            allOverCommerce.registerPassword.sendKeys(w.get("password"));
            allOverCommerce.signUp.click();
            String message = allOverCommerce.checkBox.getAttribute("validationMessage");
            Assert.assertTrue(message.contains("İlerlemek istiyorsanız lütfen bu kutuyu işaretleyin."));
            Driver.getDriver().navigate().refresh();
            allOverCommerce.registerButton.click();
        }

        //allOverCommerce.username.sendKeys(data.row(1).get(0));
        //allOverCommerce.registerEmail.sendKeys(data.row(1).get(1));
        //allOverCommerce.registerPassword.sendKeys(data.row(1).get(2));
        //allOverCommerce.signUp.click();
        //String message = allOverCommerce.checkBox.getAttribute("validationMessage");
        //Assert.assertTrue(message.contains("İlerlemek istiyorsanız lütfen bu kutuyu işaretleyin."));
        //Driver.getDriver().navigate().refresh();
        //allOverCommerce.registerButton.click();
        //allOverCommerce.username.sendKeys(data.row(2).get(0));
        //allOverCommerce.registerEmail.sendKeys(data.row(2).get(1));
        //allOverCommerce.registerPassword.sendKeys(data.row(2).get(2));
        //allOverCommerce.signUp.click();
        //message = allOverCommerce.checkBox.getAttribute("validationMessage");
        //Assert.assertTrue(message.contains("İlerlemek istiyorsanız lütfen bu kutuyu işaretleyin."));
//

    }

    @When("Kullanıcı excel dosyasındaki {string} sayfasındaki bilgileri girer")
    public void kullanıcıExcelDosyasındakiSayfasındakiBilgileriGirer(String sayfaIsmi) {
        String filePath="excelData/MyDatas.xlsx";
        ExcelReader excelReader=new ExcelReader(filePath,sayfaIsmi);
        for (int i = 1; i <=excelReader.rowCount() ; i++) {
            String username = excelReader.getCellData(i, 0);
            String mail = excelReader.getCellData(i, 1);
            String password = excelReader.getCellData(i, 2);
            allOverCommerce.username.sendKeys(username);
            allOverCommerce.registerEmail.sendKeys(mail);
            allOverCommerce.registerPassword.sendKeys(password);
            allOverCommerce.checkBox.click();
            allOverCommerce.signUp.click();
            ReusableMethods.bekle(5);
            Assert.assertTrue(allOverCommerce.verifySignOut.isDisplayed());
            allOverCommerce.signOut.click();
            allOverCommerce.logOut1.click();
            allOverCommerce.register.click();
            allOverCommerce.signUp.click();
<<<<<<< HEAD
=======

>>>>>>> a2842cc477a5621eb5a709f981501e0a381aeb3a
        }

    }
}
