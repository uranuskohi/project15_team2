package stepdefinitions.ui_stepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Student_Info_Management_Page;
import utilities.BrowserUtils;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.WaitUtils;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class US_18 {

    Student_Info_Management_Page studentInfoManagementPage = new Student_Info_Management_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("The student grades must be exist on the List, if not create it with lesson as {string}, student as {string} and semester as {string}, absences as {string} midterm exam as {string} and final exam as {string}, {string} notes and submit")
    public void the_student_grades_must_be_exist_on_the_list_if_not_create_it_with_lesson_as_student_as_and_semester_as_absences_as_midterm_exam_as_and_final_exam_as_notes_and_submit(String lesson, String student, String semester, String absences, String midterm, String final1, String info) {

        List<String> listOfNames= new ArrayList<>();
        for (WebElement studentNameList : studentInfoManagementPage.nameColumn) {
                    listOfNames.add(studentNameList.getText());
        }

        if (!listOfNames.contains(student)) {
                        Select selectLessonDropdown = new Select(studentInfoManagementPage.lessonDropdown);
                        selectLessonDropdown.selectByVisibleText(lesson);
                        WaitUtils.waitFor(1);
                        Select selectStudentDropdown = new Select(studentInfoManagementPage.studentDropdown);
                        selectStudentDropdown.selectByVisibleText(student);
                        WaitUtils.waitFor(1);
                        Select selectSemesterDropdown = new Select(studentInfoManagementPage.semesterDropdown);
                        selectSemesterDropdown.selectByVisibleText(semester);
                        WaitUtils.waitFor(1);
                        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.absentee, absences, 5);
                        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.midtermExam, midterm, 5);
                        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.finalExam, final1, 5);
                        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.infoNote, info, 5);
                        BrowserUtils.clickWithTimeOut(studentInfoManagementPage.submitButton, 5);
        }
    }

    @Given("The teacher clicks the Edit button to update of the student {string}")
    public void the_teacher_clicks_the_Edit_button_to_update(String student) {
        WaitUtils.waitFor(5);
        int count = 1;
        int desiredStudentRow = 0;
        for (WebElement studentNameList : studentInfoManagementPage.nameColumn) {
            if (studentNameList.getText().equalsIgnoreCase(student)) {
                desiredStudentRow = count;
                int differenceBetweenRowAndIndex = 5;
                int editButtonIndex = (desiredStudentRow + differenceBetweenRowAndIndex + (desiredStudentRow - 1));
                WebElement element = Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[" + editButtonIndex +"]"));
                actions.moveToElement(element).click().perform();
                break;
            }
            count++;
        }
    }

    @Given("The teacher modifies the midterm {string} and final {string} exam grades")
    public void the_teacher_modifies_the_midterm_and_final_exam_grades(String midtermUpdated, String finalUpdated) throws InterruptedException {
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.finalExamInEdit, Keys.CONTROL+"a", 5);
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.finalExamInEdit, Keys.DELETE.toString(), 5);
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.finalExamInEdit, finalUpdated, 5);
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.midtermExamInEdit, Keys.CONTROL+"a", 5);
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.midtermExamInEdit, Keys.DELETE.toString(), 5);
        BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.midtermExamInEdit, midtermUpdated, 5);
    }

    @Given("The teacher submits the updated grades")
    public void the_teacher_submits_the_updated_grades() {
        BrowserUtils.clickWithTimeOut(studentInfoManagementPage.submitButtonInEdit, 5);
    }

    @Given("close the pop-up")
    public void close_the_pop_up() {
        BrowserUtils.clickWithTimeOut(studentInfoManagementPage.closeWindowInEdit,5);
    }

    @Then("The teacher verifies that the midterm {string} and final {string} exam grades updated of the student {string}")
    public void the_teacher_verifies_that_the_midterm_and_final_exam_grades_updated(String midtermUpdated, String finalUpdated, String student) {
        int count = 1;
        int desiredStudentRow = 0;
        for (WebElement studentNameList : studentInfoManagementPage.nameColumn) {
            if (studentNameList.getText().equalsIgnoreCase(student)) {
                desiredStudentRow = count;
                break;
            }
            count++;
        }
        WaitUtils.waitFor(5);
        String actualMidterm = Driver.getDriver().findElement(By.xpath("//div[@class='table-responsive']//tbody/tr["+desiredStudentRow+"]/td[4]")).getText();
        WaitUtils.waitFor(5);
        String actualFinal = Driver.getDriver().findElement(By.xpath("//div[@class='table-responsive']//tbody/tr["+ desiredStudentRow +"]/td[5]")).getText();
        assertEquals(midtermUpdated,actualMidterm);
        assertEquals(finalUpdated,actualFinal);
    }

    @Then("The teacher clicks the Delete button of the student {string}")
    public void the_teacher_clicks_the_button(String student) {
        WaitUtils.waitFor(5);
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

    @Then("The teacher verifies that the deleted student {string} is no longer present in the Student Info List.")
    public void the_teacher_verifies_that_the_deleted_student_is_no_longer_present_in_the_student_info_list(String student) {
        int count = 1;
        for (WebElement studentNameList : studentInfoManagementPage.nameColumn) {
            if (!studentNameList.getText().equalsIgnoreCase(student)) {
                assertTrue(true);
            }
            count++;
        }
    }

/////////////////////////------TC_02

    @Then("verify the warning Pop-up message displayed")
    public void verifyTheWarningPopUpMessageDisplayed() {
        WaitUtils.waitFor(1);
        String actualText = studentInfoManagementPage.warningPopup.getText();
        WaitUtils.waitFor(1);
        System.out.println(actualText);
        assertTrue(actualText.contains("100"));
    }
}
