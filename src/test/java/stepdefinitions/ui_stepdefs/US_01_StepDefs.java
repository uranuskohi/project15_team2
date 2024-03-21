package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.When;
import pages.Main_Page;
import pages.Registration_Page;

import utilities.BrowserUtils;
import utilities.WaitUtils;

public class US_01_StepDefs {

    Main_Page mainPage = new Main_Page();
    Registration_Page registrationPage = new Registration_Page();
    //@Given("User goes to homepage")
    //public void userGoesToHomepage() {
   // }
    //@And("user clicks on registration button")
    //public void user_clicks_on_registration_button() {
        //mainPage.registerIconAtHeader.click();
        //WaitUtils.waitFor(5);
    //}

    @When("user clicks on Register button1")
    public void userClicksOnRegisterButton() {
        mainPage.registerIconAtHeader.click();
        WaitUtils.waitFor(1);

    }


    @When("user enters {string} as a name")
    public void user_enters_as_a_name(String name) {
        registrationPage.nameBox.sendKeys(name);
        WaitUtils.waitFor(2);
    }
    @When("user enters {string} as surname")
    public void user_enters_as_surname(String surname) {
        registrationPage.surnameBox.sendKeys(surname);
        WaitUtils.waitFor(2);
    }
    @When("user enters {string}  as a birth place")
    public void user_enters_as_a_birth_place(String birthplace) {
        registrationPage.birthPlace.sendKeys(birthplace);
        WaitUtils.waitFor(1);
    }
    @When("user enters {string}  as a phone number")
    public void user_enters_as_a_phone_number(String phoneNumber) {
        registrationPage.phoneBox.sendKeys(phoneNumber);
        WaitUtils.waitFor(5);
    }
    @When("user clicks on Female Radio button and selects Female as a gender Radio button and selects Male as a gender")
    public void user_clicks_on_female_radio_button_and_selects_female_as_a_gender_radio_button_and_selects_male_as_a_gender() {

        BrowserUtils.clickWithTimeOut(registrationPage.femaleRadioButton1,10);

    }
    @When("user enters {string}, {string}, {string}  as a birth date")
    public void user_enters_as_a_birth_date(String month, String day, String year) {
        registrationPage.birthdayBox.sendKeys(month,day,year);
        WaitUtils.waitFor(5);
    }
    @When("user enters an invalid {string} as an Ssn")
    public void user_enters_an_invalid_as_an_ssn(String ssn) {
        registrationPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
    }
    @When("user enters a {string} as an user name")
    public void user_enters_a_as_an_user_name(String userName) {
        registrationPage.usernameBox.sendKeys(userName);
        WaitUtils.waitFor(1);
    }
    @When("user enters a {string} as a password")
    public void user_enters_a_as_a_password(String password) {
        registrationPage.passwordBox.sendKeys(password);
        WaitUtils.waitFor(1);
    }
    @When("user clicks on Register button")
    public void user_clicks_on_register_button() {
        BrowserUtils.clickWithTimeOut(registrationPage.registerBox,5);
        WaitUtils.waitFor(5);
    }



}



