package allOverCommerce.stepdefinitions;


import allOverCommerce.utilities.ConfigReader;
import allOverCommerce.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp() throws Exception {
        //Driver.getDriver().get(ConfigReader.getProperty("allOverCommerceUrl"));
        System.out.println("Before çalıştı.");

    }
    @After//import io.cucumber.java.After;
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {//-->Scenario fail olursa
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg",  scenario.getName());
            Driver.quitDriver();
        }
    }
    //Bu method fail olan scenario'larda fail olan kısmın resmini rapora ekleyecektir.
}
