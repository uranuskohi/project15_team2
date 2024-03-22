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

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGender;

    @FindBy(xpath = "//div[normalize-space()='Required'])[1]")
    public WebElement getVdmNameRequiredMsg;



//    ----------------------------
//    uranus brithday
    @FindBy(id = "birthDay")
    public WebElement vdmBirthDay;
//    ---------------------------------------------------------


    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement vdmPhone;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement vdmSsn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement vdmUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement vdmPassword;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton;


//    ------------------------
//    uranus verifyMessage
    @FindBy(xpath = "//div[text()='Vice dean Saved']")
    public WebElement verifyViceDeanCreatedMessage;

    @FindBy(xpath = "//div[text()='Enter your password']")
    public WebElement passwordRequiredMessage;
//    -----------------------------------------------------------

}