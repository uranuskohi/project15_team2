package stepdefinitions.db_stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.Admin_Management_Page;
import pages.Main_Page;
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;


public class DB_US_22_Add_Admin {
    Admin_Management_Page admin_management_page=new Admin_Management_Page();
    Main_Page mainPage=new Main_Page();
    Actions actions=new Actions(Driver.getDriver());
    WaitUtils waitUtils=new WaitUtils();
    BrowserUtils browserUtils=new BrowserUtils();

    @Given("user login as Admin")
    public void user_login_as_admin() {
        mainPage.loginIconAtHeader.click();
        WaitUtils.waitForPageToLoad(5);

        mainPage.userName.sendKeys("AdminBatch197");
        mainPage.password.sendKeys("Batch197+");
        ActionsUtils.actionsDoubleClick(mainPage.loginButton);
//        JSUtils.JSclickWithTimeout(mainPage.loginButton);
        WaitUtils.waitForPageToLoad(2);

    }
    @When("enters name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, date_of_birth {string},ssn {string},username {string},password {string}")
    public void enters_name_surname_birth_place_phone_number_gender_date_of_birth_ssn_username_password(String name, String surname, String birth_place, String phone_number, String gender, String date_of_birth, String ssn, String username, String password) {
        admin_management_page.nameBoxOnAdminPage.sendKeys(name);
        admin_management_page.surnameBoxOnAdminPage.sendKeys(surname);
        admin_management_page.birthPlaceOnAdminPage.sendKeys(birth_place);
        admin_management_page.phoneNumberOnAdminPage.sendKeys(phone_number);
        actions.moveToElement(admin_management_page.genderFemaleOnAdminPage).click().perform();
//        admin_management_page.genderFemaleOnAdminPage.click();
        admin_management_page.dateOfBirthOnAdminPage.sendKeys(date_of_birth);
        admin_management_page.ssnOnAdminPage.sendKeys(ssn);
        admin_management_page.userName.sendKeys(username);
        admin_management_page.password.sendKeys(password);
    }
    @When("clicks on submit button")
    public void clicks_on_submit_button() {
    BrowserUtils.clickWithTimeOut(admin_management_page.submitButton,3);

    }
//
//    @When("user gets admins username via username {string}")
//    public void user_gets_admins_username_via_username(String string) {
//
//    }
//    @Then("verify body contains gender {string}, name {string}, phone_number {string}, ssn {string}, username {string}")
//    public void verify_body_contains_gender_name_phone_number_ssn_username(String string, String string2, String string3, String string4, String string5) {
//
//    }

}
