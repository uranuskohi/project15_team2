package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Student_Info_Management_Page {

    public Student_Info_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    //delete later
    @FindBy (id = "username")
    public WebElement username;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "(//button[@type='button'])[3]")
    public WebElement login;

    /////////////////

    @FindBy (id="lessonId")
    public WebElement Lesson;

    @FindBy (id="studentId")
    public WebElement Student;

    @FindBy (id="educationTermId")
    public WebElement Term;

    @FindBy (id="absentee")
    public WebElement absentee;

    @FindBy (id="midtermExam")
    public WebElement midtermExam;

    @FindBy (id="finalExam")
    public WebElement finalExam;

    @FindBy (id="infoNote")
    public WebElement infoNote;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@class='table-responsive']//tbody/tr")
    public List<WebElement> rows;

    @FindBy (xpath = "//div[@class='table-responsive']//tbody/tr[1]/td")
    public List<WebElement> column;

    @FindBy (xpath = "(//button[@type='button'])[8]")
    public WebElement editButton;

/// update window

    @FindBy (xpath = "(//input[@id='midtermExam'])[2])")
    public WebElement midtermExamInEdit;

    @FindBy (xpath = "(//input[@id='finalExam'])[2]")
    public WebElement finalExamInEdit;

    @FindBy (xpath = "(//button[@type='button'][normalize-space()='Submit'])[2]")
    public WebElement submitButtonInEdit;

    @FindBy (xpath = "(//button[contains(@aria-label,'Close')])[3]")
    public WebElement closeWindowInEdit;




    //  //tag[contains(text[],'text value')]
   // @FindBy(xpath = "//*[contains(@id,'')]/div[1]/div[2]")
  //  public WebElement dynamicElement;


}
