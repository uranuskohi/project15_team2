package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_Management_Page {

    public Admin_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "name")
    public WebElement firstName;

    @FindBy (id = "surname")
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

    @FindBy (xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[6]/div/button")
    public WebElement submitButton;

    @FindBy (xpath = "(//*[@class='btn btn-danger'])[]") // this does not work
    public WebElement deleteButton;

    //*[@id="root"]/div/main/div/div[1]/div[2]/div/div/div[1]/table/tbody/tr[1]/td[6]/span/button

}
