package stepdefinitions.ui_stepdefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Teachers_Page;
import utilities.*;
import static utilities.TestUtils.*;

public class US_13_and_US_24_ViceDeanAndAdminCreatesTeacher {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    String nameForAssertion;
    String surnameForAssertion;
    public static String fullNameForAssertion;
    public static String phoneForAssertion;
    public static String ssnForAssertion;
    public static String usernameForAssertion;


    //  TC_01_create_teacher_asvicedean_valid StepDefs
    @When("enters {string} in select lesson field as {string}")
    public void enters_in_select_lesson_field(String lesson, String user) {
        WaitUtils.waitFor(2);
        switch (user) {
            case "vice dean":
                actions.doubleClick(teachersPage.selectLessonViceDean);
                teachersPage.selectLessonViceDean.sendKeys(lesson, Keys.TAB);
                break;
            case "admin":
                actions.doubleClick(teachersPage.selectLessonAdmin);
                teachersPage.selectLessonAdmin.sendKeys(lesson, Keys.TAB);
                break;
        }
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in name field")
    public void enters_in_name_field(String name) {
//        name = faker.name().firstName();
//        String nameForAssertion = name;
//        teachersPage.name.sendKeys(nameForAssertion);
        teachersPage.name.sendKeys(name);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in surname field")
    public void enters_in_surname_field(String surname) {
//        surname = faker.name().lastName();
//        surnameForAssertion = surname;
//        String fullNameForAssertion = nameForAssertion+" "+surnameForAssertion;
//        System.out.println(fullNameForAssertion);
//        teachersPage.surname.sendKeys(surnameForAssertion);
        teachersPage.surname.sendKeys(surname);
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
        email = faker.regexify("[a-z]{9}")+"@"+faker.internet().domainName();
        teachersPage.email.sendKeys(email);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in phone field")
    public void enters_in_phone_field(String phone) {
//        phone = phoneNumberGenerator();
//        phoneForAssertion = phone;
//        teachersPage.phone.sendKeys(phoneForAssertion);
        teachersPage.phone.sendKeys(phone);
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
//        ssn = ssnGenerator();
//        ssnForAssertion = ssn;
//        teachersPage.ssn.sendKeys(ssnForAssertion);
        teachersPage.ssn.sendKeys(ssn);
    }

    @When("enters {string} in user name field")
    public void enters_in_user_name_field(String username) {
//        username = faker.regexify("[a-z]{9}");
//        usernameForAssertion = username;
//        teachersPage.userName.sendKeys(usernameForAssertion);
        teachersPage.userName.sendKeys(username);
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
    }

    @Then("verify ssn error message {string}")
    public void verify_ssn_error_message(String string) {
        Assert.assertEquals(string, teachersPage.ssnErrorMsg.getText());
    }

    }
