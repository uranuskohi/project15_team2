package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Lesson_Program_Page {

    public Lesson_Program_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //for Add Lesson Program
    @FindBy(id= "controlled-tab-example-tab-lessonProgram")
    public WebElement clickonLessonProgram;

    @FindBy (id= "react-select-3-input")
    public WebElement chooseLesson;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTerm;

    @FindBy(id = "day")
    public WebElement chooseDay;

    @FindBy(id= "startTime")
    public WebElement starTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(xpath = "/(//button[text()=\"Submit\"])[3]")
    public WebElement submitButtonAddLessonProgram;



//for Lesson Program List

    @FindBy(xpath = "(//th[text()='Lesson'])[1]")
    public WebElement lessonProgramListLesson;

    @FindBy(xpath = "(//th[text()='Day'])[1]")
    public WebElement lessonProgramListDay;

    @FindBy(xpath = "(//th[text()='Start Time'])[1]")
    public WebElement lessonProgramListStartTime;

    @FindBy(xpath = "(//th[text()='Stop Time'])[1]")
    public WebElement lessonProgramListStopTime;

//     Lesson Program Assignment

    @FindBy( id = "lessonProgramId")
    public WebElement chooseLessonCheckBox; //Java	MONDAY	08:50:00	09:30:00

    @FindBy(id = "teacherId")
    public WebElement chooseTeacher;

    @FindBy(xpath = "(//button[text()=\"Submit\"])[4]")
    public WebElement submitButtonLessonProgramAssignment;









}
