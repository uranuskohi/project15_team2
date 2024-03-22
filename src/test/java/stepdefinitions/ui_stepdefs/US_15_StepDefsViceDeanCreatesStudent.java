package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Main_Page;
import pages.Student_Management_Page;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.text.SimpleDateFormat;

public class US_15_StepDefsViceDeanCreatesStudent {

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


    BrowserUtils.sendKeysWithTimeout(studentManagementPage.firstName,name,3);


    surname = Faker.instance().name().lastName();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.lastName,surname,3);


    //birthPlace = Faker.instance().address().city();
        birthPlace="Turkey";
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.birthPlace,birthPlace,3);


    email = Faker.instance().internet().emailAddress();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.email,email,3);


    phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+"7987";
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.phoneNumber,phone,3);


    String year = String.valueOf(Faker.instance().number().numberBetween(1940,2023));
    String month = String.valueOf(Faker.instance().number().numberBetween(1,13));
    String day = String.valueOf(Faker.instance().number().numberBetween(1,32));
    studentManagementPage.dateOfBirth.sendKeys(year, Keys.TAB,month,Keys.ENTER,day,Keys.ENTER);


    ssn = "3"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.ssn,ssn,3);
    ssnForVerification=ssn;


   // userName = Faker.instance().name().fullName();
        userName=Faker.instance().name().firstName()+"123";
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.userName,userName,3);


    fatherName = Faker.instance().name().firstName();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.fatherName,fatherName,3);


    motherName = Faker.instance().name().firstName();
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.motherName,motherName,3);


    password = Faker.instance().internet().password(8,12,true,true,true)+"Ba1";
    BrowserUtils.sendKeysWithTimeout(studentManagementPage.password,password,3);
    }
    @Given("selects {string} radio button")
    public void selects_radio_button(String gender) {

        switch (gender) {
            case "Male":
                BrowserUtils.clickWithTimeOut(studentManagementPage.genderMale, 3);
                break;
            case "Female":
                BrowserUtils.clickWithTimeOut(studentManagementPage.genderFemale, 3);
                break;
        }
    }

    @Then("vice dean clicks submit button")
    public void vice_dean_clicks_submit_button() {
    BrowserUtils.clickWithTimeOut(studentManagementPage.studentSubmitButton,3);
    }
    @Then("verify student is created successfully message")
    public void verify_student_is_created_successfully_message() {
        WaitUtils.waitFor(1);
        String actualResult = studentManagementPage.createdSuccessfullyMessage.getText();
        WaitUtils.waitFor(1);
    Assert.assertEquals("Student saved Successfully",actualResult);
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



    //TC_02
    @Given("enters name {string},surname {string},birthplace {string},email {string},invalid phone {string},dateofbirth {string},invalid ssn {string},username {string},fathername {string},mothername {string},password {string}")
    public void enters_name_surname_birthplace_email_invalid_phone_dateofbirth_invalid_ssn_username_fathername_mothername_password(String name, String surname, String birthPlace, String email, String invalidPhone, String dateOfBirth, String invalidSnn, String userName, String fatherName, String motherName, String password) {

        name = Faker.instance().name().firstName();

        BrowserUtils.sendKeysWithTimeout(studentManagementPage.firstName,name,3);


        surname = Faker.instance().name().lastName();
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.lastName,surname,3);


        //birthPlace = Faker.instance().address().city();
        birthPlace="Turkey";
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.birthPlace,birthPlace,3);


        email = Faker.instance().internet().emailAddress();
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.email,email,3);


        invalidPhone = Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4)+"-"+Faker.instance().number().digits(4);
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.phoneNumber,invalidPhone,3);


        String year = String.valueOf(Faker.instance().number().numberBetween(1940,2023));
        String month = String.valueOf(Faker.instance().number().numberBetween(1,13));
        String day = String.valueOf(Faker.instance().number().numberBetween(1,32));
        studentManagementPage.dateOfBirth.sendKeys(year, Keys.TAB,month,Keys.ENTER,day,Keys.ENTER);


        invalidSnn = "3"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.ssn,invalidSnn,3);
        ssnForVerification=invalidSnn;


        //userName = Faker.instance().name().fullName();
        userName=Faker.instance().name().firstName()+"978";
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.userName,userName,3);


        fatherName = Faker.instance().name().firstName();
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.fatherName,fatherName,3);


        motherName = Faker.instance().name().firstName();
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.motherName,motherName,3);


        password = Faker.instance().internet().password(8,12,true,true,true)+"a1B";
        BrowserUtils.sendKeysWithTimeout(studentManagementPage.password,password,3);

    }
    @Then("verify invalid phone and invalid ssn  message")
    public void verify_invalid_phone_and_invalid_ssn_message() {
        WaitUtils.waitFor(1);

        String actualResult1 = studentManagementPage.invalidPhoneMessage.getText();
        String actualResult2 = studentManagementPage.invalidSsnMessage.getText();

        Assert.assertEquals("Please enter valid phone number",actualResult1);
        WaitUtils.waitFor(1);

        Assert.assertEquals("Please enter valid SSN number",actualResult2);


    }
















}



