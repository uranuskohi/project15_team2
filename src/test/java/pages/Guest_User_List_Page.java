package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guest_User_List_Page {

    public Guest_User_List_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameOnRegister;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surnameOnRegister;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthplaceOnRegister;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneOnRegister;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderOnRegister;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement genderFemaleOnRegister;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement dateOfBirthOnRegister;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnOnRegister;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameOnRegister;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordOnRegister;

    @FindBy(xpath = "//button[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "(//button[normalize-space()='Register'])[1]")
    public WebElement registerButton1;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement registerSuccessMessage1;

    @FindBy(xpath = "(//div[contains(text(),'Guest User registered.')])[1]")
    public WebElement registerSuccessMessage2;


    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestuserLink;

    @FindBy(xpath = "(//a[@role='button'])[16]")
    public WebElement guestUserButton;


    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement Secondpage;


    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement deleteButton;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;


    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement nameSurnameColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement phoneNumberColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement ssnColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement usernameColumn;

    @FindBy(xpath = "//*[text()='Last']")
    public WebElement lastpageButton;

    @FindBy(xpath = "(//*[@class='btn btn-danger'])[1]")
    public WebElement trashBin;
    @FindBy(xpath = "//*[text()=' Guest User deleted Successful']")
    public WebElement successfullyDeleted;


}
