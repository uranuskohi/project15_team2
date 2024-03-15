package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Choose_Lesson_Management_Page {

    public Choose_Lesson_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



//    -------------------------------------------------------------------------------------
//    Education Term Filed
    @FindBy(id = "controlled-tab-example-tab-educationTerm")
    public WebElement educationTerm;

    @FindBy(id = "term")
    public WebElement chooseEducationTermDropdown;

    @FindBy(id = "startDate")
    public WebElement startDate;

    @FindBy(id = "endDate")
    public WebElement endDate;

    @FindBy(id = "lastRegistrationDate")
    public WebElement lastRegistrationDate;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[1]")
    public WebElement submitButtonForEducationTerm;



}
