package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.Dean_Management_Page;
import pages.Main_Page;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_04_StepDefs {


    Dean_Management_Page deanManagementPage = new Dean_Management_Page();

    Main_Page mainPage = new Main_Page();

    Actions actions = new Actions(Driver.getDriver());

    // US_04_TC_01

    @When("add {string}")
    public void add_fName(String firstName) {

        deanManagementPage.firstName.sendKeys();
    }

    @When("add {string}")
    public void add_lName(String lastName) {

        deanManagementPage.lastName.sendKeys();
    }
    @When("add {string}")
    public void add_bp(String birthPlace) {
        deanManagementPage.birthPlace.sendKeys();

    }
    @When("select the {string}")
    public void select_gender(String genderFemale) {
        deanManagementPage.genderFemale.click();

    }
    @When("add the {string}")
    public void add_bD(String dateOfBirth) {
        deanManagementPage.dateOfBirth.sendKeys();

    }

    @When("add the {string}")
    public void add_pN(String phoneNumber) {
        deanManagementPage.phoneNumber.sendKeys();

    }

    @When("add the {string}")
    public void add_sSN(String ssn) {
        deanManagementPage.ssn.sendKeys();

    }

    @When("add the {string}")
    public void add_uName(String string) {
        deanManagementPage.userName.sendKeys();

    }

    @When("add the {string}")
    public void add_pWord(String string) {
        deanManagementPage.password.sendKeys();

    }

    @When("click_submit")
    public void click_submit() {
        deanManagementPage.deanSubmitButton.click();

    }
    @Then("verify the Dean is created")
    public void verify_the_dean_is_created() {
        assertTrue(deanManagementPage.firstName.isDisplayed());

    }

    // US_04_TC_02



}
