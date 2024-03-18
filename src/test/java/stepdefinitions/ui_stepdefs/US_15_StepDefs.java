package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import pages.Main_Page;
import pages.Student_Management_Page;
import pages.Vice_Dean_Management_Page;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class US_15_StepDefs {

    Main_Page mainPage = new Main_Page();
    Student_Management_Page studentManagementPage = new Student_Management_Page();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    String ssnForVerification;


    @Given("vice dean chooses {string} in the advisor teacher dropdown")
    public void vice_dean_chooses_in_the_advisor_teacher_dropdown(String advisorTeacher) {
        Select selectTeacher = new Select(studentManagementPage.chooseTeacher);
        selectTeacher.selectByVisibleText(advisorTeacher);
    }
    @Given("enters name {string},surname {string},birthplace {string},email {string},phone {string},dateofbirth {string},ssn {string},username {string},fathername {string},mothername {string},password {string}")
    public void enters_name_surname_birthplace_email_phone_dateofbirth_ssn_username_fathername_mothername_password(String name, String surname, String birthPlace, String email, String phone, String dateOfBirth, String ssn, String userName, String fatherName, String motherName, String password) {

    name = Faker.instance().name().firstName();

    BrowserUtils.sendKeysWithTimeout(studentManagementPage.firstName,name,2);


    surname = Faker.instance().name().lastName();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.lastName,surname,2);


    birthPlace = Faker.instance().address().city();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.birthPlace,birthPlace,2);


    email = Faker.instance().internet().emailAddress();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.email,email,2);


    phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.phoneNumber,phone,2);


    String year = String.valueOf(Faker.instance().number().numberBetween(1940,2023));
    String month = String.valueOf(Faker.instance().number().numberBetween(1,13));
    String day = String.valueOf(Faker.instance().number().numberBetween(1,32));
    studentManagementPage.dateOfBirth.sendKeys(year, Keys.TAB,month,Keys.ENTER,day,Keys.ENTER);


    ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.ssn,ssn,2);
    ssnForVerification=ssn;


    userName = Faker.instance().name().fullName();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.userName,userName,2);


    fatherName = Faker.instance().name().firstName();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.fatherName,fatherName,2);


    motherName = Faker.instance().name().firstName();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.motherName,motherName,2);


    password = Faker.instance().internet().password(8,15,true,true,true)+"a1";
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.password,password,2);
    }
    @Given("selects {string} radio button")
    public void selects_radio_button(String gender) {

        switch (gender) {
            case "Male":
                BrowserUtils.clickWithTimeOut(studentManagementPage.genderMale, 2);
                break;
            case "Female":
                BrowserUtils.clickWithTimeOut(studentManagementPage.genderFemale, 2);
                break;
        }
    }

    @Then("vice dean clicks submit button")
    public void vice_dean_clicks_submit_button() {
    BrowserUtils.clickWithTimeOut(studentManagementPage.studentSubmitButton,2);
    }
    @Then("verify student is created successfully message")
    public void verify_student_is_created_successfully_message() {
    studentManagementPage.createdSuccessfullyMessage.isDisplayed();
    }


    @Then("verify student snn  appear in the student list")
    public void verify_student_snn_appear_in_the_student_list() {

        JSUtils.JSscrollAllTheWayDown();
        BrowserUtils.clickWithTimeOut(studentManagementPage.lastPageButton,10);


        boolean dataFound = false;

        while (!dataFound) {

            WebElement desiredData = Driver.getDriver().findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr//td[.='"+ssnForVerification+"']"));

            if (desiredData.isDisplayed()) {
                dataFound = true;
                System.out.println("Data found: " + desiredData.getText());
                break;
            }

            studentManagementPage.previousButton.click();
        }
        Assert.assertTrue(dataFound);



    }



}



