package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class guruStepDefination {
    GuruPage guruPage = new GuruPage();
    @Given("istifadeci {string} home sehifesinde")
    public void istifadeciHomeSehifesinde(String url) {
        Driver.getDriver().get(ConfigReader.getPropertie(url));
    }

    @And("{string} sutunundaki butun deyerleri yazdir")
    public void sutunundakiButunDeyerleriYazdir(String title) {
        int index=0;
        for (int i = 0; i < guruPage.titles.size() ; i++) {
            if (guruPage.titles.get(i).getText().equals(title)){
                System.out.println(guruPage.titles.get(i).getText());
                index = i+1;
                List<WebElement> sutunElement = Driver.getDriver().findElements(By.xpath(" //tbody/tr/td["+index+"]"));
                for (WebElement w:sutunElement) {
                    System.out.println(w.getText());
                    
                }
            }

        }


    }
}
