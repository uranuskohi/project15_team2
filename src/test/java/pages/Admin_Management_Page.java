package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[1]")
    public List<WebElement> nameColumn1;

    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement lastPageButton;

    @FindBy(xpath = "(//span[normalize-space()='Asmith'])[1]")
    public WebElement getUserName;

    @FindBy(xpath = "(//span[normalize-space()='Ashley Smith'])[1]")
    public WebElement getNameToDeleteUser;

    @FindBy(xpath = "(//td)[42]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[text()='Admin deleted Successful']")
    public WebElement adminDeletedSuccessfulMessage;

    @FindBy(xpath = "//div[@id='2']")
    public WebElement adminDeletedSuccessfulMessage1;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement adminDeletedSuccessfulMessage2;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement requiredMessageUnderName;




//    // Get all the elements available with tag name 'p'
//    List<WebElement> elements = element.findElements(By.tagName("td"));
//             for (WebElement e : elements) {
//                    if(e=="Asmith12"){
//
//
//    }
//
//        System.out.println(e.getText());
//    }


//List<WebElement> elements = driver.findElements(By.tagName("li"));
//
//for (WebElement element : elements) {
//        System.out.println("Paragraph text:" + element.getText());
//    }


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
