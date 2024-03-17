package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Student_Info_Management_Page;
import utilities.ActionsUtils;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

public class US_17 {
    Student_Info_Management_Page studentInfoManagementPage = new Student_Info_Management_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Delete if the student name {string} exist on the Student Info List")
    public void delete_if_the_student_name_exist_on_the_student_info_list(String student) {

        int count = 1;
        int desiredStudentRow = 0;
        for (WebElement studentNameList : studentInfoManagementPage.nameColumn) {
            if (studentNameList.getText().equalsIgnoreCase(student)) {
                desiredStudentRow = count;
                WebElement element = Driver.getDriver().findElement(By.xpath("(//i[@class='fa-solid fa-trash'])[" + desiredStudentRow + "]"));
                actions.moveToElement(element).click().perform();
                break;
            }
            count++;
        }
    }

    @Given("The teacher selects a lesson as {string}, student as {string} and semester as {string} from the respective dropdown menus")
    public void the_teacher_selects_a_lesson_as_student_as_and_semester_as_from_the_respective_dropdown_menus(String lesson, String student, String semester) {
        Select selectLessonDropdown = new Select(studentInfoManagementPage.lessonDropdown);
        selectLessonDropdown.selectByVisibleText(lesson);
        WaitUtils.waitFor(1);
        Select selectStudentDropdown = new Select(studentInfoManagementPage.studentDropdown);
        selectStudentDropdown.selectByVisibleText(student);
        WaitUtils.waitFor(1);
        Select selectSemesterDropdown = new Select(studentInfoManagementPage.semesterDropdown);
        selectSemesterDropdown.selectByVisibleText(semester);
        WaitUtils.waitFor(1);
    }

    @Given("The teacher enters the number of absences as {string} for the student")
    public void the_teacher_enters_the_number_of_absences_as_for_the_student(String absences) {
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.absentee, absences, 5);
    }

    @Given("The teacher enters valid grades for the midterm exam as {string} and final exam as {string} fields")
    public void the_teacher_enters_valid_grades_for_the_midterm_exam_as_and_final_exam_as_fields(String midterm, String final1) {
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.midtermExam, midterm, 5);
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.finalExam, final1, 5);
    }

    @Given("The teacher enters {string} notes about the student")
    public void the_teacher_enters_notes_about_the_student(String info) {
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.infoNote, info, 5);
    }

    @Given("The teacher submits the student information")
    public void the_teacher_submits_the_student_information() {
        BrowserUtils.clickWithTimeOut(studentInfoManagementPage.submitButton, 5);
    }

    @Then("Verify the new student information {string} is displayed in the student info list")
    public void verify_the_new_student_information_is_displayed_in_the_student_info_list(String student){
        WaitUtils.waitFor(9);
        boolean nameFound = false;
        for (WebElement studentNameList : studentInfoManagementPage.nameColumn) {
            String name = studentNameList.getText();
            if (name.equals(student)) {
                nameFound = true;
                break;
            }
        }
        assertTrue(nameFound);
    }

/////////////////-------- TC_02

    @Given("The teacher intentionally leaves the midterm {string} and final {string} exam grades fields blank")
    public void the_teacher_intentionally_leaves_the_midterm_and_final_exam_grades_fields_blank(String midterm, String final1) {
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.midtermExam, midterm, 5);
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.finalExam, final1, 5);
    }

    @Then("Verify Message appears indicating that midterm and final exam grades are required fields")
    public void verify_message_appears_indicating_that_midterm_and_final_exam_grades_are_required_fields() {
            assertTrue(studentInfoManagementPage.requiredMessageUnderMidtermExam.isDisplayed());
            assertTrue(studentInfoManagementPage.requiredMessageUnderFinalExam.isDisplayed());
    }
}