package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Teachers_Page {

    public Teachers_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "react-select-3-input")
    public WebElement selectLessonViceDean;

    @FindBy(id = "react-select-2-input")
    public WebElement selectLessonAdmin;

    @FindBy(id = "react-select-4-input")
    public WebElement editSelectLessonVD;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement editNameVD;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(xpath = "(//input[@id='surname'])[2]")
    public WebElement editSurnameVD;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(xpath = "(//input[@id='birthPlace'])[2]")
    public WebElement editBirthPlaceVD;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "(//input[@id='email'])[2]")
    public WebElement editEmailVD;

    @FindBy(id = "phoneNumber")
    public WebElement phone;

    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement editPhoneVD;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacher;

    @FindBy(xpath = "(//input[@id='isAdvisorTeacher'])[2]")
    public WebElement editIsAdvisorTeacherVD;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female;

    @FindBy(xpath = "(//input[@name='gender'])[3]")
    public WebElement editFemaleVD;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male;

    @FindBy(xpath = "(//input[@name='gender'])[4]")
    public WebElement editMaleVD;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;

    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement editDateOfBirthVD;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement editSsnVD;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement editUserNameVD;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement editPasswordVD;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submit;

    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement editSubmitVD;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement successMsg;

    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssnErrorMsg;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement emailErrorMsg;

    @FindBy(xpath = "//div[@class='table-responsive']//tbody//tr//td[4]")
    public List<WebElement> usernameColumn;

    @FindBy(xpath = "//i[@class='fa-solid fa-pencil']")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()='Last']")
    public WebElement lastPageButton;






}
