package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Dean_Management_Page;
import utilities.BrowserUtils;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_05_StepDefs {

    Dean_Management_Page deanManagementPage = new Dean_Management_Page();



    @When("Admin sees the new Deans Name {string}")
    public void admin_sees_the_new_deans_name(String string) {
        BrowserUtils.clickWithTimeOut(deanManagementPage.lastPageButton,2);
        assertTrue(deanManagementPage.firstName.isDisplayed());

    }
    @When("Admin can delete new Dean")
    public void admin_can_delete_new_dean() {
        WaitUtils.waitFor(5);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertTrue("The delete button should be visible",false);
    }


    @Then("verify new Dean is now not there")
    public void verify_new_dean_is_now_not_there() {

    }
}



