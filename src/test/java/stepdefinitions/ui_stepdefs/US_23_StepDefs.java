package stepdefinitions.ui_stepdefs;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.Admin_Management_Page;
import pages.Vice_Dean_Management_Page;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import static org.junit.Assert.*;
import static utilities.Driver.getDriver;
import static utilities.JSUtils.JSclickWithTimeout;

public class US_23_StepDefs {

    Admin_Management_Page adminManagementPage = new Admin_Management_Page();
    Vice_Dean_Management_Page viceDeanManagementPage = new Vice_Dean_Management_Page();
    Faker faker = new Faker();


    @When("admin is logged in the website")
    public void admin_is_logged_in_the_website() {
        Driver.getDriver().getTitle().contains("admin-management");
    }
    @When("click on menu")
    public void click_on_menu() {
        adminManagementPage.menuButton.click();
    }
    @When("click on Vice Dean Management")
    public void click_on_vice_dean_management() {
        adminManagementPage.viceDeanManagement.click();
    }
    @When("admin should see the Vice Dean Management Filed")
    public void admin_should_see_the_vice_dean_management_filed() {
        getDriver().getTitle().contains("vicedean-management");
    }

    @When("enter name as {string}")
    public void enter_name_as(String Name) {
      viceDeanManagementPage.vdmName.sendKeys(faker.name().firstName());
    }
    @When("enter surname as {string}")
    public void enter_surname_as(String Surname) {
      viceDeanManagementPage.vdmSurname.sendKeys(faker.name().lastName());
    }
    @When("enter brith place as {string}")
    public void enter_brith_place_as(String BirthPlace) {
        viceDeanManagementPage.vdmBirthPlace.sendKeys(BirthPlace);
    }
    @When("select the {string}")
    public void select_the(String gender) {
        viceDeanManagementPage.maleGender.click();
    }
    @When("write the correct {string}")
    public void write_the_correct(String BrithDate) {
        viceDeanManagementPage.vdmBirthDay.sendKeys(BrithDate);
    }
    @When("enter phone number as {string}")
    public void enter_phone_number_as(String PhoneNumber) {
//           viceDeanManagementPage.vdmPhone.sendKeys(PhoneNumber);

        PhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
        BrowserUtils.sendKeysWithTimeout(viceDeanManagementPage.vdmPhone,PhoneNumber,2);

    }


    @When("write the SSN as {string}")
    public void write_the_ssn_as(String SSNNumber ) {
        viceDeanManagementPage.vdmSsn.sendKeys(faker.idNumber().ssnValid());
    }
    @When("write the {string}")
    public void write_the(String username) {
        viceDeanManagementPage.vdmUserName.sendKeys(faker.name().lastName());
    }
    @When("add {string}")
    public void add(String Password) {
        viceDeanManagementPage.vdmPassword.sendKeys(Password);
    }

    @When("click on Submit button for Vice Dean creation")
    public void click_on_submit_button_for_Vice_Dean_creation() {
        WaitUtils.waitFor(2);
       viceDeanManagementPage.submitButton.click();
    }
    @Then("verify the Vice Dean is created")
    public void verify_the_vice_dean_is_created() {
        WaitUtils.waitFor(1);
        assertTrue(viceDeanManagementPage.verifyViceDeanCreatedMessage.isDisplayed());
    }





//-----------------------------------------------------
//    TC_02


    @When("leave password empty")
    public void leave_password_empty(){
    }
    @Then("Verify the Vice Dean is not created")
    public void verify_the_vice_dean_is_not_created() {
        WaitUtils.waitFor(1);
        assertTrue(viceDeanManagementPage.passwordRequiredMessage.isDisplayed());
    }


}