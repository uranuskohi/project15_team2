package stepdefinitions.ui_stepdefs;

import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Main_Page;
import pages.Registration_Page;
import utilities.WaitUtils;

import java.text.SimpleDateFormat;

import static org.junit.Assert.assertTrue;


public class US_01_StepDefs {


    Main_Page mainPage = new Main_Page();
    Registration_Page registrationPage = new Registration_Page();

    static Faker faker = new Faker();


    public static String fakeName = faker.name().firstName();
    public static String fakeSurname = faker.name().lastName();
    public static String fakeBirthPlace = faker.country().capital();
    public static String fakePhone = faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(999, 10000);
    public static String fakeBirthDate = "12-02-1998";       // faker.date().birthday().toString();
    public static String fakeGender;
    public static String fakeSSN = faker.idNumber().ssnValid();
    public static String fakeUserName = faker.name().username();
    public static String fakePassword = faker.internet().password(8, 10, true, false, true);


    @Then("user clicks on register")
    public void user_clicks_on_register() {
        mainPage.registerIconAtHeader.click();
    }

    @Given("User is on registration page")
    public void user_is_on_registration_page() {

    }

    @When("User enters name")
    public void user_enters_name() {
        WaitUtils.waitFor(2);
        registrationPage.surnameBoxRequiredText.sendKeys(fakeName);
        System.out.println("fakeName = " + fakeName);
    }


    @When("User enters surname")
    public void user_enters_surname() {
        WaitUtils.waitFor(2);
        registrationPage.surnameBoxRequiredText.sendKeys(fakeSurname);
    }

    @When("User enters their birth place")
    public void user_enters_their_birth_place() {
        WaitUtils.waitFor(2);
        registrationPage.birthPlace.sendKeys(fakeBirthPlace);
    }


    @When("User enters their phone number")
    public void user_enters_their_phone_number() {
        WaitUtils.waitFor(2);
        registrationPage.phoneBox.sendKeys(fakePhone);
    }


    @And("user clicks on gender radio button")
    public void clicks_on_gender_radio_button() {
        if (registrationPage.femaleRadioButton.isSelected()) {
            registrationPage.femaleRadioButton.click();
        } else if (registrationPage.maleRadioButton.isSelected()) {
            registrationPage.maleRadioButton.click();

        }

        @When("selects date of birth in date of birth field")
        public void selects_date_of_birth_in_date_of_birth_field() {
            WaitUtils.waitFor(4);
            registrationPage.birthdayBox.sendKeys(fakeBirthDate);
        }




        @When("User enters SSN")
        public void user_enters_ssn () {
            WaitUtils.waitFor(2);
            registrationPage.ssnBox.sendKeys(fakeSSN);
        }

        @And("SSN; must contain ‘-’ after the {int}rd and {int}th digits and consist of {int} digits")
        public void ssn_Must_Contain_After_The_Rd_AndThDigitsAndConsistOfDigits ( int arg0, int arg1, int arg2){
            WaitUtils.waitFor(2);
            int minLengthSSN = 9;
            int ssnLength = fakeSSN.replace("-", "").trim().length();
            assert ssnLength == minLengthSSN : "SSN does not consist of 9 digits " + minLengthSSN;
            assertTrue(fakeSSN.matches("\\d{3}-\\d{2}-\\d{4}"));
        }

        @When("User enters User Name")
        public void user_enters_user_name () {
            WaitUtils.waitFor(4);
            registrationPage.usernameBox.sendKeys(fakeUserName);
            System.out.println("fakeUserName = " + fakeUserName);
        }

        @When("User enters their password")
        public void user_enters_their_password () {
            WaitUtils.waitFor(2);
            registrationPage.passwordBox.sendKeys(fakePassword);
            System.out.println("fakePassword = " + fakePassword);
        }

        @When("Password must consist of at least {int} characters")
        public void password_must_consist_of_at_least_characters (Integer int1){
            WaitUtils.waitFor(2);
            int minLengthPassword = 8;
            int passwordLength = fakePassword.length();
            assert passwordLength >= minLengthPassword : "Password does not meet the minimum length requirement of " + minLengthPassword;
        }

        @When("Password must contain at least one uppercase letter, one lowercase letter and one digit")
        public void password_must_contain_at_least_one_uppercase_letter_one_lowercase_letter_and_one_digit () {
            WaitUtils.waitFor(2);
            assert fakePassword.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+") : "Password does not match with the requirements";
        }

        @When("User clicks on register button")
        public void user_clicks_on_register_button () {
            JSUtils.clickWithTimeoutByJS(register.registerButton);
        }

        @Then("User should see {string} alert")
        public void user_should_see_alert (String string){
            WaitUtils.waitFor(2);
            register.successfulRegisterAlert.isDisplayed();
        }
    }

}






