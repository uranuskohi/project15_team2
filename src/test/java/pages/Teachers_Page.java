package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Teachers_Page {

    public Teachers_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "react-select-3-input")
    public WebElement selectLessonViceDean;

    @FindBy(id = "react-select-2-input")
    public WebElement selectLessonAdmin;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phoneNumber")
    public WebElement phone;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacher;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement successMsg;

    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssnErrorMsg;

    @FindBy(xpath = "//div[@class='table-responsive']//tr/td[4]")
    public WebElement teacherUsername;

    @FindBy(xpath = "//i[@class='fa-solid fa-pencil']")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement nextPageButton;
}
