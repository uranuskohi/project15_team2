package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import pages.Teachers_Page;
import utilities.ActionsUtils;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.text.SimpleDateFormat;


public class US_13_TC_01_StepDefs {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();

    @When("enters {string} in select lesson field")
    public void enters_in_select_lesson_field(String string) {
        ActionsUtils.actionsDoubleClick(teachersPage.selectLesson);
        WaitUtils.waitFor(1);
        teachersPage.selectLesson.sendKeys("Java", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in name field")
    public void enters_in_name_field(String string) {
        teachersPage.name.sendKeys(faker.name().firstName());
        WaitUtils.waitFor(1);
//        teachersPage.name.sendKeys("Bob");
    }

    @When("enters {string} in surname field")
    public void enters_in_surname_field(String string) {
        teachersPage.surname.sendKeys(faker.name().lastName());
        WaitUtils.waitFor(1);
//        teachersPage.surname.sendKeys("Smith");
    }

    @When("enters {string} in birth place field")
    public void enters_in_birth_place_field(String string) {
        teachersPage.birthPlace.sendKeys(faker.address().city());
        WaitUtils.waitFor(1);
//        teachersPage.birthPlace.sendKeys("London");
    }

    @When("enters {string} in email field")
    public void enters_in_email_field(String string) {
        teachersPage.email.sendKeys(faker.internet().emailAddress());
        WaitUtils.waitFor(1);
//        teachersPage.email.sendKeys("bob@gmail.com");
    }

    @When("enters {string} in phone field")
    public void enters_in_phone_field(String string) {
        teachersPage.phone.sendKeys(phoneNumberGenerator());
        WaitUtils.waitFor(1);
//        teachersPage.phone.sendKeys("102-203-3045");
    }

    public static String phoneNumberGenerator(){
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("##########");
        String fakerPhoneNumber = phoneNumber.substring(0,3)+"-"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6,10);
        return fakerPhoneNumber;
    }

    @When("selects is advisor teacher")
    public void selects_is_advisor_teacher() {
        teachersPage.isAdvisorTeacher.click();
    }

    @When("selects {string} gender radio button")
    public void selects_gender_radio_button(String string) {
        selectGenderRadioButton();
    }

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

    @When("selects date of birth in date of birth field")
    public void selects_date_of_birth_in_date_of_birth_field() {
        teachersPage.dateOfBirth.sendKeys(dateOfBirthGenerator());
//        teachersPage.dateOfBirth.sendKeys("01012000");
    }


    public static String dateOfBirthGenerator(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Faker faker = new Faker();
        String fakerDateOfBirth = simpleDateFormat.format(faker.date().birthday());
        return fakerDateOfBirth;
    }

    @When("enters {string} in ssn field")
    public void enters_in_ssn_field(String string) {
        teachersPage.ssn.sendKeys(ssnGenerator());
//        teachersPage.ssn.sendKeys("401-50-6012");
    }

    public static String ssnGenerator(){
        Faker faker = new Faker();
        String fakerSsn;
        do {
            fakerSsn = faker.numerify("###-##-####");
        } while (fakerSsn.startsWith("9"));
        return fakerSsn;
    }


    @When("enters {string} in user name field")
    public void enters_in_user_name_field(String string) {
        teachersPage.userName.sendKeys(faker.name().username());
//        teachersPage.userName.sendKeys("bobsmith");

    }

    @When("enters {string} in password field")
    public void enters_in_password_field(String string) {
        teachersPage.password.sendKeys(faker.internet().password(8,12,true, true, true));
//        teachersPage.password.sendKeys("BOBsmith123");
    }

    @When("clicks submit button")
    public void clicks_submit_button() {
        teachersPage.submit.click();
    }

    @Then("verify the teacher is created")
    public void verify_the_teacher_is_created() {
        JSUtils.JSclickWithTimeout(teachersPage.successMsg);
        String text = teachersPage.successMsg.getText();
        System.out.println(text);
    }
}