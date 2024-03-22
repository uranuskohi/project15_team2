package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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


    // US_04_TC_01


    @When("add name {string}")
    public void addName(String name) {
        deanManagementPage.firstName.sendKeys(name);
    }

    @And("add last name {string}")
    public void addLastName(String lName) {
        deanManagementPage.lastName.sendKeys(lName);
    }

    @And("add birthplace {string}")
    public void addBirthplace(String bP) {
        deanManagementPage.birthPlace.sendKeys(bP);
    }

    @And("add birthdate {string}")
    public void addBirthdate(String bD) {
        deanManagementPage.dateOfBirth.sendKeys(bD);
    }

    @And("add the phonenumber {string}")
    public void addThePhonenumber(String pN) {
        deanManagementPage.phoneNumber.sendKeys(pN);
    }

    @And("add ssn {string}")
    public void addSsn(String ssn) {
        ssn = TestUtils.ssnGenerator();
        deanManagementPage.ssn.sendKeys(ssn);
    }

    @And("add username {string}")
    public void addUsername(String username) {
        username = TestUtils.usernameGenerator();
        deanManagementPage.userName.sendKeys(username);
    }

    @And("add password {string}")
    public void addPassword(String pword) {
        pword = TestUtils.passwordGenerator();
        deanManagementPage.password.sendKeys(pword);
    }

    @And("clicks on the Dean Submit button")
    public void clicksOnTheDeanSubmitButton() {
        deanManagementPage.deanSubmitButton.click();

    }

    @Then("verify the Dean is created")
    public void verifyTheDeanIsCreated() {
        deanManagementPage.lastPageButton.click();
        assertTrue(deanManagementPage.firstName.isDisplayed());
    }



    // US_04_TC_02

    @And("add missing digit ssn {string}")
    public void addMissingDigitSsn(String missingSsn) {
        missingSsn = TestUtils.ssn8DigitGenerator();
        deanManagementPage.ssn.sendKeys(missingSsn);
    }


    @Then("verify the Dean cannot be created")
    public void verifyTheDeanCannotBeCreated() {
        deanManagementPage.missingDigitNotice.isDisplayed();
    }

}
