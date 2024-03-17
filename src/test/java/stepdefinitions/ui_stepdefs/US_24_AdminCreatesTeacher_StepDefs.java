package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.Teachers_Page;
import utilities.ActionsUtils;
import utilities.WaitUtils;


public class US_24_AdminCreatesTeacher_StepDefs {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();

    @When("enters {string} in select lesson field as admin")
    public void enters_in_select_lesson_field_as_admin(String string) {
        WaitUtils.waitFor(1);
        ActionsUtils.actionsDoubleClick(teachersPage.selectLessonAdmin);
        WaitUtils.waitFor(1);
        teachersPage.selectLessonAdmin.sendKeys("Java", Keys.TAB);
        WaitUtils.waitFor(1);
    }
}