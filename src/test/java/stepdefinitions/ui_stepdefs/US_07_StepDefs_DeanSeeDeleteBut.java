package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Then;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_07_StepDefs_DeanSeeDeleteBut {

    @Then("verify ability to delete message")
    public void verify_ability_to_delete_message() {
        WaitUtils.waitFor(5);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertTrue("The delete button should be visible",false);
    }

}
