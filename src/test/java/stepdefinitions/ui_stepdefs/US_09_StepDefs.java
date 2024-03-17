package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import pages.Lessons_Page;
import utilities.JSUtils;
import utilities.WaitUtils;


public class US_09_StepDefs {

    Lessons_Page lessonsPage;
    @When("scroll down to Lesson List")
    public void scroll_down_to_lesson_list() {
    lessonsPage = new Lessons_Page();
    WaitUtils.waitFor(1);
        JSUtils.JSscrollAllTheWayDown();

    }

    @When("vice dean can see the Lesson Name")
    public void vice_dean_can_see_the_lesson_name() {
        assert lessonsPage.lessonListName.isDisplayed();
    }

    @When("vice dean can see the Compulsory field")
    public void vice_dean_can_see_the_compulsory_field() {
        assert lessonsPage.lessonListCompulsory.isDisplayed();
    }

    @When("vice dean can see the Credit")
    public void vice_dean_can_see_the_credit() {
        assert lessonsPage.lessonListCreditScore.isDisplayed();
    }

    @When("vice dean is able to see and delete the created lesson")
    public void vice_dean_is_able_to_see_and_delete_the_created_lesson() {
        WaitUtils.waitFor(1);
        lessonsPage.deleteButtonForLesson.click();
    }

    @When("vice dean should be able to update the lesson")
    public void vice_dean_should_be_able_to_update_the_lesson() {

    }

}
