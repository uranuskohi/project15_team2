package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.Admin_Management_Page;
import pages.Guest_User_List_Page;
import pages.Main_Page;
import pages.Teachers_Page;
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

public class US_02_AdminSeesGuestUserList_StepDefs {
Admin_Management_Page admin_management_page= new Admin_Management_Page();
    Main_Page mainPage=new Main_Page();
    static Guest_User_List_Page guest_user_list_page=new Guest_User_List_Page();
    BrowserUtils browserUtils=new BrowserUtils();
    Actions actions = new Actions(Driver.getDriver());


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



//    @Given("clicks {string} in the Gender field")
//    public void clicks_in_the_gender_field(String string) throws InterruptedException {


//    }

//    @When("selects gender radio button")
//    public static void selectGenderRadioButton() throws InterruptedException {
//        Thread.sleep(1000);
//        guest_user_list_page.genderOnRegister.click();
//        WaitUtils.waitFor(3);
//    }

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
    public void clicks_register_button() {
        ActionsUtils.actionsScrollUp();
//        guest_user_list_page.registerButton1.click();
        BrowserUtils.clickWithTimeOut(guest_user_list_page.registerButton1,3);
//        actions.moveToElement(guest_user_list_page.registerButton1).click().perform();
//        WaitUtils.waitForClickablility(guest_user_list_page.registerButton1,5);
//        WaitUtils.waitFor(2);



    }
    @Then("verifies success mesg {string}")
    public void verifies_success_mesg(String string) {



//        String actualText=BrowserUtils.getTextWithTimeout(guest_user_list_page.registeredSuccessMessage,5);
//       WaitUtils.waitFor(1);
       String actualText = guest_user_list_page.registeredSuccessMessage.getText();
//        WaitUtils.waitFor(1);
//
//       System.out.println(actualText);
//        System.out.println(actualText);
        Assert.assertEquals(string,actualText);


    }
//
//
//    @Given("clicks on guest user on the main menu")
//    public void clicks_on_guest_user_on_the_main_menu() {
//
//    }
//    @Then("verifies name column is visible")
//    public void verifies_name_column_is_visible() {
//
//    }


}
