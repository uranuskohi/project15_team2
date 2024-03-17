package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Teachers_Page;
import utilities.ActionsUtils;
import utilities.WaitUtils;

import static utilities.TestUtils.*;


public class US_13_ViceDeanCreatesTeacher_StepDefs {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();


//  TC_01_create_teacher_asvicedean_valid StepDefs
    @When("enters {string} in select lesson field as vice dean")
    public void enters_in_select_lesson_field_as_vice_dean(String string) {
        ActionsUtils.actionsDoubleClick(teachersPage.selectLessonViceDean);
        WaitUtils.waitFor(1);
        teachersPage.selectLessonViceDean.sendKeys("Java", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in name field")
    public void enters_in_name_field(String string) {
        teachersPage.name.sendKeys(faker.name().firstName());
        WaitUtils.waitFor(1);
//        teachersPage.name.sendKeys(string);
    }

    @When("enters {string} in surname field")
    public void enters_in_surname_field(String string) {
        teachersPage.surname.sendKeys(faker.name().lastName());
        WaitUtils.waitFor(1);
//        teachersPage.surname.sendKeys(string);
    }

    @When("enters {string} in birth place field")
    public void enters_in_birth_place_field(String string) {
        teachersPage.birthPlace.sendKeys(birthPlaceGenerator());
        WaitUtils.waitFor(1);
//        teachersPage.birthPlace.sendKeys(string);
    }

    @When("enters {string} in email field")
    public void enters_in_email_field(String string) {
        teachersPage.email.sendKeys(usernameGenerator()+"@gmail.com");
        WaitUtils.waitFor(1);
//        teachersPage.email.sendKeys(string);
    }

    @When("enters {string} in phone field")
    public void enters_in_phone_field(String string) {
        teachersPage.phone.sendKeys(phoneNumberGenerator());
        WaitUtils.waitFor(1);
//        teachersPage.phone.sendKeys(string);
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
    public void enters_in_date_of_birth_field(String string) {
        teachersPage.dateOfBirth.sendKeys(dateOfBirthGenerator(), Keys.TAB);
//        teachersPage.dateOfBirth.sendKeys(string);
    }

    @When("enters {string} in ssn field")
    public void enters_in_ssn_field(String string) {
        teachersPage.ssn.sendKeys(ssnGenerator());
//        teachersPage.ssn.sendKeys(string);
    }

    @When("enters {string} in user name field")
    public void enters_in_user_name_field(String string) {
        teachersPage.userName.sendKeys(usernameGenerator());
//        teachersPage.userName.sendKeys(string);
    }

    @When("enters {string} in password field")
    public void enters_in_password_field(String string) {
        teachersPage.password.sendKeys(passwordGenerator());
//        teachersPage.password.sendKeys(string);
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


//  TC_02_create_teacher_asvicedean_invalid StepDefs
    @When("enters only {int} digits {string} in ssn field")
    public void enters_only_digits_in_ssn_field(Integer int1, String string) {
        teachersPage.ssn.sendKeys(ssn8DigitGenerator());
//        teachersPage.ssn.sendKeys(string);
    }

    @Then("verify error message {string}")
    public void verify_error_message(String string) {
        Assert.assertEquals(string, teachersPage.ssnErrorMsg.getText());
    }
}