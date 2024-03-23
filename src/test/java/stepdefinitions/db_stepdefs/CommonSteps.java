package stepdefinitions.db_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

public class CommonSteps {

    @Given("user connects to application database")
    public void user_connects_to_application_database() {
        DBUtils.createConnection();
    }


    @Then("user terminate connection")
    public void user_terminate_connection() {DBUtils.closeConnection();    }


}