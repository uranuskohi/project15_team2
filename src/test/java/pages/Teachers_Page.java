package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Teachers_Page {

    public Teachers_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "react-select-3-live-region")
    public WebElement selectLesson;

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

    @FindBy(linkText = "Submit")
    public WebElement submit;







}
