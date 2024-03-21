package stepdefinitions.ui_stepdefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import pages.Teachers_Page;
import utilities.*;
import static utilities.TestUtils.*;

public class US_14_ViceDeanUpdatesTeacher {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    public int desiredTeacherRow = 0;

    WebElement nameElement;
    WebElement phoneElement;
    WebElement ssnElement;
    WebElement usernameElement;

    //  US14_TC_01_update_teacher_asvicedean_valid_StepDefs
    @Given("user finds {string} on teacher list")
    public void user_finds_on_teacher_list(String username) {

//        System.out.println(fullNameForAssertion);
        JSUtils.JSscrollIntoView(teachersPage.lastPageButton);
        BrowserUtils.clickWithTimeOut(teachersPage.lastPageButton, 2);

        int count = 1;

//        boolean usernameFound = false;
//        while (!usernameFound) {

            for (WebElement teacherUsernameList : teachersPage.usernameColumn) {

//                if (teacherUsernameList.getText().equalsIgnoreCase("bobsmith")) {
                desiredTeacherRow = count;
                count++;
            }
                    nameElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[1])[" + desiredTeacherRow + "]"));
                    phoneElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[2])[" + desiredTeacherRow + "]"));
                    ssnElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[3])[" + desiredTeacherRow + "]"));
                    usernameElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[4])[" + desiredTeacherRow + "]"));
//                    usernameFound = true;
//                    break;
            }
//                if (!usernameFound) {
//                    WaitUtils.waitFor(1);
//                    actions.moveToElement(teachersPage.previousPageButton).click().perform();
//                    WaitUtils.waitFor(1);
//                    count = 1;
//                }
//        }


//    @Then("verify fullname in name field")
//    public void verify_fullname_in_name_field() {
////    Assert.assertTrue(fullNameForAssertion.equalsIgnoreCase(nameElement.toString()));
//        Assert.assertEquals("Bob Smith", nameElement.getText());
//    }
//
//    @Then("verify {string} in phone field")
//    public void verify_in_phone_field(String phone) {
////        Assert.assertTrue(phoneForAssertion.equalsIgnoreCase(phoneElement.toString()));
//        Assert.assertEquals(phone, nameElement.getText());
//      }
//
//    @Then("verify {string} in ssn field")
//    public void verify_in_ssn_field(String ssn) {
////        Assert.assertTrue(ssnForAssertion.equalsIgnoreCase(ssnElement.toString()));
//        Assert.assertEquals(ssn, nameElement.getText());
//    }
//
//    @Then("verify {string} in user name field")
//    public void verify_in_user_name_field(String username) {
////        Assert.assertTrue(usernameForAssertion.equalsIgnoreCase(usernameElement.toString()));
//        Assert.assertEquals(username, nameElement.getText());
//    }

    @When("clicks on edit button")
    public void clicks_on_edit_button() {
        WebElement editButtonElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr//td[5])[" + desiredTeacherRow + "]"));
        editButtonElement.click();
    }

    @When("enters {string} in edit select lesson field")
    public void enters_in_edit_select_lesson_field(String lesson) {
        actions.moveToElement(teachersPage.editSelectLessonVD).doubleClick().perform();
        WaitUtils.waitFor(1);
        teachersPage.editSelectLessonVD.sendKeys(lesson, Keys.TAB, Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in edit name field")
    public void enters_in_edit_name_field(String name) {
        teachersPage.editNameVD.sendKeys(Keys.DELETE);
        name = faker.name().firstName();
        teachersPage.editNameVD.sendKeys(name);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in edit surname field")
    public void enters_in_edit_surname_field(String surname) {
        teachersPage.editSurnameVD.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        WaitUtils.waitFor(1);
        surname = faker.name().lastName();
        teachersPage.editSurnameVD.sendKeys(surname);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in edit birth place field")
    public void enters_in_edit_birth_place_field(String birthplace) {
        teachersPage.editBirthPlaceVD.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        birthplace = birthPlaceGenerator();
        teachersPage.editBirthPlaceVD.sendKeys(birthplace);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in edit email field")
    public void enters_in_edit_email_field(String email) {
        teachersPage.editEmailVD.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        email = faker.regexify("[a-z]{9}")+"@"+faker.internet().domainName();
        teachersPage.editEmailVD.sendKeys(email);
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in edit phone field")
    public void enters_in_edit_phone_field(String phone) {
        teachersPage.editPhoneVD.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        phone = phoneNumberGenerator();
        teachersPage.editPhoneVD.sendKeys(phone);
    }

    @When("enters {string} in edit ssn field")
    public void enters_in_edit_ssn_field(String ssn) {
        teachersPage.editSsnVD.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        ssn = ssnGenerator();
        teachersPage.editSsnVD.sendKeys(ssn);
        WaitUtils.waitFor(1);
    }

    @When("selects edit is advisor teacher")
    public void selects_edit_is_advisor_teacher() {
        teachersPage.editIsAdvisorTeacherVD.click();
        WaitUtils.waitFor(1);
    }

    @When("selects edit gender radio button")
    public void selects_edit_gender_radio_button() {
        Teachers_Page teachersPage = new Teachers_Page();
        if (!teachersPage.editMaleVD.isSelected() && !teachersPage.editFemaleVD.isSelected()){
            teachersPage.editMaleVD.click();
        }else if (teachersPage.editMaleVD.isSelected()){
            teachersPage.editFemaleVD.click();
        }else if (teachersPage.editFemaleVD.isSelected()){
            teachersPage.editMaleVD.click();
        }
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in edit date of birth field")
    public void enters_in_edit_date_of_birth_field(String dateofbirth) {
        teachersPage.editDateOfBirthVD.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        dateofbirth = dateOfBirthGenerator();
        teachersPage.editDateOfBirthVD.sendKeys(dateofbirth, Keys.TAB);
        WaitUtils.waitFor(1);
    }
    @When("enters {string} in edit user name field")
    public void enters_in_edit_user_name_field(String username) {
        teachersPage.editUserNameVD.sendKeys(Keys.DELETE);
        username = faker.regexify("[a-z]{9}");
        teachersPage.editUserNameVD.sendKeys(username);
        WaitUtils.waitFor(2);
    }
    @When("enters {string} in edit password field")
    public void enters_in_edit_password_field(String password) {
        password = passwordGenerator();
        teachersPage.editPasswordVD.sendKeys(password);
        WaitUtils.waitFor(2);
    }

    @When("clicks edit submit button")
    public void clicks_edit_submit_button() {
        actions.moveToElement(teachersPage.editSubmitVD).click().perform();
        WaitUtils.waitFor(1);
    }

//    US14_TC_02_update_teacher_asvicedean_invalid_StepDefs
    @When("removes email from email field")
    public void removes_email_from_email_field() {
        teachersPage.editEmailVD.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        WaitUtils.waitFor(1);
    }

    @And("verify email error message {string}")
    public void verify_email_error_message(String emailErrorMsg) {
        actions.moveToElement(teachersPage.emailErrorMsg).click().perform();
        String actualMsg = teachersPage.emailErrorMsg.getText();
        Assert.assertTrue(emailErrorMsg.equalsIgnoreCase(actualMsg));
    }
}
