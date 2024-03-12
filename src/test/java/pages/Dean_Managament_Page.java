package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dean_Managament_Page {

    public Dean_Managament_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
