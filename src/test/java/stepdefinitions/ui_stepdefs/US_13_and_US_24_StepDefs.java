package stepdefinitions.ui_stepdefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Teachers_Page;
import testdata.TeacherCredentials;
import utilities.*;
import static utilities.TestUtils.*;


public class US_13_and_US_24_StepDefs {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();

    TeacherCredentials teacherCredentials = TeacherCredentials.getInstance();

    Actions actions = new Actions(Driver.getDriver());

    public static String nameToAssert;

    @When("enters {string} in name field")
    public void enters_in_name_field(String name) {
        name = faker.name().firstName();
        nameForAssertion = name;
        teachersPage.name.sendKeys(name);
//        teacherCredentials.setNameForAssertion(name);
//        System.out.println(teacherCredentials.getNameForAssertion());
        WaitUtils.waitFor(1);
    }

    //  TC_01_create_teacher_asvicedean_valid StepDefs
    @When("enters {string} in select lesson field as {string}")
    public void enters_in_select_lesson_field(String lesson, String user) {
        ActionsUtils.actionsDoubleClick(teachersPage.selectLessonViceDean);
        WaitUtils.waitFor(1);
        teachersPage.selectLessonViceDean.sendKeys(lesson, Keys.TAB, user);
        WaitUtils.waitFor(1);

        if(user.equals("admin")){
            teachersPage.selectLessonAdmin.click();
        } else if (user.equals("vice dean")){
            teachersPage.selectLessonViceDean.click();
        } else {
            System.out.println("Unknown user: " +user);
        }
    }

    @When("enters {string} in surname field")
    public void enters_in_surname_field(String surname) {
        surname = faker.name().lastName();
        teachersPage.surname.sendKeys(surname);
        teacherCredentials.setLastNameForAssertion(surname);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in birth place field")
    public void enters_in_birth_place_field(String birthplace) {
        birthplace = birthPlaceGenerator();
        teachersPage.birthPlace.sendKeys(birthplace);
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
        teacherCredentials.setPhoneForAssertion(phone);
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
    public void enters_in_date_of_birth_field(String dateofbirth) {
        dateofbirth = dateOfBirthGenerator();
        teachersPage.dateOfBirth.sendKeys(dateofbirth, Keys.TAB);
    }

    @When("enters {string} in ssn field")
    public void enters_in_ssn_field(String ssn) {
        ssn = ssnGenerator();
        teachersPage.ssn.sendKeys(ssn);
        teacherCredentials.setSsnForAssertion(ssn);
    }

    @When("enters {string} in user name field")
    public void enters_in_user_name_field(String username) {
        username = TestUtils.usernameGenerator();
        teachersPage.userName.sendKeys(username);
        teacherCredentials.setUsernameForAssertion(username);
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

    }
