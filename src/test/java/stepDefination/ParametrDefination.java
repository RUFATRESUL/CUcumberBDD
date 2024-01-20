package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResubleMethods;

public class ParametrDefination {
    AmazonPage amazonPage = new AmazonPage();
    @Given("Amazon websehifesine getmek")
    public void amazonWebsehifesineGetmek() {
        ResubleMethods.waitFor(1);
        Driver.getDriver().get(ConfigReader.getPropertie("amazonURL"));
    }

    @When("istifadeci {string} axtarir")
    public void istifadeciAxtarir(String searchProduct) {
        amazonPage.seacrhbox.sendKeys(searchProduct, Keys.ENTER);

    }

    @Then("istifadeci neticelerin {string} oldugunu test eder")
    public void istifadeciNeticelerinOldugunuTestEder(String productResult) {
        Assert.assertTrue(amazonPage.WE.getText().contains(productResult));
    }

    @And("istifadeci websehifeni baglayir")
    public void istifadeciWebsehifeniBaglayir() {
        Driver.closeDriver();
    }
}
