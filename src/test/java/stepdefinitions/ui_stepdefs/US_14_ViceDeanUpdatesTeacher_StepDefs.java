package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Teachers_Page;
import testdata.Teachers;
import utilities.Driver;
import utilities.WaitUtils;

import java.util.List;

public class US_14_ViceDeanUpdatesTeacher_StepDefs {

    Teachers_Page teachersPage = new Teachers_Page();

//  TC_01_update_teacher_asvicedean_valid StepDefs
    @Given("user finds {string} on teacher list")
    public void user_finds_on_teacher_list(String string) {

        boolean isUsernameFound = false;

        while (!isUsernameFound) {
            // Iterate over the rows of the current page
            List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//tbody[@class='table-group-divider']//tr"));

            for (WebElement row : rows) {
                WebElement usernameElement = row.findElement(By.xpath("//tbody[@class='table-group-divider']//tr//td[4]"));
                String username = usernameElement.getText();

                if (username.equals(Teachers.getTeacherUsername("@US13_TC01"))) {

                    WebElement editButton = row.findElement(By.xpath("//i[@class='fa-solid fa-pencil']"));
                    editButton.click();
                    isUsernameFound = true;
                    break;
                }
            }


            // Check if the username is found or if there's a next page
            if (!isUsernameFound) {
                WebElement nextPageButton = Driver.getDriver().findElement(By.xpath("//span[text()='Next']")); // Locate the next page button
                WaitUtils.waitFor(1);
                nextPageButton.click();
                } else {
                    // No next page available, exit the loop
                    break;
                }
        }

        if (!isUsernameFound) {
            // Username not found in any page of the table
            // Handle the case where the username is not found
        }
    }

    @Then("verify {string} in name field")
    public void verify_in_name_field(String string) {

    }

    @Then("verify {string} in phone field")
    public void verify_in_phone_field(String string) {

    }

    @Then("verify {string} in ssn field")
    public void verify_in_ssn_field(String string) {

    }

    @Then("verify {string} in user name field")
    public void verify_in_user_name_field(String string) {

    }

    @When("clicks on edit button")
    public void clicks_on_edit_button() {



    }

//  TC_02_update_teacher_asvicedean_invalid StepDefs
    @When("removes email from email field")
    public void removes_email_from_email_field() {

    }
}
