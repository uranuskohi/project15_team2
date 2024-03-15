package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guest_User_List_Page {

    public Guest_User_List_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Precondition Admin goes to the webpage and login

    @FindBy(partialLinkText = "Guest User")
    public WebElement guestUser;

    @FindBy(xpath = "(//a[@role='button'])[16]")
    public WebElement guestUserButton;

    @FindBy(xpath = "//div[@class='table-responsive']//table/thead/tr/th[1]")
    public WebElement nameOnGuestUserList;

    @FindBy(xpath = "//div[@class='table-responsive']//table/thead/tr/th[2]")
    public WebElement phoneNumOnGuestUserList;

    @FindBy(xpath = "//div[@class='table-responsive']//table/thead/tr/th[3]")
    public WebElement ssnOnGuestUserList;

    @FindBy(xpath = "//div[@class='table-responsive']//table/thead/tr/th[4]")
    public WebElement userNameOnGuestUserList;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='btn btn-danger']") //for all the delete buttons,to go 1 by 1 add index
    public WebElement deleteButton2;





}
