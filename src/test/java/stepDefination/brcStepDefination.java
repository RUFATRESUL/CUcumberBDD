package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.brcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class brcStepDefination {
    brcPage page = new brcPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("istifadeci {string} sehifesine gedir")
    public void istifadeci_sehifesine_gedir(String istenilenURL) {
        Driver.getDriver().get(ConfigReader.getPropertie(istenilenURL));
    }
    @Then("login yazisina click eder")
    public void login_yazisina_click_eder() {
        page.login_button.click();
    }
    @Then("istifadeci kecersiz email daxil eder")
    public void istifadeci_kecersiz_email_daxil_eder() {
        page.emailBox.sendKeys(ConfigReader.getPropertie("wrongEmail"));
    }
    @Then("istifadeci yanlis password daxil eder")
    public void istifadeci_yanlis_password_daxil_eder() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getPropertie("wrongPassword")).perform();

    }
    @Then("istifadeci login button click eder")
    public void istifadeci_login_button_click_eder() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }
    @Then("sehifeye giris edile bilmese test eder")
    public void sehifeye_giris_edile_bilmese_test_eder() {
        Assert.assertTrue(page.loginAccess.isDisplayed());

    }
}
