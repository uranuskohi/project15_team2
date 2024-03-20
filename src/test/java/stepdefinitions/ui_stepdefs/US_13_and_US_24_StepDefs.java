package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Teachers_Page;
import utilities.ActionsUtils;
import utilities.TestUtils;
import utilities.WaitUtils;

import static stepdefinitions.ui_stepdefs.US_14_StepDefs.nameElement;
import static utilities.TestUtils.*;


public class US_13_and_US_24_StepDefs {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();

    public String name;
    public static String nameForAssertion;
    public static String lastNameForAssertion;

    public static String phoneForAssertion;

    public static String ssnForAssertion;
    public static String usernameForAssertion;



//  TC_01_create_teacher_asvicedean_valid StepDefs
    @When("enters {string} in select lesson field as {string}")
    public void enters_in_select_lesson_field_as(String lesson, String user) {
        ActionsUtils.actionsDoubleClick(teachersPage.selectLessonViceDean);
        WaitUtils.waitFor(1);
        teachersPage.selectLessonViceDean.sendKeys("Java", Keys.TAB);
        WaitUtils.waitFor(1);

        if(user.equals("admin")){
            teachersPage.selectLessonAdmin.click();
        } else if (user.equals("vice dean")){
            teachersPage.selectLessonViceDean.click();
        } else {
            System.out.println("Unknown user: " +user);
        }
    }

    @When("enters {string} in name field")
    public void enters_in_name_field(String name) {
        name = faker.name().firstName();
        teachersPage.name.sendKeys(name);
        nameForAssertion = name;
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in surname field")
    public void enters_in_surname_field(String lastName) {
        lastName = faker.name().lastName();
        teachersPage.surname.sendKeys(lastName);
        lastNameForAssertion = lastName;
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in birth place field")
    public void enters_in_birth_place_field(String birthPlace) {
        birthPlace = birthPlaceGenerator();
        teachersPage.birthPlace.sendKeys(birthPlace);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in email field")
    public void enters_in_email_field(String email) {
        email = usernameGenerator()+"@"+faker.internet().domainName();
        teachersPage.email.sendKeys(email);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in phone field")
    public void enters_in_phone_field(String phone) {
        phone = phoneNumberGenerator();
        teachersPage.phone.sendKeys(phone);
        phoneForAssertion = phone;
        WaitUtils.waitFor(1);
    }

    @When("selects is advisor teacher")
    public void selects_is_advisor_teacher() {
        teachersPage.isAdvisorTeacher.click();
    }

    @When("selects gender radio button")
    public static void selectGenderRadioButton(){
        Teachers_Page teachersPage = new Teachers_Page();
        if (!teachersPage.male.isSelected() && !teachersPage.female.isSelected()){
            teachersPage.male.click();
        }else if (teachersPage.male.isSelected()){
            teachersPage.female.click();
        }else if (teachersPage.female.isSelected()){
            teachersPage.male.click();
        }
    }

    @When("enters {string} in date of birth field")
    public void enters_in_date_of_birth_field(String dateOfBirth) {
        dateOfBirth = dateOfBirthGenerator();
        teachersPage.dateOfBirth.sendKeys(dateOfBirth, Keys.TAB);
    }

    @When("enters {string} in ssn field")
    public void enters_in_ssn_field(String ssn) {
        ssn = ssnGenerator();
        teachersPage.ssn.sendKeys(ssn);
        ssnForAssertion = ssn;
    }

    @When("enters {string} in user name field")
    public void enters_in_user_name_field(String username) {
        username = TestUtils.usernameGenerator();
        teachersPage.userName.sendKeys(username);
        usernameForAssertion = username;
    }

    @When("enters {string} in password field")
    public void enters_in_password_field(String password) {
        password = passwordGenerator();
        teachersPage.password.sendKeys(password);
    }

    @When("clicks submit button")
    public void clicks_submit_button() {
        teachersPage.submit.click();
    }

    @Then("verify success message {string}")
    public void verify_success_message(String string) {
        WaitUtils.waitFor(1);
        String actualText = teachersPage.successMsg.getText();
        WaitUtils.waitFor(1);
        System.out.println(actualText);
        Assert.assertEquals(string, actualText);
    }

    @Then("verify {string} exists in teacher list")
    public void verify_exists_in_teacher_list(String username) {
        Assert.assertEquals(nameForAssertion+" "+lastNameForAssertion, nameElement);
    }


//  TC_02_create_teacher_asvicedean_invalid StepDefs
    @When("enters only {int} digits {string} in ssn field")
    public void enters_only_digits_in_ssn_field(Integer numberOfDigits, String ssn) {
        teachersPage.ssn.sendKeys(ssn8DigitGenerator());
//        teachersPage.ssn.sendKeys(string);
    }

    @Then("verify error message {string}")
    public void verify_error_message(String string) {
        Assert.assertEquals(string, teachersPage.ssnErrorMsg.getText());
    }

    @Then("verify {string} does not exist in teacher list")
    public void verify_does_not_exist_in_teacher_list(String string) {

    }
}