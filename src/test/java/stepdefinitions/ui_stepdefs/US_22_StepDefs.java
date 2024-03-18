package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Admin_Management_Page;
import pages.Main_Page;
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

public class US_22_StepDefs {

    Admin_Management_Page admin_management_page=new Admin_Management_Page();
    Main_Page mainPage=new Main_Page();
    Actions actions=new Actions(Driver.getDriver());
    WaitUtils waitUtils=new WaitUtils();
    BrowserUtils browserUtils=new BrowserUtils();

    @Given("enters {string} in the name field")
    public void enters_in_the_name_field(String string) {
        admin_management_page.nameBoxOnAdminPage.sendKeys(string);

    }
    @Given("enters {string} in the Surname field")
    public void enters_in_the_surname_field(String string) {
        admin_management_page.surnameBoxOnAdminPage.sendKeys(string);
    }
    @Given("enters {string} in the Birth Place field")
    public void enters_in_the_birth_place_field(String string) {
        admin_management_page.birthPlaceOnAdminPage.sendKeys(string);

    }
    @Given("enters {string} in Gender field")
    public void enters_in_gender_field(String string) {
        admin_management_page.genderFemaleOnAdminPage.click();

    }
    @Given("enters {string} in DateOfBirth field")
    public void enters_in_date_of_birth_field(String string) {
        admin_management_page.dateOfBirthOnAdminPage.sendKeys(string);

    }
    @Given("enters {string} in Phone Number field")
    public void enters_in_phone_number_field(String string) {
        admin_management_page.phoneNumberOnAdminPage.sendKeys(string);

    }
    @Given("enters ssn in SSN field")
    public void enters_ssn_in_ssn_field() {
        admin_management_page.ssnOnAdminPage.sendKeys("440-40-4040");

    }
    @Given("enters {string} in Username field")
    public void enters_in_username_field(String string) {
        admin_management_page.userName.sendKeys(string);

    }

    @Given("enters password in Password field")
    public void enters_password_in_password_field() {
        admin_management_page.password.sendKeys("Asmith12");

    }
    @Given("clicks on Submit button")
    public void clicks_on_submit_button() {
        BrowserUtils.clickWithTimeOut(admin_management_page.submitButton,3);

    }
    @Then("verifies success message {string}")
    public void verifies_success_message(String string) {
        WaitUtils.waitFor(1);
        String actualText = admin_management_page.adminSavedAlert.getText();
        System.out.println(actualText);
        WaitUtils.waitFor(1);
        System.out.println(actualText);
        Assert.assertEquals(string, actualText);

    }
//  TC02

    @Given("scrolls down to the last page")
    public void scrolls_down_to_the_last_page() {
        ActionsUtils.actionsScrollDown();
    }


    @Given("goes to the last page")
    public void goes_to_the_last_page() throws InterruptedException {
        waitUtils.waitFor(3);
        BrowserUtils.clickWithTimeOut(admin_management_page.lastPageButton,2);
        Thread.sleep(2000);
    }

    @Given("scrolls up to the admin list")
    public void scrolls_up_to_the_admin_list() {
        ActionsUtils.actionsScrollUp();
    }


//    @Given("Delete if the admin name {string} exist on the Admin List")
//    public void delete_if_the_admin_name_exist_on_the_admin_list(String string) {
//        int count = 1;
//        int desiredAdminRow = 0;
//        for (WebElement adminNameList : admin_management_page.nameColumn1) {
//            if (adminNameList.getText().equalsIgnoreCase(string)) {
//                desiredAdminRow = count;
//                WebElement element = Driver.getDriver().findElement(By.xpath("(//i[@class='fa-solid fa-trash'])[" + desiredAdminRow + "]"));
//                actions.moveToElement(element).click().perform();
//                break;
//            }
//            count++;
//        }
//    }

//    ///////////////////////////////// US_22_TC02
//    @Given("admin is in admin management page")
//    public void admin_is_in_admin_management_page() {
//
//    }
//    @Given("leaves blank in the name field")
//    public void leaves_blank_in_the_name_field() {
//        admin_management_page.nameBoxOnAdminPage.sendKeys("");
//
//
//    }

}
//
//    @Then("verifies Admin is not created")
//    public void verifies_admin_is_not_created() {
//
//    }



