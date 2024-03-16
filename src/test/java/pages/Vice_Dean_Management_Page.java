package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Vice_Dean_Management_Page {

    public Vice_Dean_Management_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginIconAtHeader;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//button[normalize-space()='Menu'])[1]")
    public WebElement menuButton;


    @FindBy(xpath = "(//a[normalize-space()='Vice Dean Management'])[1]")
    public WebElement viceDeanManagement;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement vdmName;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement vdmSurname;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement vdmBirthPlace;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femGender;

    @FindBy(xpath = "(//label[normalize-space()='Male'])[1]")
    public WebElement maleGender;

    @FindBy(xpath = "//input[@id='birthDay'")
    public WebElement vdmBirthDay;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement vdmPhone;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement vdmSsn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement vdmUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement vdmPassword;

    @FindBy(xpath = "//button[normalize-space()='Submit'])[1]")
    public WebElement submitButton;

}