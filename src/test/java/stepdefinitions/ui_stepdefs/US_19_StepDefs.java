package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.Meet_Management_Page;
import utilities.Driver;
import utilities.MediaUtils;


import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static utilities.WaitUtils.waitFor;

public class US_19_StepDefs {

    Meet_Management_Page meetManagementPage = new Meet_Management_Page();
    Actions actions = new Actions(Driver.getDriver());


    @Given("the user is on the scheduling page")
    public void the_user_is_on_the_scheduling_page() {
        assertTrue(meetManagementPage.meetManagementTitle.isDisplayed());
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
        waitFor(1);
    }
    @When("the user types the start time as {string}")
    public void the_user_types_the_start_time_as(String startTime) {
        meetManagementPage.startTime.sendKeys(startTime);
        waitFor(1);
    }
    @When("the user types the stop time as {string}")
    public void the_user_types_the_stop_time_as(String stopTime) {
        meetManagementPage.stopTime.sendKeys(stopTime);
        waitFor(1);
    }
    @When("the user types the description as {string}")
    public void the_user_types_the_description_as(String description) {
        meetManagementPage.description.sendKeys(description);
        waitFor(1);
    }
    @When("the user clicks the Submit button")
    public void the_user_clicks_the_submit_button() throws IOException {
        meetManagementPage.submitAtMeetManagement.click();
        waitFor(1);
        //MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @Given("delete if the student name {string} exist on the Meet List")
    public void delete_if_the_student_name_exist_on_the_meet_list(String student) {
        int count = 1;
        int desiredStudentRow = 0;
        for (WebElement studentNameList : meetManagementPage.nameColumnAtMeet) {
            if (studentNameList.getText().equalsIgnoreCase(student)) {
                desiredStudentRow = count;
                WebElement element = Driver.getDriver().findElement(By.xpath("(//i[@class='fa-solid fa-trash'])[" + desiredStudentRow + "]"));

                actions.moveToElement(element).click().perform();
                break;
            }
            count++;
        }

    }

    @When("verify meeting saved successfully pop up message")
    public void verify_meeting_saved_successfully_pop_up_message() {
        Assert.assertTrue(meetManagementPage.meetSavedSuccessfullyPopUp.isDisplayed());
    }

    @When("verify must be a future date error pop up message")
    public void verify_must_be_a_future_date_error_pop_up_message() {
        Assert.assertTrue(meetManagementPage.mustBeFutureDateFromEdit.isDisplayed());
    }


}
