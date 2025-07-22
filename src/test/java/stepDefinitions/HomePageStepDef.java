package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;

import java.util.List;
import java.util.Map;

public class HomePageStepDef {

    HomePage homePage;

    @Then("I click Add lead button")
    public void clickAddBtn(){
//        homePage.clickElement();
    }

    @And("I fill the lead details")
    public void iFillTheLeadDetails(DataTable dataTable) {

        List<Map<String, String>> leads = dataTable.asMaps(String.class, String.class);

        for(Map<String, String> lead: leads){
            String firstname = lead.get("FirstName");
            String lastname = lead.get("LastName");
            String phone = lead.get("Phone");
           String project = lead.get("Project");


        }
    }
}
