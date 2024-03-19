package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Teachers_Page;
import testdata.Teachers;
import utilities.ActionsUtils;
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

            List<WebElement> tableElements = Driver.getDriver().findElements(By.xpath("//div[@class='table-responsive']"));
            int numberOfRows = tableElements.size();
            System.out.println(numberOfRows);

            for (int row = 1; row <= numberOfRows; row++) {
                String usernameText = Driver.getDriver().findElement(By.xpath("//div[@class='table-responsive']//tbody//tr[" + row + "]//td[4]")).getText();
                System.out.println(usernameText);
                if (usernameText.equalsIgnoreCase(Teachers.getTeacherUsername("US13_TC01"))) {
                    teachersPage.editButton.click();
                isUsernameFound = true;
                break;
                }
                ActionsUtils.actionsDoubleClick(Driver.getDriver().findElement(By.xpath("//*[text()='Next']")));
                WaitUtils.waitForPageToLoad(1);
            }
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
