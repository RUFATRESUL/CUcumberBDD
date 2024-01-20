package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class brcPage {
    public brcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/div[2]/ul/li[5]/a")
    public WebElement login_button;
    @FindBy(id = "formBasicEmail")
    public WebElement emailBox;

    @FindBy(xpath="//*[@class='btn btn-primary']")
    public WebElement loginAccess;

}
