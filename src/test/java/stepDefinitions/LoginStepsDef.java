package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.bidi.log.Log;
import pages.LoginPage;

public class LoginStepsDef extends BaseClass {

    LoginPage loginPage;

    @Given("I launch the application")
    public void iLaunchTheApplication() {
        launchBrowser();
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {

//        loginPage.login();
    }
}
