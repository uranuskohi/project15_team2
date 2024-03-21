package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_05_StepDefs {

    @When("Admin sees the new Deans Name {string}")
    public void admin_sees_the_new_deans_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Admin can delete new Dean")
    public void admin_can_delete_new_dean() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify new Dean is now not there")
    public void verify_new_dean_is_now_not_there() {
        WaitUtils.waitFor(5);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertTrue("The delete button should be visible",false);
    }
    }




