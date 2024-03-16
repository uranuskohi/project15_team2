package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Contact_Us_Page;
import pages.Main_Page;
import utilities.Driver;
import utilities.WaitUtils;

public class US_03_StepDefs {

    Main_Page mainPage = new Main_Page();

    //Go to url and contact
    @Given("user goes to {string} homepage")
    public void user_goes_to_homepage(String url) {
        Driver.getDriver().get(url);
    }

    @Given("clicks on contact button")
    public void clicks_on_contact_icon() {
        mainPage.contactGetAll.click();
    }







/* When click on contact
    And enters "Evrim1" in name field
    And enters "admin_batch197@gmail.com" in email field
    And enters "maths" in subject field
    And enters "Joining a new maths class" in message field
    And clicks submit button
    Then verify success message "Contact Message Created Successfully"
    And close the application
*/
}