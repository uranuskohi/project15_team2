package pages;
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
    @FindBy(xpath = "//tbody/tr[3]/td[1]")
    public  WebElement nameData;

    @FindBy(xpath = "//tbody/tr[3]/td[2]/span[1]")
    public WebElement emailData;

    @FindBy(xpath = "//tbody/tr[3]/td[3]/span[1]")
    public WebElement dateData;

    @FindBy(xpath = "//tbody/tr[3]/td[4]/span[1]")
    public WebElement subjectData;

    @FindBy(xpath = "//tbody/tr[3]/td[5]/span[1]")
    public WebElement messageData;
















}
