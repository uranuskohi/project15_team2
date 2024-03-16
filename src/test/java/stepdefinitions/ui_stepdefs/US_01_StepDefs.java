package stepdefinitions.ui_stepdefs;

import org.openqa.selenium.support.PageFactory;
import pages.Registration_Page;
import utilities.Driver;


public class US_01_StepDefs {


    Registration_Page registrationPagePage = new Registration_Page();

    public void Registration_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }





        }


/*
 When user clicks on "RegisterLink"
    And user enters "<Name>" as a name
    And user enters "<Surname>" as surname
    And user enters "<Birth Place>"  as a birth place
    And user enters "<Phone>"  as a phone number
    Then user scrolls into User Name box
    And user clicks on Male Radio button and selects Male as a gender
    #Then user scrolls down to Date of Birth box
    And user enters "<month>", "<day>", "<year>"  as a birth date
    And user enters an invalid "<Ssn>" as an Ssn
    And user enters a "<User Name>" as an user name
    And user enters a "<Password>" as a password
    And user clicks on Register button
 */