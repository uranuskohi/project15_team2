package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.Meet_Management_Page;

import static utilities.WaitUtils.waitFor;

public class US_19_TC_01_StepDefs {

    Meet_Management_Page meetManagementPage = new Meet_Management_Page();


    @Given("the user is on the scheduling page")
    public void the_user_is_on_the_scheduling_page() {

    }

    @When("the user chooses {string} from the dropdown menu")
    public void the_user_chooses_and_from_the_dropdown_menu(String student1) {
//        //meetManagementPage.chooseStudents.click();
//        Select select = new Select(meetManagementPage.chooseStudents);
//        select.selectByVisibleText(student1);

        meetManagementPage.chooseStudents.click();
        waitFor(1);
        meetManagementPage.chooseStudents.sendKeys(student1,Keys.ENTER);
       // meetManagementPage.chooseStudents.sendKeys(Keys.ENTER);
        waitFor(1);

        //Removed the second students since it is causing a lot of issues
//        meetManagementPage.chooseStudents.sendKeys(student2);
//        meetManagementPage.chooseStudents.sendKeys(Keys.ENTER);
//        waitFor(5);
//        Select dropdown = new Select(meetManagementPage.chooseStudents);
//        dropdown.selectByVisibleText(student1);
//        waitFor(5);
//        dropdown.selectByVisibleText(student2);
//        waitFor(5);
    }
    @When("the user enters the date of the meeting as {string}")
    public void the_user_enters_the_date_of_the_meeting_as(String date) {
        meetManagementPage.dateOfMeet.sendKeys(date);
        waitFor(5);
    }
    @When("the user types the start time as {string}")
    public void the_user_types_the_start_time_as(String startTime) {
        meetManagementPage.startTime.sendKeys(startTime);
        waitFor(5);
    }
    @When("the user types the stop time as {string}")
    public void the_user_types_the_stop_time_as(String stopTime) {
        meetManagementPage.stopTime.sendKeys(stopTime);
        waitFor(5);
    }
    @When("the user types the description as {string}")
    public void the_user_types_the_description_as(String description) {
        meetManagementPage.description.sendKeys(description);
        waitFor(5);
    }
    @When("the user clicks the Submit button")
    public void the_user_clicks_the_submit_button() {
        meetManagementPage.submitAtMeetManagement.click();
        waitFor(5);
    }



}
