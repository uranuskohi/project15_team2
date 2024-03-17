package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Student_Info_Management_Page {

    public Student_Info_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="lessonId")
    public WebElement lessonDropdown;

    @FindBy (id="studentId")
    public WebElement studentDropdown;

    @FindBy (id="educationTermId")
    public WebElement semesterDropdown;

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


    //Student Info List Table

    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[1]")
    public List<WebElement> nameColumn;

    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[4]")
    public List<WebElement> midtermColumn;

    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[5]")
    public List<WebElement> finalColumn;

    @FindBy (xpath = "//div[@class='table-responsive']//tbody/tr")
    public List<WebElement> rows;

    @FindBy (xpath = "//div[@class='table-responsive']//tbody/tr[1]/td")
    public List<WebElement> column;

    @FindBy (xpath = "(//button[@type='button'])[8]")
    public WebElement editButton;

/// update window

    @FindBy (xpath = "(//input[@class='form-control'])[6]")
    public WebElement midtermExamInEdit;

    @FindBy (xpath = "(//input[@class='form-control'])[7]")
    public WebElement finalExamInEdit;

    @FindBy (xpath = "(//button[@type='button'][normalize-space()='Submit'])[2]")
    public WebElement submitButtonInEdit;

    @FindBy (xpath = "(//button[contains(@aria-label,'Close')])[3]")
    public WebElement closeWindowInEdit;

    @FindBy (xpath = "//input[@id='finalExam']/following-sibling::div[text()='Required']")
    public WebElement requiredMessageUnderFinalExam;

    @FindBy (xpath = "//input[@id='midtermExam']/following-sibling::div[text()='Required']")
    public WebElement requiredMessageUnderMidtermExam;

    @FindBy (xpath = "//div[@class='Toastify']")
    public WebElement warningPopup;




}
