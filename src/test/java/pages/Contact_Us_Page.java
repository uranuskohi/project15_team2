package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Contact_Us_Page {
    public Contact_Us_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//a[.='Contact']")
    public WebElement contact;

    @FindBy(xpath = "//input[@id='name']")
    public static WebElement name;

    @FindBy(xpath = "//input[@id='email']")
    public static WebElement email;

    @FindBy(xpath ="//input[@id='subject']")
    public static WebElement subject;

    @FindBy(xpath ="//textarea[@id='message']")
    public static WebElement message;

    @FindBy(xpath ="//button[@class='fw-semibold btn btn-primary']")
    public WebElement send_message;


    public static void click() {
    }

    public void name(String s) {
    }
}


