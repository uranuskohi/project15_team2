package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Lesson_Program_Page;
import utilities.*;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_11_Stepdefs {

    Lesson_Program_Page lessonProgramPage = new Lesson_Program_Page();


    @And("User sees Lesson Program List details")
    public void userSeesDetails() {

        assertTrue(lessonProgramPage.lessonProgramList.isDisplayed());
    }

    @And("User sees Lesson in the Lesson Program List")
    public void userSeesLessonInTheLessonProgramList() {
        assertTrue(lessonProgramPage.lpllesson.isDisplayed());
    }

    @And("User sees Day in the Lesson Program List")
    public void userSeesDayInTheLessonProgramList() {
        assertTrue(lessonProgramPage.lplDay.isDisplayed());
    }

    @And("User sees Start Time in the Lesson Program List")
    public void userSeesStartTimeInTheLessonProgramList() {
        assertTrue(lessonProgramPage.lessonProgramListStartTime.isDisplayed());
    }

    @Then("User sees Stop Time in the Lesson Program List")
    public void userSeesStopTimeInTheLessonProgramList() {
        assertTrue(lessonProgramPage.lessonProgramListStopTime.isDisplayed());
    }



//    -----------------TC02------------------


    @Then("User cannot click on the Update Button")
    public void userCannotClickOnTheUpdateButton()  {

        JSUtils.JSscrollIntoView(lessonProgramPage.lessonProgramList);
        WaitUtils.waitFor(2);

        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        WaitUtils.waitFor(1);

        assertTrue("no update button",false);


    }





}
