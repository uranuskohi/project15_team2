package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Student_Management_Page {

    public Student_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
