package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import pages.Main_Page;

public class US_13_TC_01_StepDefs {

    Main_Page mainPage = new Main_Page();

    @Given("clicks on Teacher Management")
    public void clicks_on_teacher_management() {
        mainPage.teacherManagement.click();
    }

    @When("user selects {string} from dropdown")
    public void user_selects_from_dropdown(String string) {
    }

    @When("enters {string} in name field")
    public void enters_in_name_field(String string) {
    }

    @When("enters {string} in surname field")
    public void enters_in_surname_field(String string) {
    }

    @When("enters {string} in birth place field")
    public void enters_in_birth_place_field(String string) {
    }

    @When("enters {string} in email field")
    public void enters_in_email_field(String string) {
    }

    @When("enters {string} in phone field")
    public void enters_in_phone_field(String string) {
    }

    @When("selects is advisor teacher")
    public void selects_is_advisor_teacher() {
    }

    @When("selects {string} gender radio button")
    public void selects_gender_radio_button(String string) {
    }

    @When("selects date of birth in date of birth field")
    public void selects_date_of_birth_in_date_of_birth_field() {
    }

    @When("enters {string} in ssn field")
    public void enters_in_ssn_field(String string) {
    }

    @When("enters {string} in user name field")
    public void enters_in_user_name_field(String string) {
    }

    @When("enters {string} in password field")
    public void enters_in_password_field(String string) {
    }

    @When("clicks submit button")
    public void clicks_submit_button() {
    }

    @Then("verify the teacher is created")
    public void verify_the_teacher_is_created() {
    }
}
