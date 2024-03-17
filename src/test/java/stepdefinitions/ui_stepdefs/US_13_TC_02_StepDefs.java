package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Teachers_Page;

public class US_13_TC_02_StepDefs {

    Teachers_Page teachersPage = new Teachers_Page();
    Faker faker = new Faker();

    @When("enters only {int} digits {string} in ssn field")
    public void enters_only_digits_in_ssn_field(Integer int1, String string) {
        teachersPage.ssn.sendKeys(ssn8DigitGenerator());
//        teachersPage.ssn.sendKeys(string);
    }

    public static String ssn8DigitGenerator(){
        Faker faker = new Faker();
        String ssn = faker.numerify("########");
        String fakerSsn;
        do {
            fakerSsn = ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,8);
        } while (fakerSsn.startsWith("9"));
        return fakerSsn;
    }

    @Then("verify error message {string}")
    public void verify_error_message(String string) {
        Assert.assertEquals(string, teachersPage.ssnErrorMsg.getText());
    }
}
