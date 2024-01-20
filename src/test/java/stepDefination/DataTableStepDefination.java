package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTableStepDefination {
    DataTablePage dataTablePage = new DataTablePage();
    Actions actions = new Actions(Driver.getDriver());
    @When("istifadeci {string} anasehifesine geder")
    public void istifadeciAnasehifesineGeder(String url) {
        Driver.getDriver().get(ConfigReader.getPropertie(url));

    }

    @Then("istifadeci new buttonuna basar")
    public void istifadeciNewButtonunaBasar() {
        dataTablePage.newButton.click();
    }

    @And("ad bolmesine {string}yazar")
    public void adBolmesineYazar(String firstname) {
        dataTablePage.firstName.sendKeys(firstname);
    }

    @And("soyad bolmesine {string}yazar")
    public void soyadBolmesineYazar(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
    }

    @And("position bolmesine {string}yazar")
    public void positionBolmesineYazar(String pozisiya) {
        actions.sendKeys(Keys.TAB).sendKeys(pozisiya).perform();
    }

    @And("office bolmesine {string}yazar")
    public void officeBolmesineYazar(String ofis) {
        actions.sendKeys(Keys.TAB).sendKeys(ofis).perform();
    }

    @And("extension bolmesine {string}yazar")
    public void extensionBolmesineYazar(String proqram) {
        actions.sendKeys(Keys.TAB).sendKeys(proqram).perform();
    }

    @And("startDate bolmesine {string}yazar")
    public void startdateBolmesineYazar(String startdate) {
        actions.sendKeys(Keys.TAB).sendKeys(startdate).perform();
    }

    @And("salary bolmesine {string}yazar")
    public void salaryBolmesineYazar(String maas) {
        actions.sendKeys(Keys.TAB).sendKeys(maas).perform();
    }

    @And("istifadeci create buttonuna basar")
    public void istifadeciCreateButtonunaBasar() {
        dataTablePage.create.click();
    }

    @When("istifadeci {string} ile axtaris eder")
    public void istifadeciIleAxtarisEder(String firstname) {
        dataTablePage.searchBox.sendKeys(firstname);
    }

    @And("ad bolmesinde {string} oldugunu test eder")
    public void adBolmesindeOldugunuTestEder(String name) {
        Assert.assertTrue(dataTablePage.result.isDisplayed());
    }

    @Given("sehfeni baglar")
    public void sehfeni_baglar() {

    }
}
