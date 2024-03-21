package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_Management_Page {

    public Admin_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBoxOnAdminPage;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surnameBoxOnAdminPage;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlaceOnAdminPage;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemaleOnAdminPage;
//----------------------------------------------
//    Uranus: male gender button

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMaleOnAdminPage;
//-------------------------------------------------------

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement dateOfBirthOnAdminPage;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumberOnAdminPage;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnOnAdminPage;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthDayOnAdminPage;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[.='Submit'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement adminSavedAlert;



    @FindBy(xpath = "//*[.='Menu']")
    public WebElement menuButton;

    @FindBy(partialLinkText = "Admin Management")
    public WebElement adminManagementOnMenu;

    @FindBy(partialLinkText = "Dean Management")
    public WebElement deanManagement;

    @FindBy(partialLinkText = "Vice Dean Management")
    public WebElement viceDeanManagement;

    @FindBy(partialLinkText = "Lesson Management")
    public WebElement lessonManagement;

    @FindBy(partialLinkText = "Teacher Management")
    public WebElement teacherManagement;

    @FindBy(partialLinkText = "Student Management")
    public WebElement studentManagement;

    @FindBy(partialLinkText = "Student Info Management")
    public WebElement studentInfoManagement;

    @FindBy(partialLinkText = "Meet Management")
    public WebElement meetManagement;

    @FindBy(partialLinkText = "Choose Lesson")
    public WebElement chooseLessonOnMenu;

    @FindBy(partialLinkText = "Contact Get All")
    public WebElement contactGetAll;

    @FindBy(partialLinkText = "Guest User")
    public WebElement guestUser;

    @FindBy(partialLinkText = "Logout")
    public WebElement logoutOnMenu;




}
