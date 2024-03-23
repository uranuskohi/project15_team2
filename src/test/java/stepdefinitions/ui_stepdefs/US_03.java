package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Contact_Us_Page;
import pages.Main_Page;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;
import static org.junit.Assert.assertTrue;


public class US_03 {




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
        contactUsPage.name.sendKeys(name);
        WaitUtils.waitFor(3);

    }

    @Given("user enters an email {string}")
    public void user_enters_an_email(String email) {
       contactUsPage.email.sendKeys(email);
       WaitUtils.waitFor(3);
    }
    @Given("user enters a subject {string}")
    public void user_enters_a_subject(String subject) {
        contactUsPage.subject.sendKeys(subject);
    }


        @Given("user enters a message {string}")
        public void user_enters_a_message(String message) {

            BrowserUtils.sendKeysWithTimeout(contactUsPage.message,message,10);
            WaitUtils.waitFor(2);

        }
        @Given("user clicks on Send Message button")
        public void user_clicks_on_send_message_button() {
            BrowserUtils.clickWithTimeOut(contactUsPage.send_message,3);
            WaitUtils.waitFor(2);
        }



        @Then("assert alert message on contact page")
        public void assertAlertMessageOnContactPage() {
            WaitUtils.waitFor(1);
            String alertText= contactUsPage.send_message.getText();
            assertTrue(contactUsPage.sentSuccessfullyMessage.getText().contains("Contact Message Created Successfully"));

        }

        @And("close the app")
        public void closeTheApp() {
            WaitUtils.waitFor(3);
              Driver.closeDriver();
        }




/* Given user goes to home page "https://managementonschools.com"
    Given user clicks Contact button
    And user enters a name "<name>"
    And user enters an email "<email>"
    And user enters a subject "<subject>"
    And user enters a message "<message>"
    And user clicks on Send Message button
    Then assert alert message on contact page
    And  close the app


*/
}

