package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class herokuappPage {
    public herokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@onclick='addElement()']")
    public WebElement addButton;

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    public List<WebElement> deleteButtonList;
}
