package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.*;
import pages.Choose_Lesson_Management_Page;
import pages.Student_Info_Management_Page;
import utilities.BrowserUtils;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

public class US_21_StepDefs {

    Choose_Lesson_Management_Page chooseLessonManagementPage = new Choose_Lesson_Management_Page();
    Student_Info_Management_Page studentInfoManagementPage = new Student_Info_Management_Page();


    @When("student goes to Choose Lesson Management")
    public void student_goes_to_choose_lesson_management() {
        chooseLessonManagementPage.ChooseLessonManagementName.isDisplayed();
    }
    @When("student should be able to see the Teacher on the Choose Lesson List")
    public void student_should_be_able_to_see_the_teacher_on_the_choose_lesson_list() {
        chooseLessonManagementPage.teacherNameInChooseLesson.isDisplayed();
    }
    @When("student can see the day on the Choose Lesson List")
    public void student_can_see_the_day_on_the_choose_lesson_list() {
        chooseLessonManagementPage.dayInChooseLesson.isDisplayed();
    }
    @When("student should be able to see the StartTime on the Choose Lesson List")
    public void student_should_be_able_to_see_the_start_time_on_the_choose_lesson_list() {
        chooseLessonManagementPage.startTimeInChooseLesson.isDisplayed();
    }
    @When("student should see the StopTime on the Choose Lesson List")
    public void student_should_see_the_stop_time_on_the_choose_lesson_list() {
        chooseLessonManagementPage.stopTimeInChooseLesson.isDisplayed();
    }
    @When("select the wanted Lessons")
    public void select_the_wanted_lessons() {
        chooseLessonManagementPage.lessonRadioButton.click();
//        chooseLessonManagementPage.submitButtonInChooseLessonManagement.click();
    }
    @And("click on Submit button for add lesson")
    public void clickOnSubmitButtonForAddLesson() {
        WaitUtils.waitFor(1);
        BrowserUtils.clickWithTimeOut(chooseLessonManagementPage.submitButtonInChooseLessonManagement,2);
    }
    @When("student is able to see the chosen Lessons on the Lesson Program List")
    public void student_is_able_to_see_the_chosen_lessons_on_the_lesson_program_list() {
        chooseLessonManagementPage.lessonNameInProgramList.isDisplayed();
    }


    @When("student should be able to delete the chosen lesson from the list")
    public void student_should_be_able_to_delete_the_chosen_lesson_from_the_list() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
        System.out.println("There is no any delete button or option for student.");
//        There is no any delete button in this step
    }
    @When("student is not able to delete the chosen lesson from the list")
    public void student_is_not_able_to_delete_the_chosen_lesson_from_the_list() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
        System.out.println("Lesson is not delete, cause there is no any delete button for student to delete the chosen lesson.");
//         Student can not see any delete option so the student is not able to delete the chosen lesson
    }



    @When("student should click on the menu and should be able to see the Main Menu List")
    public void student_should_click_on_the_menu_and_should_be_able_to_see_the_main_menu_list() {
        chooseLessonManagementPage.menuOptionInChooseLessonManagement.click();
        chooseLessonManagementPage.meinMenu.isDisplayed();
    }
    @When("student should click on Grades and Announcements")
    public void student_should_click_on_grades_and_announcements() {
        chooseLessonManagementPage.gradeAndAnnouncements.click();
    }
    @And("student should be able to see his exam grades if it is added by their teacher in the Student Info List")
    public void studentShouldBeAbleToSeeHerHisExamGradesIfItIsAddedByTheirTeacherInTheStudentInfoList() {
        chooseLessonManagementPage.examGrade.isDisplayed();
    }
    @And("student should be able to see the meeting created by his advisor on the Meet List")
    public void studentShouldBeAbleToSeeTheMeetingCreatedByHerHisAdvisorOnTheMeetList() {
        WaitUtils.waitFor(1);
        chooseLessonManagementPage.givenDateFromTeacherToStudent.isDisplayed();
    }


}
