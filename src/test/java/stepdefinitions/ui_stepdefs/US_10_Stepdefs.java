package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Lesson_Program_Page;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US_10_Stepdefs {
    Lesson_Program_Page lessonProgramPage = new Lesson_Program_Page();



    @And("User clicks on the Lesson Program button")
    public void userClicksOnTheLessonProgramButton() {
        BrowserUtils.clickWithTimeOut(lessonProgramPage.clickonLessonProgram,2);
    }



    @And("And User selects an education class {string} from the provided options")
    public void andUserSelectsAnEducationClassFromTheProvidedOptions(String lesson) {


        lessonProgramPage.chooseLessonDropdown.click();
        WaitUtils.waitFor(2);
        lessonProgramPage.chooseLessonDropdown.sendKeys(lesson,Keys.ENTER);
        WaitUtils.waitFor(5);


    }

    @And("User chooses the educational terms {string} from the available list")
    public void userChoosesTheEducationalTermsFromTheAvailableList(String semester) {
        Select selectSemesterDropdown = new Select(lessonProgramPage.chooseEducationTerm);
        selectSemesterDropdown.selectByVisibleText(semester);
        WaitUtils.waitFor(2);
    }

    @And("User selects a day {string} from the dropdown menu.")
    public void userSelectsADayFromTheDropdownMenu(String day) {
        Select selectDayDropdown = new Select(lessonProgramPage.chooseDay);
        selectDayDropdown.selectByVisibleText(day);
        WaitUtils.waitFor(2);
    }

    @And("User chooses a start time {string} from the provided time slots.")
    public void userChoosesAStartTimeFromTheProvidedTimeSlots(String startTime) {

        BrowserUtils.sendKeysWithTimeout(lessonProgramPage.lessonProgramListStartTime, startTime,2);

    }

    @And("User selects a stop time {string} from the available time slots.")
    public void userSelectsAStopTimeFromTheAvailableTimeSlots(String stopTime) {
        BrowserUtils.sendKeysWithTimeout(lessonProgramPage.lessonProgramListStopTime, stopTime, 2);
    }


    @And("verify successful warning Pop-up message displayed")
    public void verifySuccessfulWarningPopupMessageDisplayed(){


        String actualText = lessonProgramPage.addlessonVerificationPopUp.getText();
//        WaitUtils.waitFor(2);
        System.out.println("actualText = " + actualText);
        assertTrue(actualText.contains("Created Lesson Program"));

        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


//    ----------------------------TC02----------------------------

    @And("User doesn't choose a start time {string} from the provided time slots.")
    public void userDoesnTChooseAStartTimeFromTheProvidedTimeSlots(String startTime) {
        BrowserUtils.sendKeysWithTimeout(lessonProgramPage.lessonProgramListStartTime, startTime,2);
    }

    @And("User doesn't select a stop time {string} from the available time slots.")
    public void userDoesnTSelectAStopTimeFromTheAvailableTimeSlots(String stopTime) {
        BrowserUtils.sendKeysWithTimeout(lessonProgramPage.lessonProgramListStopTime, stopTime, 2);
    }


    @And("verify the warning Pop-up message which is start time and stop time are required fields displayed")
    public void verifyTheWarningPopUpMessageWhichIsStartTimeAndStopTimeAreRequiredFieldsDisplayed() {

        assertTrue(lessonProgramPage.requiredMessageUnderStartTime.isDisplayed());
        assertTrue(lessonProgramPage.requiredMessageUnderStopTime.isDisplayed());
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }





    @Then("User clicks on the submit button.")
    public void userClicksOnTheSubmitButton() {
        BrowserUtils.clickWithTimeOut(lessonProgramPage.submitButtonAddLessonProgram,2);

    }



}
