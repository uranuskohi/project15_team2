package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import pages.Choose_Lesson_Management_Page;
import pages.Lessons_Page;
import utilities.BrowserUtils;
import utilities.WaitUtils;

import static org.junit.Assert.*;

public class US_08_StepDefs {

    Lessons_Page lessonsPage;

    @When("click on Lessons")
    public void click_on_lessons() {
        lessonsPage = new Lessons_Page();
        lessonsPage.lessons.click();
    }

    @When("enter {string} in the Lesson Name")
    public void enter_in_the_lesson_name(String lessonName) {
        BrowserUtils.sendKeysWithTimeout(lessonsPage.lessonNameField, lessonName,2);
    }

    @When("check if Compulsory radio button is clickable")
    public void check_if_compulsory_radio_button_is_clickable() {

    }

    @When("click on Compulsory radio button")
    public void click_on_compulsory_radio_button() {
        lessonsPage.compulsoryRadioButton.click();
    }

    @When("add {string} in the Credit Score")
    public void add_in_the_credit_score(String CreditScore) {
        BrowserUtils.sendKeysWithTimeout(lessonsPage.creditScoreField, CreditScore, 2);
    }

    @When("click on Submit button")
    public void click_on_submit_button() {
        lessonsPage.submitButtonForLessons.click();
//        chooseLessonManagementPage.submitButtonInChooseLessonManagement.click();
    }

    @Then("verify the Lesson is created")
    public void verify_the_lesson_is_created() {
        WaitUtils.waitFor(1);
        assertTrue(lessonsPage.lessonCreatedVerification.isDisplayed());
//        Driver.getDriver().switchTo().alert().getText().contains("Lesson Created");
    }



// ------------------------------------------------------------------------------------------------------------------------
//    TC_02

    @When("leave {string} empty")
    public void leave_empty(String CompulsoryRadioButton) {

    }

    @When("don't add Credit Score")
    public void don_t_add_credit_score() {

    }


    @Then("verify the Lesson is not created")
    public void verifyTheLessonIsNotCreated() {
        WaitUtils.waitFor(1);
        assertTrue(lessonsPage.requiredFiledErrorMessage.isDisplayed());
    }
}
