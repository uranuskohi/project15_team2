package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.Main_Page;
import pages.Vice_Dean_Management_Page;
import utilities.BrowserUtils;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US_06_StepDefs_DeanCreatesViceDeanAccnt {

    // TC_01 VALID Test

    Main_Page mainPage = new Main_Page();
    Vice_Dean_Management_Page viceDeanManagementPage = new Vice_Dean_Management_Page();
    Faker faker = new Faker();

    @When("user enters the {string} as an user name")
    public void user_enters_the_as_an_user_name(String name) {
        viceDeanManagementPage.vdmName.sendKeys(faker.name().firstName(),Keys.TAB );
    }

    @When("enters the surname as {string}")
    public void enters_the_surname_as(String surname) {
        viceDeanManagementPage.vdmSurname.sendKeys(faker.name().lastName(), Keys.TAB);
    }

    @When("enters the brith place as {string}")
    public void enters_the_brith_place_as(String BirthPlace) {
        viceDeanManagementPage.vdmBirthPlace.sendKeys(BirthPlace, Keys.TAB);
    }

    @When("selects the {string} radio button")
    public void selects_the_radio_button(String gender) {
        viceDeanManagementPage.maleGender.click();
    }

    @When("enters the {string} in date of birth field")
    public void enters_the_in_date_of_birth_field(String dateofbirth) {
        viceDeanManagementPage.vdmBirthDay.sendKeys(dateofbirth, Keys.TAB);
    }

    @When("enters the phone number as {string}")
    public void enters_the_phone_number_as(String Phone) {
        Phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
        BrowserUtils.sendKeysWithTimeout(viceDeanManagementPage.vdmPhone,Phone,2);

    }

    @When("enters the {string} in ssn field")
    public void enters_the_in_ssn_field(String Ssn) {
        viceDeanManagementPage.vdmSsn.sendKeys(faker.idNumber().ssnValid(),Keys.TAB);
    }

    @When("user enter a {string} as an user name")
    public void user_enter_a_as_an_user_name(String username) {
        viceDeanManagementPage.vdmUserName.sendKeys(faker.name().lastName(), Keys.TAB);
    }

    @When("enters the {string} in password field")
    public void enters_the_in_password_field(String password) {
        viceDeanManagementPage.vdmPassword.sendKeys(password, Keys.TAB);
    }

    @When("clicks on Submit button")
    public void clicks_on_submit_button() {
        WaitUtils.waitFor(2);
        viceDeanManagementPage.submitButton.click();
    }

    @Then("verify the vice dean is created successfully message")
    public void verify_the_vice_dean_is_created_successfully_message() {
        WaitUtils.waitFor(1);
        assertTrue(viceDeanManagementPage.verifyViceDeanCreatedMessage.isDisplayed());
    }


    // TC-02 INVALID Test


    @When("leave the {string} empty")
    public void leave_the_empty(String name) {
    viceDeanManagementPage.vdmName.sendKeys(name, Keys.TAB);
    }

    @When("enter  the surname as {string}")
    public void enter_the_surname_as(String surname) {
        viceDeanManagementPage.vdmSurname.sendKeys(faker.name().lastName(),Keys.TAB );
    }

    @When("enters birth place as {string}")
    public void enters_birth_place_as(String birthplace) {

        viceDeanManagementPage.vdmBirthPlace.sendKeys(birthplace);
    }


    @Then("user sees the required message")
    public void user_sees_the_required_message() {
        WaitUtils.waitFor(1);
        assertTrue(viceDeanManagementPage.getVdmNameRequiredMsg.isDisplayed());
    }


    @And("enters the{string} in date of birth field")
    public void entersTheInDateOfBirthField(String dateofbirth) {
        viceDeanManagementPage.vdmBirthDay.sendKeys(dateofbirth);

    }
}
