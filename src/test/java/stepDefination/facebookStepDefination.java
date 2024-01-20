package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResubleMethods;

public class facebookStepDefination {
    @Given("istifadeci {string} sehifesine geder")
    public void istifadeci_sehifesine_geder(String istenilenURL) {
        Driver.getDriver().get(ConfigReader.getPropertie(istenilenURL));

    }
    @Then("istifadeci {int} saniye gozluyur")
    public void istifadeci_saniye_gozluyur(Integer gozlemeVaxti) {
        ResubleMethods.waitFor(gozlemeVaxti);

    }
    @When("url in {string} oldugunu test et")
    public void url_in_oldugunu_test_et(String istenilenSoz) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(istenilenSoz));

    }
    @When("sehifeni bagla")
    public void sehifeni_bagla() {
        Driver.closeDriver();

    }
    @When("url in {string} oldugunu test eder")
    public void url_in_oldugunu_test_eder(String urlBasligi) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(urlBasligi));

    }



}
