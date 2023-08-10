package allOverCommerce.utilities;

import allOverCommerce.pages.AllOverCommerce;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ReusableMethods {

    //HARD WAIT METHOD
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Alert ACCEPT
    public static void alertAccept() {
        Driver.getDriver().switchTo().alert().accept();
    }

    //Alert DISMISS
    public static void alertDismiss() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText() {
        Driver.getDriver().switchTo().alert().getText();
    }

    //Alert promptBox
    public static void alertprompt(String text) {
        Driver.getDriver().switchTo().alert().sendKeys(text);
    }

    //DropDown VisibleText
    /*
        Select select2 = new Select(gun);
        select2.selectByVisibleText("7");

        //ddmVisibleText(gun,"7"); --> Yukarıdaki kullanım yerine sadece method ile handle edebilirim
     */
    public static void ddmVisibleText(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByVisibleText(secenek);
    }
    //DropDown Index
    public static void ddmIndex(WebElement ddm, int index) {
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //DropDown Value
    public static void ddmValue(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByValue(secenek);
    }

    //SwitchToWindow1
    public static void switchToWindow(int sayi) {
        List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tumWindowHandles.get(sayi));
    }

    //SwitchToWindow2
    public static void window(int sayi) {
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[sayi].toString());
    }
    //EXPLICIT WAIT METHODS

    //Visible Wait
    public static void visibleWait(WebElement element, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    //VisibleElementLocator Wait
    public static WebElement visibleWait(By locator, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    //WaitForClickablility Wait Element
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    //WaitForClickablility Wait Locator
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    //Alert Wait
    public static void alertWait(int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.alertIsPresent());

    }

    //Tüm Sayfa ScreenShot
    public static void tumSayfaResmi(String userStoryNumber,String pageName) {
        String tarih = new SimpleDateFormat("hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "reportsandimages/images/us_"+userStoryNumber+"_images/webpage/" +tarih+"_"+pageName+ ".png";
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //WebElement ScreenShot
    public static void webElementResmi(String userStoryNumber,WebElement element, String elementName) {
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());

        String dosyaYolu = "reportsandimages/images/us_"+userStoryNumber+"_images/webelement/" + tarih +"_"+elementName+ ".png";
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        try {
            FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getScreenshot(String userStoryNumber,String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        // full path to the screenshot location
        String dosyaYolu = System.getProperty("user.dir") + "/target/Screenshots/wepPage/US_"+userStoryNumber+"/"+ name + date + ".png";
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            // save the screenshot to the path given
            FileUtils.copyFile(source, new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dosyaYolu;
    }

    //WebTable
    public static void printData(int satir, int sutun) {
        WebElement satirSutun = Driver.getDriver().findElement(By.xpath("(//tbody)[1]//tr[" + satir + "]//td[" + sutun + "]"));
        System.out.println(satirSutun.getText());
    }

    //Click Method
    public static void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    //JS Sayfa Sonu Scroll
    public static void scrollEnd() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //JS Sayfa Başı Scroll
    public static void scrollHome() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //JS SendKeys
    public static void sendKeysJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    //JS SendAttributeValue
    public static void sendAttributeJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    //JS GetAttributeValue
    public static void getValueByJS(String id, String attributeName) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
        System.out.println("Attribute Value: = " + attribute_Value);
    }





    public static void customerLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("allOverCommerceUrl"));
        WebElement signIn = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Sign In']"));
        ReusableMethods.visibleWait(signIn,10);
        ReusableMethods.click(signIn);
        WebElement email = Driver.getDriver().findElement(By.xpath("//*[@id=\"username\"]"));
        ReusableMethods.visibleWait(email,10);
        email.sendKeys(ConfigReader.getProperty("userEmail"),Keys.TAB,ConfigReader.getProperty("userPassword"));
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//*[@name=\"login\"]"));
        signInButton.click();
        WebElement singOutButton= Driver.getDriver().findElement(By.xpath("//*[@class=\"login logout inline-type\"]"));
        ReusableMethods.visibleWait(singOutButton,10);
    }
    public static void vendorLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("allOverCommerceUrl"));
        WebElement signIn = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Sign In']"));
        ReusableMethods.visibleWait(signIn,10);
        ReusableMethods.click(signIn);
        WebElement email = Driver.getDriver().findElement(By.xpath("//*[@id=\"username\"]"));
        ReusableMethods.visibleWait(email,10);
        email.sendKeys(ConfigReader.getProperty("vendorEmail"),Keys.TAB,ConfigReader.getProperty("vendorPassword"));
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//*[@name=\"login\"]"));
        signInButton.click();
        WebElement singOutButton= Driver.getDriver().findElement(By.xpath("//*[@class=\"login logout inline-type\"]"));
        ReusableMethods.visibleWait(singOutButton,10);
    }
    public static void forNegativeTestVendorLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("allOverCommerceUrl"));
        WebElement signIn = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Sign In']"));
        ReusableMethods.visibleWait(signIn,10);
        ReusableMethods.click(signIn);
        WebElement email = Driver.getDriver().findElement(By.xpath("//*[@id=\"username\"]"));
        ReusableMethods.visibleWait(email,10);
        email.sendKeys(ConfigReader.getProperty("vendor2Email"),Keys.TAB,ConfigReader.getProperty("vendor2Password"));
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//*[@name=\"login\"]"));
        signInButton.click();
        WebElement singOutButton= Driver.getDriver().findElement(By.xpath("//*[@class=\"login logout inline-type\"]"));
        ReusableMethods.visibleWait(singOutButton,10);
    }
    public static void customerLoginUS07_08(){
        Driver.getDriver().get(ConfigReader.getProperty("allOverCommerceUrl"));
        WebElement signIn = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Sign In']"));
        ReusableMethods.visibleWait(signIn,10);
        ReusableMethods.click(signIn);
        WebElement email = Driver.getDriver().findElement(By.xpath("//*[@id=\"username\"]"));
        ReusableMethods.visibleWait(email,10);
        email.sendKeys(ConfigReader.getProperty("userEmailKayne"),Keys.TAB,ConfigReader.getProperty("userPasswordKayne"));
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//*[@name=\"login\"]"));
        signInButton.click();
        WebElement singOutButton= Driver.getDriver().findElement(By.xpath("//*[@class=\"login logout inline-type\"]"));
        ReusableMethods.visibleWait(singOutButton,10);
    }


    public static void becomeaVendorKayit() {
        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allOverCommerceUrl"));

        //Register butonuna tıkla
        AllOverCommerce allOverCommerce = new AllOverCommerce();
        allOverCommerce.registerButton.click();

        // Sign up da "Become a Vendor"a tıkla
        allOverCommerce.becomeaVendor.click();

        //Email gir
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeEmailUrl"));
        ReusableMethods.click(allOverCommerce.fakeMailCopy);
        ReusableMethods.switchToWindow(0);
        allOverCommerce.emailKutusu.sendKeys(Keys.CONTROL, "v");
        ReusableMethods.switchToWindow(1);
        ReusableMethods.bekle(10);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(3);
        ReusableMethods.click(allOverCommerce.codeEmail);
        String code = allOverCommerce.verificationCode.getText().replaceAll("\\D", "");
        System.out.println("code = " + code);
        ReusableMethods.switchToWindow(0);
        //Verification code sent to your email: görünürlüğünü doğrula
        Assert.assertTrue(allOverCommerce.verificationMessage.isDisplayed());
        //Emaile gönderilen kodu re-send code yap
        //Büyük- küçük harf,rakam ve special karakter içeren Password gir
        //Confirm password gir
        //Register'a tıklayarak kaydı tamamla
        Faker faker = new Faker();
        String password = faker.internet().password();
        allOverCommerce.recendKutusu.sendKeys(code, Keys.TAB, Keys.TAB, password, Keys.TAB, password, Keys.TAB, Keys.ENTER);
        // Register succesfull completed mesajını gördüğünü doğrula
        Assert.assertTrue(allOverCommerce.SuccessfullyCompleted.isDisplayed());
        //Welcome to Allover Commerce! Not Right Now'a tıkla
        ReusableMethods.click(allOverCommerce.notRightNowButton);
        //Sign out butonuna tıkla
        ReusableMethods.click(allOverCommerce.signinOut);
        // Are you sure you want to log out? Confirm and log out çıkış yap
        ReusableMethods.click(allOverCommerce.logOut);

    }


    public static void LG_VendorLoginUS11_12(){
        Driver.getDriver().get(ConfigReader.getProperty("allOverCommerceUrl"));
        WebElement signIn = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Sign In']"));
        ReusableMethods.visibleWait(signIn,10);
        ReusableMethods.click(signIn);
        WebElement email = Driver.getDriver().findElement(By.xpath("//*[@id=\"username\"]"));
        ReusableMethods.visibleWait(email,10);
        email.sendKeys(ConfigReader.getProperty("LG_VendorEmail"),Keys.TAB,ConfigReader.getProperty("LG_VendorPassword"));
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//*[@name=\"login\"]"));
        signInButton.click();
        WebElement singOutButton= Driver.getDriver().findElement(By.xpath("//*[@class=\"login logout inline-type\"]"));
        ReusableMethods.visibleWait(singOutButton,10);
    }
    public static void VendorSignInLG(){
        WebDriverManager.chromedriver().setup();
        Driver.driver = new ChromeDriver();
        Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Driver.driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));//backend servislerin bitmesini bekliyor
