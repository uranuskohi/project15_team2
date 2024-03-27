package stepdefinitions.db_stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.Guest_User_List_Page;
import pages.Main_Page;
import utilities.DBUtils;
import utilities.Driver;
import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

public class DB_US_02_AdminSeesGuestUser_Stepdefs {
    Main_Page mainPage=new Main_Page();
    Guest_User_List_Page guest_user_list_page=new Guest_User_List_Page();
    Actions actions=new Actions(Driver.getDriver());

    @Given("clicks on register button")
    public void clicks_on_register_button() {
        mainPage.registerIconAtHeader.click();
    }

@When("Enter name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, date_of_birth {string},ssn {string},username {string},password {string}")
public void enter_name_surname_birth_place_phone_number_gender_date_of_birth_ssn_username_password_dugur123(String name, String surname, String birth_place, String phone_number, String gender, String date_of_birth, String ssn, String username,String password) {
    guest_user_list_page.nameOnRegister.sendKeys(name);
        guest_user_list_page.surnameOnRegister.sendKeys(surname);
        guest_user_list_page.birthplaceOnRegister.sendKeys(birth_place);
        guest_user_list_page.phoneOnRegister.sendKeys(phone_number);
        actions.moveToElement(guest_user_list_page.genderFemaleOnRegister).click().perform();
        guest_user_list_page.dateOfBirthOnRegister.sendKeys(date_of_birth);
        guest_user_list_page.ssnOnRegister.sendKeys(ssn);
        guest_user_list_page.userNameOnRegister.sendKeys(username);
        guest_user_list_page.passwordOnRegister.sendKeys(password);
}
    @Then("click on register button")
    public void click_on_register_button() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
        actions.moveToElement(guest_user_list_page.registerButton1).click().perform();
    }

    @When("user gets guest user via username {string}")
    public void user_gets_guest_user_via_username(String username) {
        DBUtils.executeQuery("SELECT * FROM guest_user WHERE username='"+username+"'");

    }
    @Then("body contains gender {string}, name {string}, phone_number {string}, ssn {string}, username {string}")
    public void body_contains_gender_name_phone_number_ssn_username(String gender, String name, String phone_number, String ssn, String username) throws SQLException {
        DBUtils.getResultset().next();
        String actualGender=DBUtils.getResultset().getString("gender");
        String actualName=DBUtils.getResultset().getString("name");
        String actualPhoneNumber=DBUtils.getResultset().getString("phone_number");
        String actualSsn=DBUtils.getResultset().getString("ssn");
        String actualUsername=DBUtils.getResultset().getString("username");
        assertEquals(gender,actualGender);
        assertEquals(name,actualName);
        assertEquals(phone_number,actualPhoneNumber);
        assertEquals(ssn,actualSsn);
        assertEquals(username,actualUsername);
    }

}
