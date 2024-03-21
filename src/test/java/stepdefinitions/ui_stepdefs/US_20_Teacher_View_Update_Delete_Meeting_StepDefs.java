package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Meet_Management_Page;
import utilities.BrowserUtils;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static utilities.WaitUtils.waitFor;

public class US_20_Teacher_View_Update_Delete_Meeting_StepDefs {
    Meet_Management_Page meetManagementPage = new Meet_Management_Page();
    @Given("the user is on the Meet List page")
    public void theUserIsOnTheMeetListPage() {
        assertTrue(meetManagementPage.meetListTitle.isDisplayed());
    }

    @And("the user sees the meeting arranged from US_19")
    public void theUserSeesTheMeetingArrangedFromUS_() {
        BrowserUtils.verifyElementDisplayed(meetManagementPage.verifyMeetDateIsVisible);
        BrowserUtils.verifyElementDisplayed(meetManagementPage.descriptionVisible);
        assertTrue(meetManagementPage.descriptionVisible.isDisplayed());
        assertTrue(meetManagementPage.verifyMeetDateIsVisible.isDisplayed());
    }

    @When("the user clicks on the Edit button")
    public void theUserClicksOnTheEditButton() {
        meetManagementPage.editButtonAtMeetManagement.click();
        WaitUtils.waitFor(1);
    }

    @And("changes the Date of Meet to {string}")
    public void changesTheDateOfMeetTo(String dateUS20) {
        meetManagementPage.dateOfMeetInEdit.click();
        waitFor(1);
        meetManagementPage.dateOfMeetInEdit.sendKeys(dateUS20);
        waitFor(1);
    }

    @And("clicks Submit")
    public void clicksSubmit() {
        meetManagementPage.submitAtMeetManagement.click();
        //waitFor(1);
    }

    @Then("the user should see the updated meeting details")
    public void theUserShouldSeeTheUpdatedMeetingDetails() {
        //assertTrue(meetManagementPage.meetSavedSuccessfullyPopUp.isDisplayed());
        BrowserUtils.verifyExpectedAndActualTextMatch("Meet Updated Successfully",meetManagementPage.meetUpdatedSuccessfullyPopUp);
        waitFor(1);
//        try {
//            MediaUtils.takeScreenshotOfTheEntirePage();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        assertTrue(meetManagementPage.meetSavedSuccessfullyPopUp.isDisplayed());
    }

    @When("the user clicks on the trash bin icon next to the meeting")
    public void theUserClicksOnTheTrashBinIconNextToTheMeeting() {
        meetManagementPage.editMeetCloseXButton.click();
        waitFor(1);
        meetManagementPage.deleteButtonAtMeetManagement.click();
    }

    @Then("the meeting should be deleted successfully")
    public void theMeetingShouldBeDeletedSuccessfully() {
        BrowserUtils.verifyExpectedAndActualTextMatch("Meet deleted successfully",meetManagementPage.meetDeletedSuccessfullyPopUp);
     //   assertTrue(meetManagementPage.meetDeletedSuccessfullyPopUp.isDisplayed());
    }

    @Then("the user should see the Must be a future date error pop-up message")
    public void theUserShouldSeeTheErrorPopUpMessage() {
        BrowserUtils.verifyExpectedAndActualTextMatch("must be a future date",meetManagementPage.mustBeFutureDateFromEdit);
//        try {
//            MediaUtils.takeScreenshotOfTheEntirePage();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
          assertTrue(meetManagementPage.mustBeFutureDateFromEdit.isDisplayed());
    }

    @When("the user dismisses the error pop-up")
    public void theUserDismissesTheErrorPopUp() {
        meetManagementPage.editMeetCloseXButton.click();
    }
}
