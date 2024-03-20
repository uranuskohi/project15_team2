package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Contact_Message_Page;
import pages.Main_Page;
import pages.Student_Management_Page;
import utilities.JSUtils;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_16_StepDefs {

    Contact_Message_Page contactMessagePage = new Contact_Message_Page();


    //TC_01
    @Then("verify Name is visible")
    public void verify_name_is_visible() {
       assertTrue(contactMessagePage.nameData.isDisplayed());
    }
    @Then("verify Email is visible")
    public void verify_email_is_visible() {
    assertTrue(contactMessagePage.emailData.isDisplayed());
    }
    @Then("verify Date is visible")
    public void verify_date_is_visible() {
    assertTrue(contactMessagePage.dateData.isDisplayed());
    }
    @Then("verify Subject is visible")
    public void verify_subject_is_visible() {
    assertTrue(contactMessagePage.subjectData.isDisplayed());
    }


    @Then("verify message is visible")
    public void verify_message_is_visible() {
    assertTrue(contactMessagePage.messageData.isDisplayed());
    }



    //TC_02
    @Then("verify ability to delete messages")
    public void verify_ability_to_delete_messages() {
        WaitUtils.waitFor(5);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertTrue("The delete button should be visible",false);
    }



}
