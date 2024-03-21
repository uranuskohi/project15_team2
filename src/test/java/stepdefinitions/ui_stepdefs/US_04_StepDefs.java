package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.Dean_Management_Page;
import pages.Main_Page;
import utilities.Driver;
import utilities.TestUtils;

import static org.junit.Assert.assertTrue;

public class US_04_StepDefs {


    Dean_Management_Page deanManagementPage = new Dean_Management_Page();

    Main_Page mainPage = new Main_Page();

    Actions actions = new Actions(Driver.getDriver());

    public static String usernameGenerator() {
        Faker faker = new Faker();
        String fakerUsername;
        do {
            fakerUsername = faker.lorem().word()+faker.lorem().word();
        } while (fakerUsername.length()<=4);
        return fakerUsername;
    }

    // US_04_TC_01
//
//    @When("add {string}")
//    public void add_fName(String firstName) {
//
//        deanManagementPage.firstName.sendKeys();
//    }
//
//    @When("add {string}")
//    public void add_lName(String lastName) {
//
//        deanManagementPage.lastName.sendKeys();
//    }
//    @When("add {string}")
//    public void add_bp(String birthPlace) {
//        deanManagementPage.birthPlace.sendKeys();
//
//    }
//    @When("select the {string}")
//    public void select_gender(String genderFemale) {
//        deanManagementPage.genderFemale.click();
//
//    }
//    @When("add the {string}")
//    public void add_bD(String dateOfBirth) {
//        deanManagementPage.dateOfBirth.sendKeys();
//
//    }
//
//    @When("add the phonenumber {string}")
//    public void add_pN(String phoneNumber) {
//        deanManagementPage.phoneNumber.sendKeys();
//
//    }
//
//    @When("add the {string}")
//    public void add_sSN(String ssn) {
//        deanManagementPage.ssn.sendKeys();
//
//    }
//
//    @When("add the {string}")
//    public void add_uName(String string) {
//        deanManagementPage.userName.sendKeys();
//
//    }
//
//    @When("add the {string}")
//    public void add_pWord(String string) {
//        deanManagementPage.password.sendKeys();
//
//    }
//
//    @When("click_submit")
//    public void click_submit() {
//        deanManagementPage.deanSubmitButton.click();
//
//    }
//    @Then("verify the Dean is created")
//    public void verify_the_dean_is_created() {
//        assertTrue(deanManagementPage.firstName.isDisplayed());
//
//    }



    @When("add name {string}")
    public void addName(String arg0) {

    }

    @And("add last name {string}")
    public void addLastName(String arg0) {
    }

    @And("add birthplace {string}")
    public void addBirthplace(String arg0) {
    }

    @And("add birthdate {string}")
    public void addBirthdate(String arg0) {
    }

    @And("add ssn {string}")
    public void addSsn(String arg0) {
    }

    @And("add username {string}")
    public void addUsername(String username) {
        username = TestUtils.usernameGenerator();
        deanManagementPage.userName.sendKeys(username);
    }

    @And("add password {string}")
    public void addPassword(String arg0) {
    }

    // US_04_TC_02



}
