package stepdefinitions.ui_stepdefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Main_Page;
import pages.Registration_Page;
import utilities.WaitUtils;
import java.io.IOException;





public class US_01_StepDefs {


    Main_Page mainPage = new Main_Page();
    Registration_Page registrationPage = new Registration_Page();



    @Then("user clicks on register")
    public void user_clicks_on_register() {
        mainPage.registerIconAtHeader.click();
    }

    @Given("User is on registration page")
    public void user_is_on_registration_page() {

    }

    @When("user clicks on Name box & enters a {string}")
    public void user_clicks_on_name_box_enters_a(String string) {
        registrationPage.nameBox.sendKeys(string);
        WaitUtils.waitFor(2);
    }


    @And("user clicks on Surname box")
    public void userClicksOnSurnameBox() {
        registrationPage.surnameBox.click();
        WaitUtils.waitFor(2);
    }

    @And("user enters {string} as surname")
    public void userEntersAsSurname(String surname) {
        registrationPage.surnameBox.sendKeys(surname);
        WaitUtils.waitFor(2);
    }

    @And("user clicks on Birth Place box")
    public void userClicksOnBirthPlaceBox() {
        registrationPage.birthPlace.click();
        WaitUtils.waitFor(2);
    }

    @And("user enters {string}  as a birth place")
    public void userEntersAsABirthPlace(String birthplace) {
        registrationPage.birthPlace.sendKeys(birthplace);
        WaitUtils.waitFor(2);
    }

    @And("user clicks on Phone box")
    public void userClicksOnPhoneBox() {
        registrationPage.phoneBox.click();
        WaitUtils.waitFor(2);
    }
    @When("User enters their phone number")
    public void user_enters_their_phone_number() {
        WaitUtils.waitFor(2);
        registrationPage.phoneBox.sendKeys();
    }



    @When("user clicks on Female Radio button and selects Female as a gender")
    public void user_clicks_on_female_radio_button_and_selects_female_as_a_gender() {
        registrationPage.femaleRadioButton.click();
        Assert.assertTrue(registrationPage.femaleRadioButton.isSelected());
        WaitUtils.waitFor(2);
    }

    @And("user clicks on Date of Birth box")
    public void userClicksOnDateOfBirthBox() {
        registrationPage.birthdayBox.click();
        WaitUtils.waitFor(2);
    }
    @And("user enters {int}-digit mmddyyyy Birth Date")
    public void userEntersDigitMmddyyyyBirthDate(int arg0) {
        registrationPage.birthdayBox.sendKeys("01201978");
        WaitUtils.waitFor(2);
    }
    @And("user clicks on Ssn box")
    public void userClicksOnSsnBox() {
        registrationPage.ssnBox.click();
        WaitUtils.waitFor(2);
    }
    @And("user enters a valid {int}-digit Ssn")
    public void userEntersAValidDigitSsn(int arg0) {
        registrationPage.ssnBox.sendKeys("246-78-8888");
        WaitUtils.waitFor(2);
    }
    @And("user enters a {string} as an user name")
    public void userEntersAAsAnUserName(String username) {
        registrationPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(2);
    }

    @And("user enters a {string} as a password")
    public void userEntersAAsAPassword(String password) {
        registrationPage.passwordBox.sendKeys(password);
        WaitUtils.waitFor(2);

    }
    @And("user clicks on Register button")
    public void userClicksOnRegisterButton() throws IOException {
        registrationPage.registerBox.click();
        WaitUtils.waitFor(2);


    }



    }









