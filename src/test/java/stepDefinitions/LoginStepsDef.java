package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.bidi.log.Log;
import pages.LoginPage;
import utils.ExcelUtils;

import java.util.Map;

public class LoginStepsDef extends BaseClass {

    LoginPage loginPage;
    Map<String, String> data;

    @Given("I launch the application")
    public void iLaunchTheApplication() {
        launchBrowser();
    }

    @When("I enter valid credentials from {int}")
    public void iEnterValidCredentials(int rowNum) {
        data = ExcelUtils.getRowData("src/test/resources/TestDataFiles/Testdata.xlsx", "Credentials", rowNum);
        loginPage.login(data.get("UserName"), data.get("Password"));
    }


    @Then("I verify welcome Message as {string}")
    public void iVerifyWelcomeMessageAs(String welcomeMessage) {
        loginPage.verifyWelcomeMessage(welcomeMessage);
    }
}
