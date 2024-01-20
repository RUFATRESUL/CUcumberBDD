package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.herokuappPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResubleMethods;

public class herokuappStepDefination {
    herokuappPage page = new herokuappPage();
    @Given("istifadeci {string} home sehifesine geder")
    public void istifadeciHomeSehifesineGeder(String url) {
        Driver.getDriver().get(ConfigReader.getPropertie(url));
    }

    @And("add element button basar")
    public void addElementButtonBasar() {
        page.addButton.click();
    }

    @And("istifadeci {int} saniye gozluyer")
    public void istifadeciSaniyeGozluyer(int saniye) {
        ResubleMethods.waitFor(saniye);
    }

    @Then("Delete button gorunene qeder gozluyer")
    public void deleteButtonGoruneneQederGozluyer() {
        ResubleMethods.waitForVisibility(page.deleteButton,10);
    }

    @And("delete buttonu gorunur oldugunu test eder")
    public void deleteButtonuGorunurOldugunuTestEder() {
        Assert.assertTrue(page.deleteButton.isDisplayed());
    }

    @Then("Delete buttonuna basar")
    public void deleteButtonunaBasar() {
        page.deleteButton.click();
    }

    @And("Delete buttonunun gorunmedigini test eder")
    public void deleteButtonununGorunmediginiTestEder() {
        Assert.assertTrue(page.deleteButtonList.isEmpty());

    }
}
