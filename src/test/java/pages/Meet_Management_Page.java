package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Meet_Management_Page {

    public Meet_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   // @FindBy(id = "react-select-2-input")
   // @FindBy(id = "react-select-3-input")
   // @FindBy (xpath = "(//div[@class=' css-19bb58m'])[1]")
    //@FindBy (id="react-select-3-placeholder")
   @FindBy(xpath = "(//input)[1]")
    public WebElement chooseStudents;

    @FindBy(id = "date")
    public  WebElement dateOfMeet;
    //the one after clicking edit and add meet has the same id !!!

    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy (id = "stopTime")
    public WebElement stopTime;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy (xpath = "//button[text()='Submit']")
    public WebElement submitAtMeetManagement;

    @FindBy (xpath = "//*/tr/td[2]/span")
    public WebElement dateVisible;

    @FindBy(xpath = "//i[@class='fa-solid fa-trash']")
    public WebElement deleteButton;

 @FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[1]")
 public List<WebElement> nameColumnAtMeet;

    @FindBy (xpath = "//*/tr/td[3]/span")
    public WebElement startTimeVisible;

    @FindBy (xpath = "//*/tr/td[4]/span")
    public WebElement stopTimeVisible;

    @FindBy (xpath = "(//h3[normalize-space()='Meet Management'])[1]")
    public WebElement meetManagementTitle;

    @FindBy (xpath = "//*/tr/td[5]/span")
    public WebElement descriptionVisible;

    //ADDED FATIH
    @FindBy (xpath = "//*/tr/td[110]/span")
    public WebElement descriptionVisible2;

    @FindBy (xpath = "//*/tr/td[6]/span/button")
    public WebElement editButtonAtMeetManagement;

    @FindBy (xpath = "//*/tr/td[7]/span/button")
    public WebElement deleteButtonAtMeetManagement;

   // @FindBy (xpath = "//*[//*[@id=\"2\"]/div[1]/div[2]")
   // @FindBy (xpath = "//*[//*/div[1]/div[2]") MAYBE TRY THIS IF YOU HAVE an ERROR
    @FindBy (xpath = "(//div[contains(text(),'Meet Saved Successfully')])[2]") //from plug-in
    public WebElement meetSavedSuccessfullyPopUp;

    @FindBy (xpath="//*[@id=\"4\"]/div[1]/div[2]")
    public WebElement meetUpdatedSuccessfullyPopUp;

    @FindBy (xpath = "//*[@id=\"35\"]/div[1]/div[2]")
    public WebElement mustBeFutureDatePopUp;

    @FindBy (xpath = "//*[@id=\"40\"]/div[1]/div[2]")
    public WebElement meetDeletedSuccessfullyPopUp;

    //@FindBy (xpath = "//*[@id=\"51\"]/div[1]/div[2]")
    @FindBy (xpath = "//*[@role='alert']")
    public WebElement mustBeFutureDateFromEdit;






}
