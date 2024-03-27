package stepdefinitions.ui_stepdefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Teachers_Page;
import utilities.*;


import static stepdefinitions.ui_stepdefs.US_13_and_US_24_ViceDeanAndAdminCreatesTeacher.*;
import static utilities.TestUtils.*;

public class US_14_ViceDeanUpdatesTeacher {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    int desiredTeacherRow;

    WebElement nameElement;
    WebElement phoneElement;
    WebElement ssnElement;
    WebElement usernameElement;
    WebElement editButton;

    //  US14_TC_01_update_teacher_asvicedean_valid_StepDefs
    @Given("user clicks on last page of teacher list")
    public void user_clicks_on_last_page_of_teacher_list() {

        JSUtils.JSscrollAllTheWayDown();
        WaitUtils.waitFor(2);
        JSUtils.JSclickWithTimeout(teachersPage.lastPageButton);
        WaitUtils.waitFor(3);

    }
    @When("finds created teacher")
    public void findsCreatedTeacher() {

        int count = 1;
        desiredTeacherRow = 0;
        for (WebElement teacherList : teachersPage.usernameColumn) {
            if (teacherList.getText().equalsIgnoreCase(usernameForAssertion)) {
                desiredTeacherRow = count;
                nameElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr[" + desiredTeacherRow + "]//td[1])"));
                System.out.println("nameElement.getText() = " + nameElement.getText());
                phoneElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr[" + desiredTeacherRow + "]//td[2])"));
                System.out.println("phoneElement.getText() = " + phoneElement.getText());
                ssnElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr[" + desiredTeacherRow + "]//td[3])"));
                System.out.println("ssnElement.getText() = " + ssnElement.getText());
                usernameElement = Driver.getDriver().findElement(By.xpath("(//div[@class='table-responsive']//tbody//tr[" + desiredTeacherRow + "]//td[4])"));
                System.out.println("usernameElement.getText() = " + usernameElement.getText());
                break;
            }
            count++;
        }
        System.out.println("desiredTeacherRow = " + desiredTeacherRow);
    }

    @Then("verify {string} in name field")
    public void verify_in_name_field(String fullname) {
        fullname = nameElement.getText();
            Assert.assertEquals(firstnameForAssertion+" "+surnameForAssertion, fullname);
    }

    @Then("verify {string} in phone field")
    public void verify_in_phone_field(String phone) {
        phone = phoneElement.getText();
        Assert.assertEquals(phoneForAssertion, phone);
    }

    @Then("verify {string} in ssn field")
    public void verify_in_ssn_field(String ssn) {
        ssn = ssnElement.getText();
        Assert.assertEquals(ssnForAssertion, ssn);
    }

    @Then("verify {string} in user name field")
    public void verify_in_user_name_field(String username) {
        username = usernameElement.getText();
        Assert.assertEquals(usernameForAssertion, username);
    }

    @When("clicks on edit button")
    public void clicks_on_edit_button() {
//        System.out.println("desiredTeacherRow = " + desiredTeacherRow);
        WaitUtils.waitFor(1);
//        editButton = Driver.getDriver().findElement(By.xpath("//div[@class='table-responsive']//tbody//tr[" + desiredTeacherRow + "]//td[5]//i[@class='fa-solid fa-pencil']"));
        editButton = Driver.getDriver().findElement(By.xpath("//div[@class='table-responsive']//tbody//tr[1]//td[5]//i[@class='fa-solid fa-pencil']"));
        actions.moveToElement(editButton).doubleClick().perform();
        WaitUtils.waitFor(1);
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
        username = faker.regexify("[a-z]{5}");
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