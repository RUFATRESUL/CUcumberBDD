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

public class AmazonStepDefination {
    AmazonPage amazonPage = new AmazonPage();
    @Given("istifadeci amazon sehifesine daxil olar")
    public void istifadeci_amazon_sehifesine_daxil_olar() {
        Driver.getDriver().get(ConfigReader.getPropertie("amazonURL"));

    }
    @When("istifadeci Iphone axtarir")
    public void istifadeci_ıphone_axtarir() {

    }
    @Then("istifadeci Iphone neticelerinin cap eder")
    public void istifadeci_ıphone_neticelerinin_cap_eder() {

    }
    @Then("istifadeci sehifeni baglar")
    public void istifadeci_sehifeni_baglar() {
        Driver.closeDriver();

    }


    @Then("istifadeci {string} ucun axtaris eder")
    public void istifadeci_ucun_axtaris_eder(String axtarilanSoz) {
        amazonPage.seacrhbox.sendKeys(axtarilanSoz,Keys.ENTER);

    }
    @Then("istifadeci {string} oldugunu test etmek")
    public void istifadeci_oldugunu_test_etmek(String axtarisNeticesi) {
        Assert.assertTrue(amazonPage.WE.getText().contains(axtarisNeticesi));

    }
}
