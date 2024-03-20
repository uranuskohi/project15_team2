package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Teachers_Page;
import utilities.*;

import java.util.List;

import static stepdefinitions.ui_stepdefs.US_13_and_US_24_StepDefs.lastNameForAssertion;
import static stepdefinitions.ui_stepdefs.US_13_and_US_24_StepDefs.nameForAssertion;


public class US_14_StepDefs {

    Teachers_Page teachersPage = new Teachers_Page();
    Actions actions = new Actions(Driver.getDriver());
    public int desiredTeacherRow = 0;

    public static WebElement nameElement;
    public static WebElement phoneElement;

    public static WebElement ssnElement;

    public static WebElement usernameElement;

    //  TC_01_update_teacher_asvicedean_valid StepDefs
    @Given("user finds {string} on teacher list")
    public void user_finds_on_teacher_list(String username) {

        JSUtils.JSscrollAllTheWayDown();
        WaitUtils.waitFor(1);
        actions.moveToElement(teachersPage.lastPageButton).click().perform();
        WaitUtils.waitFor(1);

        int count = 1;

        boolean usernameFound = false;

        while (!usernameFound) {

            for (WebElement teacherUsernameList : teachersPage.usernameColumn) {

                if (teacherUsernameList.getText().equalsIgnoreCase("etlabore")) {
                    desiredTeacherRow = count;
                    nameElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[1])[" + desiredTeacherRow + "]"));
                    phoneElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[2])[" + desiredTeacherRow + "]"));
                    ssnElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[3])[" + desiredTeacherRow + "]"));
                    usernameElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[4])[" + desiredTeacherRow + "]"));

                    usernameFound = true;
                    break;
                }
                count++;

            }
                if (!usernameFound) {
                    WaitUtils.waitFor(1);
                    actions.moveToElement(teachersPage.previousPageButton).click().perform();
                    WaitUtils.waitFor(1);
                    count = 1;
                }
        }
    }

    @Then("verify {string} in name field")
    public void verify_in_name_field(String name) {
        Assert.assertEquals(nameForAssertion+" "+lastNameForAssertion, nameElement.getText());
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
    }
