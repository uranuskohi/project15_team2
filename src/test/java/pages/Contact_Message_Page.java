package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Contact_Message_Page {

    public Contact_Message_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
