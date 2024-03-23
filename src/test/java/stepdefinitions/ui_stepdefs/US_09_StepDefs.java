package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.Lessons_Page;
import utilities.*;

import java.io.IOException;

import static org.junit.Assert.assertTrue;


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

    @And("click on the last page")
    public void clickOnTheLastPage() {
        WaitUtils.waitFor(2);
        BrowserUtils.clickWithTimeOut(lessonsPage.lastPageArrow,2);
    }
    @And("go to the last page")
    public void goToTheLastPage() {
        lessonsPage.nextPage.isDisplayed();
    }
    @And("go up")
    public void goUp() {
        WaitUtils.waitFor(1);
        JSUtils.JSscrollAllTheWayUp();
    }
    @When("vice dean is able to see and delete the created lesson")
    public void vice_dean_is_able_to_see_and_delete_the_created_lesson() {
        WaitUtils.waitFor(2);
        BrowserUtils.clickWithTimeOut(lessonsPage.deleteButtonForLesson,2);
    }

    @When("vice dean should be able to update the lesson")
    public void vice_dean_should_be_able_to_update_the_lesson() throws IOException {
        System.out.println("Vice dean can not update the lesson cause there is no any button or option to update the lesson.");
        WaitUtils.waitFor(5);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertTrue("The update button should be visible",false);

//        MediaUtils.takeScreenshotOfTheEntirePage();
//      There is no any update button or any option to update the lesson
    }


    @Then("verify the lesson is deleted")
    public void verifyTheLessonIsDeleted() {
        WaitUtils.waitFor(1);
        assertTrue(lessonsPage.deleteLessonVerification.isDisplayed());
    }



}
