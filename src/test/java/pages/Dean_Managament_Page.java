package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dean_Managament_Page {

    public Dean_Managament_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "name")
    public WebElement firstName;

    @FindBy(id = "surname")
    public WebElement lastName;

    @FindBy (id = "birthPlace")
    public WebElement birthPlace;

    @FindBy (xpath = "//input[@value='FEMALE']" )
    public WebElement genderFemale;

    @FindBy (xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy (xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirth;

    @FindBy (id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy (id = "ssn")
    public WebElement ssn;

    @FindBy (id = "username")
    public WebElement userName;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy (xpath = "(//span[normalize-space()='»'])[1]")
    public WebElement lastPageButton;



}
