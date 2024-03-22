package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Then;
import pages.Main_Page;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_07_StepDefs_DeanSeeDeleteBut {

    Main_Page mainPage = new Main_Page();

//    @Then("verify ability to delete message")
//    public void verify_ability_to_delete_message() {
//        WaitUtils.waitFor(5);
//        try {
//            MediaUtils.takeScreenshotOfTheEntirePage();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        assertTrue("The delete button should be visible",false);
//    }

    @Then("verify the ability to delete message")
    public void verifyTheAbilityToDeleteMessage() {
        assertTrue("delete button not visible", false);
    }
}
