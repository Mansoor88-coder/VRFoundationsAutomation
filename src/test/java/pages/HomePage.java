package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Add Lead']")
    WebElement addBtn;

    @FindBy(xpath = "//input[@id='lead_first_name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lead_last_name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@id='lead_phone']")
    WebElement phoneField;

    @FindBy(xpath = "//input[@value='Save']")
    WebElement saveBtn;

    @FindBy(id = "lead_project_id")
    WebElement projectDD;

    public void clickElement(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element, String value) {
        element.sendKeys(value);
    }


}
