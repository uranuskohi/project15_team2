package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import pages.Main_Page;
import utilities.*;

import static utilities.WaitUtils.waitFor;

public class CommonStepDefs {

    Main_Page mainPage = new Main_Page();

    //Go to url and login
    @Given("user goes to {string} homepage")
    public void user_goes_to_homepage(String url) {
        Driver.getDriver().get(url);
    }

    @Given("clicks on loginIcon")
    public void clicks_on_login_icon() {
        mainPage.loginIconAtHeader.click();
    }

    @Given("enters {string} in the userName input field")
    public void enters_in_the_user_name_input_field(String userName) {
        mainPage.userName.sendKeys(userName);
    }

    @Given("enters {string} in the password input field")
    public void enters_in_the_password_input_field(String password) {
        mainPage.password.sendKeys(password);
    }

    @Given("clicks on Login button")
    public void clicks_on_login_button() { mainPage.loginButton.click(); }

    @Given("clicks on Menu button")
    public void clicks_on_menu_button() { mainPage.menuButton.click(); }


    @Given("clicks on {string} on Main Menu")
    public void clicks_on_on_main_menu(String mainMenuOption) {
        waitFor(2);
        switch (mainMenuOption) {
            case "Admin Management":
                mainPage.adminManagement.click();
                break;
            case "Dean Management":
                mainPage.deanManagement.click();
                break;
            case "Vice Dean Management":
                mainPage.viceDeanManagement.click();
                break;
            case "Lesson Management":
                mainPage.lessonManagement.click();
                break;
            case "Teacher Management":
                mainPage.teacherManagement.click();
                break;
            case "Student Management":
                mainPage.studentManagement.click();
                break;
            case "Student Info Management":
                mainPage.studentInfoManagement.click();
                break;
            case "Meet Management":
                mainPage.meetManagement.click();
                break;
            case "Choose Lesson":
                mainPage.chooseLesson.click();
                break;
            case "Contact Get All":
                mainPage.contactGetAll.click();
                break;
            case "Guest User":
                mainPage.guestUser.click();
                break;
            case "Logout":
                mainPage.logout.click();
                break;
        }
    }


        //Close application
        @When("close the application")
        public void close_the_application () {
            Driver.closeDriver();
        }

    }

