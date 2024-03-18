package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import pages.Lessons_Page;
import utilities.MediaUtils;

import java.io.IOException;


public class US_09_StepDefs {

    Lessons_Page lessonsPage = new Lessons_Page();
    @When("scroll down to Lesson List")
    public void scroll_down_to_lesson_list() {
        lessonsPage.lessons.click();
    }

    @When("vice dean can see the Lesson Name")
    public void vice_dean_can_see_the_lesson_name() {
        lessonsPage.lessonNameField.isDisplayed();
    }

    @When("vice dean can see the Compulsory field")
    public void vice_dean_can_see_the_compulsory_field() {
        lessonsPage.compulsory.isDisplayed();
    }

    @When("vice dean can see the Credit")
    public void vice_dean_can_see_the_credit() {
        lessonsPage.creditScoreField.isDisplayed();
    }

    @When("vice dean is able to see and delete the created lesson")
    public void vice_dean_is_able_to_see_and_delete_the_created_lesson() {
        lessonsPage.deleteButtonForLesson.isDisplayed();
    }

    @When("vice dean should be able to update the lesson")
    public void vice_dean_should_be_able_to_update_the_lesson() throws IOException {
        System.out.println("Vice dean can not update the lesson cause there is no any button or option to update the lesson.");
        MediaUtils.takeScreenshotOfTheEntirePage();
//      There is no any update button or any option to update the lesson
    }

}
