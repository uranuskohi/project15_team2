package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Admin_Management_Page;
import pages.Guest_User_List_Page;
import pages.Main_Page;
import pages.Teachers_Page;
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

import java.time.Duration;
import java.util.List;

import static java.awt.SystemColor.text;
import static org.junit.Assert.assertEquals;

public class US_02_AdminSeesGuestUserList_StepDefs {
Admin_Management_Page admin_management_page= new Admin_Management_Page();
    Main_Page mainPage=new Main_Page();
    Guest_User_List_Page guest_user_list_page=new Guest_User_List_Page();
    BrowserUtils browserUtils=new BrowserUtils();
    Actions actions = new Actions(Driver.getDriver());
    WaitUtils waitUtils=new WaitUtils();


    @Given("user clicks Register button")
    public void user_clicks_register_button() {
        mainPage.registerIconAtHeader.click();
    }
    @Given("enters {string} in the Name input field")
    public void enters_in_the_name_input_field(String string) {
        guest_user_list_page.nameOnRegister.sendKeys(string);

    }
    @Given("enters {string} in the Surname input field")
    public void enters_in_the_surname_input_field(String string) {
        guest_user_list_page.surnameOnRegister.sendKeys(string);
    }

    @Given("enters {string} in the Birth Place input field")
    public void enters_in_the_birth_place_input_field(String string) {
        guest_user_list_page.birthplaceOnRegister.sendKeys(string);
    }
    @Given("enters {string} in the phone field")
    public void enters_in_the_phone_field(String string) {
        guest_user_list_page.phoneOnRegister.sendKeys(string);
 }

    @Given("selects gender female radio button")
    public void selects_gender_female_radio_button() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(guest_user_list_page.genderFemaleOnRegister).click().perform();
        ActionsUtils.actionsScrollDown();

    }

    @Given("enters {string} in the Date Of Birth field")
    public void enters_in_the_date_of_birth_field(String string) {
        guest_user_list_page.dateOfBirthOnRegister.sendKeys(string);

    }
    @Given("enters ssn in the Ssn input field")
    public void enters_ssn_in_the_ssn_input_field() {
        guest_user_list_page.ssnOnRegister.sendKeys("444-44-4545");

    }
    @Given("enters {string} in the User Name field")
    public void enters_in_the_user_name_field(String string) {

        guest_user_list_page.userNameOnRegister.sendKeys(string);
        ActionsUtils.actionsScrollDown();
    }
    @Given("enters password in the Password input field")
    public void enters_password_in_the_password_input_field() {
        guest_user_list_page.passwordOnRegister.sendKeys("Dugur123");
        ActionsUtils.actionsScrollDown();

    }
    @Given("clicks Register button")
    public void clicks_register_button() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
        actions.moveToElement(guest_user_list_page.registerButton1).click().perform();

    }
    @Then("verifies success mesg {string}")
    public void verifies_success_mesg(String string) {

        try {
            String text = "";
            while (text.isBlank())
                text = Driver.getDriver().findElement(By.xpath("//div[@role='alert']")).getText();
            assertEquals(string,text);
        } catch (Exception e) {
            // do nothing
        }

    }

    //************TC_02
    @Given("clicks on guest user on the main menu")
    public void clicks_on_guest_user_on_the_main_menu() {
        guest_user_list_page.guestuserLink.click();

    }
    @Then("verifies {string},{string},{string},{string} columns are visible")
    public void verifies_columns_are_visible(String string, String string2, String string3, String string4) {
        Assert.assertTrue(guest_user_list_page.nameSurnameColumn.isDisplayed());
        Assert.assertTrue(guest_user_list_page.phoneNumberColumn.isDisplayed());
        Assert.assertTrue(guest_user_list_page.ssnColumn.isDisplayed());
        Assert.assertTrue(guest_user_list_page.usernameColumn.isDisplayed());

    }

    @Then("delete if the registered user {string} exist in the list")
    public void delete_if_the_registered_user_exist_in_the_list(String string) {
        int count = 1;
        int desiredAdminRow = 0;
        for (WebElement adminNameList : admin_management_page.nameColumn1) {
            if (adminNameList.getText().equalsIgnoreCase(string)) {
                desiredAdminRow = count;
                WebElement element = Driver.getDriver().findElement(By.xpath("(//i[@class='fa-solid fa-trash'])[" + desiredAdminRow + "]"));
                actions.moveToElement(element).click().perform();
                break;
            }
            count++;
        }
    }
//    @Then("delete the registered user from the list")
//    public void delete_the_registered_user_from_the_list() {
//        for(int i=1;i<=5;i++) {
//            if(Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td[4]")).getText().equalsIgnoreCase("Dugur")){
//                Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td[5]")).click();
//                break;
//            };
//
//        }
@Then("verifies the message {string}")
public void verifies_the_message(String string) {
    try {
        String text = "";
        while (text.isBlank())
            text = Driver.getDriver().findElement(By.xpath("//div[@role='alert']")).getText();
        assertEquals(string,text);
    } catch (Exception e) {
        // do nothing
    }

}
}
