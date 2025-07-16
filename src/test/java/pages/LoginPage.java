package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='user_login']")
    WebElement username;

    @FindBy(xpath = "//input[@id='user_password']")
    WebElement password;

    @FindBy(xpath = "//input[@value='Sign In']")
    WebElement signInBtn;

    public void login(String user, String pass){

        username.sendKeys(user);
        password.sendKeys(pass);
        signInBtn.click();
    }

}
