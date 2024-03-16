package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static org.openqa.selenium.By.xpath;

public class Student_Management_Page {

    public Student_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy (id = "advisorTeacherId")
    public WebElement chooseTeacher;

    @FindBy (id = "name")
    public WebElement firstName;

    @FindBy (id = "surname")
    public WebElement lastName;

    @FindBy (id = "birthPlace")
    public WebElement birthPlace;

    @FindBy (id = "email")
    public WebElement email;

    @FindBy (id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy (xpath = "//input[@value='FEMALE']" )
    public WebElement genderFemale;

    @FindBy (xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy (xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirth;

    @FindBy (id = "ssn")
    public WebElement ssn;

    @FindBy (id = "username")
    public WebElement userName;

    @FindBy (id = "fatherName")
    public WebElement fatherName;

    @FindBy (id = "motherName")
    public WebElement motherName;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[6]/div/button")
    public WebElement submitButton;

    @FindBy ("")
    public WebElement ;

    @FindBy ("")
    public WebElement ;

    @FindBy ("")
    public WebElement ;

    @FindBy ("")
    public WebElement ;








}
