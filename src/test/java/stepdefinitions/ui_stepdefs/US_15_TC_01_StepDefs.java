package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.When;
import pages.Main_Page;

public class US_15_TC_01_StepDefs {

    Main_Page mainPage = new Main_Page();


    @When("user clicks on Student Management on Main Menu")
    public void user_clicks_on_student_management_on_main_menu() {
        mainPage.studentManagement.click();
    }

    @When("enters name in the user")
    public void enters_name_in_the_user() {

    }

}
