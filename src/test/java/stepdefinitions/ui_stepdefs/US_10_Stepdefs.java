package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Lesson_Program_Page;
import utilities.Driver;
import utilities.WaitUtils;

public class US_10_Stepdefs {
    Lesson_Program_Page lessonProgramPage = new Lesson_Program_Page();
    Actions actions = new Actions(Driver.getDriver());

    @And("User clicks on the menu button")
    public void userClicksOnTheMenuButton() {
        lessonProgramPage.menu.click();
    }

    @And("User clicks on the Lesson management button")
    public void userClicksOnTheLessonManagementButton() {
        lessonProgramPage.lessonManagement.click();
    }

    @And("User clicks on the Lesson Program button")
    public void userClicksOnTheLessonProgramButton() {
        lessonProgramPage.clickonLessonProgram.click();
    }

    @And("And User selects an education class {string} from the provided options")
    public void andUserSelectsAnEducationClassFromTheProvidedOptions(String lesson) {

        lessonProgramPage.chooseLessonDropdown.click();
        Select selectLessonDropdown = new Select(lessonProgramPage.chooseLessonDropdown);
        selectLessonDropdown.selectByVisibleText(lesson);
        WaitUtils.waitFor(2);
    }

    @And("User chooses the educational terms {string} from the available list")
    public void userChoosesTheEducationalTermsFromTheAvailableList(String arg0) {
    }

    @And("User selects a day {string} from the dropdown menu.")
    public void userSelectsADayFromTheDropdownMenu(String arg0) {
    }

    @And("User chooses a start time {string} from the provided time slots.")
    public void userChoosesAStartTimeFromTheProvidedTimeSlots(String arg0) {
    }

    @And("User selects a stop time {string} from the available time slots.")
    public void userSelectsAStopTimeFromTheAvailableTimeSlots(String arg0) {
    }

    @Then("User clicks on the submit button.")
    public void userClicksOnTheSubmitButton() {
    }

    @And("User doesn't choose a start time {string} from the provided time slots.")
    public void userDoesnTChooseAStartTimeFromTheProvidedTimeSlots(String arg0) {
    }

    @And("User doesn't select a stop time {string} from the available time slots.")
    public void userDoesnTSelectAStopTimeFromTheAvailableTimeSlots(String arg0) {
    }

    @Then("User clicks on the Submit button.")
    public void userClicksOnTheSubmitButton() {
    }

    @And("verify the warning Pop-up message which is start time and stop time are required fields displayed")
    public void verifyTheWarningPopUpMessageWhichIsStartTimeAndStopTimeAreRequiredFieldsDisplayed() {
    }


}
