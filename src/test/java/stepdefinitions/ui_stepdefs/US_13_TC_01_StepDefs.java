//package stepdefinitions.ui_stepdefs;
//
//import com.github.javafaker.Faker;
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
//import pages.Teachers_Page;
//import utilities.ActionsUtils;
//import utilities.JSUtils;
//import utilities.WaitUtils;
//
//import java.text.SimpleDateFormat;
//
//
//public class US_13_TC_01_StepDefs {
//
//    Teachers_Page teachersPage = new Teachers_Page();
//    Faker faker = new Faker();
//
//    @When("enters {string} in select lesson field")
//    public void enters_in_select_lesson_field(String string) {
//        ActionsUtils.actionsDoubleClick(teachersPage.selectLesson);
//        WaitUtils.waitFor(1);
//        teachersPage.selectLesson.sendKeys("Java", Keys.TAB);
//        WaitUtils.waitFor(1);
//    }
//
//    @When("enters {string} in name field")
//    public void enters_in_name_field(String string) {
//        teachersPage.name.sendKeys(faker.name().firstName());
//        WaitUtils.waitFor(1);
////        teachersPage.name.sendKeys(string);
//    }
//
//    @When("enters {string} in surname field")
//    public void enters_in_surname_field(String string) {
//        teachersPage.surname.sendKeys(faker.name().lastName());
//        WaitUtils.waitFor(1);
////        teachersPage.surname.sendKeys(string);
//    }
//
//    @When("enters {string} in birth place field")
//    public void enters_in_birth_place_field(String string) {
//        teachersPage.birthPlace.sendKeys(faker.lorem().word());
//        WaitUtils.waitFor(1);
////        teachersPage.birthPlace.sendKeys(string);
//    }
//
//    @When("enters {string} in email field")
//    public void enters_in_email_field(String string) {
//        teachersPage.email.sendKeys(usernameGenerator()+"@gmail.com");
//        WaitUtils.waitFor(1);
////        teachersPage.email.sendKeys(string);
//    }
//
//    @When("enters {string} in phone field")
//    public void enters_in_phone_field(String string) {
//        teachersPage.phone.sendKeys(phoneNumberGenerator());
//        WaitUtils.waitFor(1);
////        teachersPage.phone.sendKeys(string);
//    }
//
//    public static String phoneNumberGenerator(){
//        Faker faker = new Faker();
//        String phoneNumber = faker.numerify("##########");
//        String fakerPhoneNumber = phoneNumber.substring(0,3)+"-"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6,10);
//        return fakerPhoneNumber;
//    }
//
//    @When("selects is advisor teacher")
//    public void selects_is_advisor_teacher() {
//        teachersPage.isAdvisorTeacher.click();
//    }
//
//
//    public static void selectGenderRadioButton(){
//        Teachers_Page teachersPage = new Teachers_Page();
//        if (!teachersPage.male.isSelected() && !teachersPage.female.isSelected()){
//            teachersPage.male.click();
//        }else if (teachersPage.male.isSelected()){
//            teachersPage.female.click();
//        }else if (teachersPage.female.isSelected()){
//            teachersPage.male.click();
//        }
//    }
//
//    @When("selects date of birth in date of birth field")
//    public void selects_date_of_birth_in_date_of_birth_field() {
//        teachersPage.dateOfBirth.sendKeys(dateOfBirthGenerator(), Keys.TAB);
////        teachersPage.dateOfBirth.sendKeys(string);
//    }
//
//
//    public static String dateOfBirthGenerator(){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Faker faker = new Faker();
//        String fakerDateOfBirth = simpleDateFormat.format(faker.date().birthday());
//        return fakerDateOfBirth;
//    }
//
//    @When("enters {string} in ssn field")
//    public void enters_in_ssn_field(String string) {
//        teachersPage.ssn.sendKeys(ssnGenerator());
////        teachersPage.ssn.sendKeys(string);
//    }
//
//    public static String ssnGenerator(){
//        Faker faker = new Faker();
//        String ssn = faker.numerify("#########");
//        String fakerSsn;
//        do {
//            fakerSsn = ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);
//        } while (fakerSsn.startsWith("9"));
//        return fakerSsn;
//    }
//
//
//    @When("enters {string} in user name field")
//    public void enters_in_user_name_field(String string) {
//        teachersPage.userName.sendKeys(usernameGenerator());
////        teachersPage.userName.sendKeys(string);
//    }
//
//    public static String usernameGenerator() {
//        Faker faker = new Faker();
//        String fakerUsername;
//        do {
//            fakerUsername = faker.lorem().word();
//        } while (fakerUsername.length()<=4);
//        return fakerUsername;
//    }
//
//    @When("enters {string} in password field")
//    public void enters_in_password_field(String string) {
//        teachersPage.password.sendKeys(passwordGenerator());
////        teachersPage.password.sendKeys(string);
//    }
//
//    public static String passwordGenerator() {
//        Faker faker = new Faker();
//        String fakerPassword;
//        do {
//            fakerPassword = faker.internet().password(8, 12, true, false)+faker.numerify("#");
//        } while (!containsLowercase(fakerPassword));
//        return fakerPassword;
//    }
//
//    private static boolean containsLowercase(String fakerPassword) {
//        for (char c : fakerPassword.toCharArray()) {
//            if (Character.isLowerCase(c)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @When("clicks submit button")
//    public void clicks_submit_button() {
//        teachersPage.submit.click();
//    }
//
//    @Then("verify success message {string}")
//    public void verify_success_message(String string) {
//        WaitUtils.waitFor(1);
//        String actualText = teachersPage.successMsg.getText();
//        WaitUtils.waitFor(1);
//        System.out.println(actualText);
//        Assert.assertEquals(string, actualText);
//    }
//}