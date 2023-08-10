package allOverCommerce.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Test çalıştırıcı Notasyon(Cucumber ile JUnit i entegre olmasını sağlar)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"allOverCommerce/stepdefinitions"},
        tags = "@US01",//-->  and kulansaydık her iki tag'a sahip olan Scenario yu çalıştırır.
        //--> Eğer Feature'ın tag'ini @all yaparsak o featurenin tüm testlerini çalıştırır ise
        dryRun = false, //-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = false
)
public class Runner {
}
