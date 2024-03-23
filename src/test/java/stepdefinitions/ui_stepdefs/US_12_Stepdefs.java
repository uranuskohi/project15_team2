package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Lesson_Program_Page;
import utilities.BrowserUtils;
import utilities.MediaUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_12_Stepdefs {

    Lesson_Program_Page lessonProgramPage = new Lesson_Program_Page();



    @And("User chooses lesson\\(s) lesson from the provided list")
    public void userChoosesLessonSLessonFromTheProvidedList() {
        BrowserUtils.clickWithTimeOut(lessonProgramPage.chooseLessonCheckBox,2);// always choose the first one
    }

    @And("User selects a teacher {string} from dropdown list")
    public void userSelectsATeacherFromDropdownList(String teacher) {
        BrowserUtils.clickWithTimeOut(lessonProgramPage.chooseTeacher,2);
        assertTrue(lessonProgramPage.chooseTeacher.isSelected());

    }
//    ---------------TC02---------------

    @And("User initially leaves teacher {string} field blank")
    public void userInitiallyLeavesTeacherFieldBlank(String teacher) {

        BrowserUtils.sendKeysWithTimeout(lessonProgramPage.chooseTeacher,teacher,2);

        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("User clicks on the Submit button")
    public void userClicksOnTheSubmitButton() {
        BrowserUtils.clickWithTimeOut(lessonProgramPage.submitButtonLessonProgramAssignment,2);
    }



}
