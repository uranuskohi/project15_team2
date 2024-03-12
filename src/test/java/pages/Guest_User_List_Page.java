package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guest_User_List_Page {

    public Guest_User_List_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
