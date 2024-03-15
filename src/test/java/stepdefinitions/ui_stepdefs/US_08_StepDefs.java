package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import pages.Choose_Lesson_Management_Page;
import utilities.BrowserUtils;

public class US_08_StepDefs {

    Choose_Lesson_Management_Page chooseLessonManagementPage;

    @When("click on Lessons")
    public void click_on_lessons() {
        chooseLessonManagementPage.lessons.click();
    }

    @When("enter {string} in the Lesson Name")
    public void enter_in_the_lesson_name(String lessonName) {
        BrowserUtils.sendKeysWithTimeout(chooseLessonManagementPage.lessonNameField, lessonName,2);
    }

    @When("check if Compulsory radio button is clickable")
    public void check_if_compulsory_radio_button_is_clickable() {

    }

    @When("click on Compulsory radio button")
    public void click_on_compulsory_radio_button() {
        chooseLessonManagementPage.compulsoryRadioButton.click();
    }

    @When("add {string} in the Credit Score")
    public void add_in_the_credit_score(String CreditScore) {
        BrowserUtils.sendKeysWithTimeout(chooseLessonManagementPage.creditScoreField, CreditScore, 2);
    }

    @When("click on Submit button")
    public void click_on_submit_button() {
        BrowserUtils.clickWithTimeOut(chooseLessonManagementPage.submitButtonForLessons,2);
    }

    @Then("verify the Lesson is created")
    public void verify_the_lesson_is_created() {

    }


// ------------------------------------------------------------------------------------------------------------------------
//    TC_02

    @When("leave {string} empty")
    public void leave_empty(String string) {

    }

        @When("don't add Credit Score")
        public void don_t_add_credit_score() {

        }















}
