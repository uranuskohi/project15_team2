package pages;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Contact_Message_Page {

    public Contact_Message_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //Column Names
    @FindBy(xpath = "//table//tr//th[text()='Name']")
    public WebElement nameColumn;

    @FindBy(xpath = "//table//tr//th[text()='Email']")
    public WebElement emailColumn;

    @FindBy(xpath = "//table//tr//th[text()='Date']")
    public WebElement dateColumn;

    @FindBy(xpath = "//table//tr//th[text()='Subject']")
    public WebElement subjectColumn;

    @FindBy(xpath = "//table//tr//th[text()='Message']")
    public WebElement messageColumn;


    //Added By Esra
    @FindBy(xpath = "//tr//td//span[text()='arife']")
    public  WebElement nameData;

    @FindBy(xpath = "//tr//td//span[text()='maxidarvin@falkcia.com']")
    public WebElement emailData;

    @FindBy(xpath = "//tr//td//span[text()='2024-03-13']")
    public WebElement dateData;

    @FindBy(xpath = "//tr//td//span[text()='Matematik']")
    public WebElement subjectData;

    @FindBy(xpath = "//tr//td//span[text()='Lorem ipsum dolor sit amet, consectetur adipiscing elit.']")
    public WebElement messageData;
















}
