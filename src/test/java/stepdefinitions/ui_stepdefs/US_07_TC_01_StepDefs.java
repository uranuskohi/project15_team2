package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.Main_Page;
import pages.Teachers_Page;
import pages.Vice_Dean_Management_Page;
import utilities.Driver;
import utilities.WaitUtils;

public class US_07_TC_01_StepDefs {

    Main_Page mainPage = new Main_Page();
    Vice_Dean_Management_Page viceDeanManagementPage = new Vice_Dean_Management_Page();

    Faker faker = new Faker();

    @Given("user goes to {string} homepage")
    public void user_goes_to_homepage(String url) {
        Driver.getDriver().get(url);
    }

    @And("user clicks on login")
    public void user_clicks_on_login(String string){
        mainPage.loginIconAtHeader.click();
        WaitUtils.waitFor(1);
    }

    @When("user enters username")
    public void user_enters_username(String string){
        mainPage.userName.sendKeys("Oz14", Keys.TAB);
        WaitUtils.waitFor(1);
    }

    @When("user enters username")
    public void user_enters_password(String string){
        mainPage.password.sendKeys("Simdiokul3", Keys.TAB);
        WaitUtils.waitFor(2);
    }

    @And("user clicks on login button")
    public void user_clicks_on_loginbutton(String string){
        mainPage.loginButton.click();
        WaitUtils.waitFor(2);
    }

    @And("user clicks on name field")
    public void user_clicks_on_name_field(String string){
        viceDeanManagementPage.vdmName.click();
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in name field")
    public void enters_in_name_field(String string) {
        viceDeanManagementPage.vdmName.sendKeys(faker.name().firstName());
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in surname field")
    public void enters_in_surname_field(String string) {
        viceDeanManagementPage.vdmSurname.sendKeys(faker.name().lastName());
        WaitUtils.waitFor(1);
    }

    @When("enters {string} in birth place field")
    public void enters_in_birth_place_field(String string) {
        viceDeanManagementPage.vdmBirthPlace.sendKeys(faker.lorem().word());
        WaitUtils.waitFor(1);
    }

   @And("user clicks on gender radio button")
   public void clicks_on_gender_radio_button(){
       if (viceDeanManagementPage.femGender.isSelected()){
           viceDeanManagementPage.femGender.click();
       }else if (viceDeanManagementPage.maleGender.isSelected()){
           viceDeanManagementPage.maleGender.click();

       }


   }

  /*  public static void selectGenderRadioButton(){
        Vice_Dean_Management_Page viceDeanManagementPage = new Vice_Dean_Management_Page();

        if (viceDeanManagementPage.femGender.isSelected()){
            viceDeanManagementPage.femGender.click();
        }else if (viceDeanManagementPage.maleGender.isSelected()){
            viceDeanManagementPage.maleGender.click();

        }

    }
   */







    @When("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
}