//        login as seller
        Driver.driver.manage().window().maximize();
        Driver.driver.get("https://allovercommerce.com/");
        WebElement registerLink = Driver.driver.findElement(By.xpath("//a[contains(.,'Register')]"));
        registerLink.click();
        WebElement becomeAVendorLink = Driver.driver.findElement(By.xpath("//a[contains(.,'Become a Vendor')]"));
        becomeAVendorLink.click();
        Faker faker = new Faker();
        String userEmail = faker.name().firstName() + "@yopmail.com";
        WebElement emailInputField = Driver.driver.findElement(By.id("user_email"));
        emailInputField.sendKeys(userEmail, Keys.TAB);
        WebDriverWait wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(Driver.driver.findElement(By.xpath("//div[@class='wcfm-message email_verification_message wcfm-success']"))));
        String ecommerceWindowHanlde = Driver.driver.getWindowHandle();
        Keys.chord(Keys.CONTROL, Keys.ENTER);
        ((JavascriptExecutor) Driver.driver).executeScript("window.open()");
        Set<String> windowHandles = Driver.driver.getWindowHandles();
        String yopmailWindowHanldle = windowHandles.stream().filter(windowHandle -> !windowHandle.equals(ecommerceWindowHanlde)).findFirst().get();
        Driver.driver.switchTo().window(yopmailWindowHanldle);
        Driver.driver.get("https://yopmail.com/");
        Driver.driver.findElement(By.id("login")).sendKeys(userEmail);
        Driver.driver.findElement(By.xpath("//button[@class='md']")).click();;
        Driver.driver.switchTo().frame("ifmail");
        String code = Driver.driver.findElement(By.tagName("b")).getText();
        Driver.driver.switchTo().window(ecommerceWindowHanlde);
        Driver.driver.findElement(By.xpath("//input[@name='wcfm_email_verified_input']")).sendKeys(code);
        String password = faker.funnyName() + "+" + faker.name();
        Driver.driver.findElement(By.id("passoword")).sendKeys(password);
        Driver.driver.findElement(By.id("confirm_pwd")).sendKeys(password);
        ReusableMethods.click(Driver.driver.findElement(By.xpath("//input[@value=\"Register\"]")));
        //Assert.assertTrue(wait.until(ExpectedConditions.titleIs("Vendor Store › Setup Wizard")), "REgistered user titel is not as expected");
        Driver.driver.navigate().back();
        AllOverCommerce allOverCommerce = new AllOverCommerce();
        Keys.chord(Keys.END);
        ReusableMethods.click(allOverCommerce.MyAccountClick);
        Keys.chord(Keys.PAGE_DOWN);
        ReusableMethods.click(allOverCommerce.Add_resses);
        ReusableMethods.click(allOverCommerce.ADD);
        Keys.chord(Keys.PAGE_DOWN,Keys.PAGE_DOWN);
        String actualEmailVerify=userEmail;
        String expectedEmailVerify="@yopmail.com";
        Assert.assertTrue(actualEmailVerify.contains(expectedEmailVerify));
    }

}
