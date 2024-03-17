package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.Contact_Us_Page;
import pages.Main_Page;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US_03_StepDefs {

    public class US03_ContactUsPage_UI_Test {

        Main_Page mainPage = new Main_Page();
        Contact_Us_Page contactUsPage = new Contact_Us_Page();



        @Given("user goes to home page {string}")
        public void userGoesToHomePage(String url) {

            Driver.getDriver().get(url);
        }
        @Given("user clicks Contact button")
        public void user_clicks_contact_button() {
            contactUsPage.contact.click();
            WaitUtils.waitFor(2);

        }

        @Given("user enters a name {string}")
        public void user_enters_a_name(String name) {
            contactUsPage.name.sendKeys("andrey", Keys.TAB);
            WaitUtils.waitFor(2);
        }
        @Given("user enters an email {string}")
        public void user_enters_an_email(String email) {
            contactUsPage.email.sendKeys(email);
            WaitUtils.waitFor(2);
        }
        @Given("user enters a subject {string}")
        public void user_enters_a_subject(String subject) {
            Contact_Us_Page.subject.sendKeys("andrey", Keys.TAB);
            WaitUtils.waitFor(2);
        }
        @Given("user enters a message {string}")
        public void user_enters_a_message(String message) {
            contactUsPage.send_message.sendKeys(message);
            WaitUtils.waitFor(2);

        }
        @Given("user clicks on Send Message button")
        public void user_clicks_on_send_message_button() {
            ReusableMethods.clickWithTimeOut(contactUsPage.send_message,3);
            WaitUtils.waitFor(2);
        }

        @Then("assert alert message on contact page")
        public void assertAlertMessageOnContactPage() {
            WaitUtils.waitFor(1);
            String alertText= contactUsPage.sendAlert.getText();
            assertTrue(alertText.contains("Contact Message Created Successfully"));

        }

        @And("close the app")
        public void closeTheApp() {
            WaitUtils.waitFor(3);
            //  Driver.closeDriver();
        }


        name   | email                   | subject  | message               |
                | andrey | andrey_test01@gmail.com | greeting | first message to dean |
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
}
