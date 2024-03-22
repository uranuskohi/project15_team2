package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Choose_Lesson_Management_Page {

    public Choose_Lesson_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



//    -------------------------------------------------------------------------------------
//    Education Term Filed
    @FindBy(id = "controlled-tab-example-tab-educationTerm")
    public WebElement educationTerm;

    @FindBy(id = "term")
    public WebElement chooseEducationTermDropdown;

    @FindBy(id = "startDate")
    public WebElement startDate;

    @FindBy(id = "endDate")
    public WebElement endDate;

    @FindBy(id = "lastRegistrationDate")
    public WebElement lastRegistrationDate;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[1]")
    public WebElement submitButtonForEducationTerm;

// ---------------------------------------------------------
//    Choose Lesson Management Page


    @FindBy(xpath = "//*[text()='Choose Lesson Management']")
    public WebElement ChooseLessonManagementName;


    @FindBy(xpath = "(//tr//th[text()='Lesson'])[1]")
    public WebElement lessonNameInChooseLesson;


    @FindBy(xpath = "(//tr//th[text()='Teacher'])[1]")
    public WebElement teacherNameInChooseLesson;

    @FindBy(xpath = "(//tr//th[text()='Day'])[1]")
    public WebElement dayInChooseLesson;


    @FindBy(xpath = "(//tr//th[text()='Start Time'])[1]")
    public WebElement startTimeInChooseLesson;

    @FindBy(xpath = "(//tr//th[text()='Stop Time'])[1]")
    public WebElement stopTimeInChooseLesson;

    @FindBy(id = "lessonProgramId")
    public WebElement lessonRadioButton;


    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButtonInChooseLessonManagement;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuOptionInChooseLessonManagement;

    @FindBy(id = "offcanvasNavbarLabel-expand-lg")
    public WebElement meinMenu;


    @FindBy(xpath = "//*[text()='Grades and Announcements']")
    public WebElement gradeAndAnnouncements;

    @FindBy(xpath = "//*[text()='congratulations']")
    public WebElement givenDateFromTeacherToStudent;

    @FindBy(xpath = "(//*[text()='100'])[2]")
    public WebElement examGrade;



//    ---------------------------------------------------------------------------------
//    Lesson Program List Filed
    @FindBy(xpath = "(//tr//th[text()='Lesson'])[2]")
    public WebElement lessonNameInProgramList;

    @FindBy(xpath = "(//tr//th[text()='Day'])[2]")
    public WebElement dayNameInProgramList;

    @FindBy(xpath = "(//tr//th[text()='Start Time'])[2]")
    public WebElement startTimeInProgramList;

    @FindBy(xpath = "(//tr//th[text()='Stop Time'])[2]")
    public WebElement stopTimeInProgramList;




}
