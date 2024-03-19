package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Lesson_Program_Page {

    public Lesson_Program_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menu;
    @FindBy(xpath = "(//*[text()='Lesson Management'])[2]")
    public WebElement lessonManagement;

    //for delete
    @FindBy (xpath = "//table[@class='table table-striped table-bordered table-hover']//td[contains(span, 'C#')]")
    private WebElement lessonColumn;

    //for Add Lesson Program
    @FindBy(xpath=  "//*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement clickonLessonProgram;

    @FindBy (css = ".css-19bb58m input")
    public WebElement chooseLessonDropdown;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTerm;

    @FindBy(id = "day")
    public WebElement chooseDay;

    @FindBy(id= "startTime")
    public WebElement starTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Submit'])[3]")
    public WebElement submitButtonAddLessonProgram;

    @FindBy(css = "#startTime")
    public WebElement lessonProgramListStartTime;

    @FindBy(css = "#stopTime")
    public WebElement lessonProgramListStopTime;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement requiredMessageUnderStartTime;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement requiredMessageUnderStopTime;

    @FindBy(css = "div[role='alert'] div:nth-child(2)")
    public WebElement addlessonVerificationPopUp;



//for Lesson Program List

    @FindBy(xpath = "(//h5[normalize-space()='Lesson Program List'])[1]")
    public WebElement lessonProgramList;

    @FindBy(xpath = "(//th[contains(text(),'Lesson')])[2]")
    public WebElement lpllesson;

    @FindBy(xpath = "(//th[text()='Day'])[1]")
    public WebElement lplDay;

    @FindBy(xpath = "(//th[text()='Start Time'])[1]")
    public WebElement lplStartTime;

     @FindBy(xpath = "(//th[text()='Stop Time'])[1]")
    public WebElement lplStopTime;


//     Lesson Program Assignment

    @FindBy( xpath = "(//input[@id='lessonProgramId'])[1]")
    public WebElement chooseLessonCheckBox; //Java	MONDAY	08:50:00	09:30:00

    @FindBy(xpath = "//*[text()='Gigi']")
    public WebElement chooseTeacher;

    @FindBy(xpath = "(//button[text()=\"Submit\"])[4]")
    public WebElement submitButtonLessonProgramAssignment;

//    @FindBy(xpath = "//div[contains(@class, 'Toastify')]")
//    public WebElement blankTeacherField;


    public WebElement getLessonColumn() {
        return lessonColumn;
    }

    public void setLessonColumn(WebElement lessonColumn) {
        this.lessonColumn = lessonColumn;
    }

    public WebElement[] lessonColumn() {
        return new WebElement[0];
    }
}
