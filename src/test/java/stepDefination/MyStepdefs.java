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

public class MyStepdefs {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getPropertie("amazonURL"));
        ResubleMethods.waitFor(1);
        amazonPage.cookie.click();

    }

//    @When("kullanici iphone aratir")
//    public void kullaniciIphoneAratir() {
//        amazonPage.seacrhbox.sendKeys("Iphone", Keys.ENTER);
//    }
//
//    @Then("kullanici sonuclarin iphone icerdigini test eder")
//    public void kullaniciSonuclarinIphoneIcerdiginiTestEder() {
//        Assert.assertTrue(amazonPage.WE.isDisplayed());
//    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

//    @When("kullanici Selenium axtarir")
//    public void kullaniciSeleniumAxtarir() {
//        amazonPage.seacrhbox.sendKeys("Selenium", Keys.ENTER);
//    }
//
//    @Then("kullanici sonuclarin Selenium icerdigini test eder")
//    public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {
//        Assert.assertTrue(amazonPage.WE.isDisplayed());
//    }

    @When("kullanici {string} aratir")
    public void kullaniciAratir(String searchElement) {
        amazonPage.seacrhbox.sendKeys(searchElement,Keys.ENTER);
    }

    @Then("kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String resultElement) {
        Assert.assertTrue(amazonPage.WE.getText().contains(resultElement));
    }

    @When("kullanici {string} axtarir")
    public void kullaniciAxtarir(String searchElement2) {
        amazonPage.seacrhbox.sendKeys(searchElement2,Keys.ENTER);
    }


}
