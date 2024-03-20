package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Main_Page {

    public Main_Page(){PageFactory.initElements(Driver.getDriver(),this);
    }


    //Register and Log in Icon at Headers
    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement registerIconAtHeader;

    @FindBy(xpath = "//a[@class='header_link ms-2']") //---Does not work
    public WebElement loginIconAtHeader;

    @FindBy(xpath ="//a[@href='/login']")
    public WebElement loginButtonMainPage;

//    @FindBy(xpath = "//i[@class='fa fa-lock']") ---Does not work
//    public WebElement getLoginIconAtHeader;

//    @FindBy(partialLinkText = "login")---Does not work
//    public WebElement loginIconAtHeader;

    //Log in Part
    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;


    //Menu Button After Login Admin Account
    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;


    //Main Menu for Admin Account
    @FindBy(xpath = "//a[text()='Admin Management']")
    public WebElement adminManagement;

    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanManagement;

    @FindBy(xpath = "//a[text()='Vice Dean Management']")
    public WebElement viceDeanManagement;

    @FindBy(xpath = "//a[text()='Lesson Management']")
    public WebElement lessonManagement;

    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagement;

    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentManagement;

    @FindBy(xpath = "//a[text()='Student Info Management']")
    public WebElement studentInfoManagement;

    @FindBy(xpath = "//a[text()='Meet Management']")
    public WebElement meetManagement;

    @FindBy(xpath = "//a[text()='Choose Lesson']")
    public WebElement chooseLesson;

    @FindBy(xpath = "//a[text()='Contact Get All']")
    public WebElement contactGetAll;

    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestUser;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logout;



    //After click logout
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yesButton;

    @FindBy(xpath = "//button[text()='No']")
    public WebElement noButton;





}
