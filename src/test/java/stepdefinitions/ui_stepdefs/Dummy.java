package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Student_Info_Management_Page;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

public class Dummy {

    Student_Info_Management_Page simp = new Student_Info_Management_Page();
    int y = 0;

    @When("x")
    public void x() throws InterruptedException {
        Driver.getDriver().get("https://managementonschools.com/studentInfo");
        BrowserUtils.sendKeysWithTimeout(simp.username,"TeacherGigi",1);
        BrowserUtils.sendKeysWithTimeout(simp.password,"TeacherGigi1",1);
        BrowserUtils.clickWithTimeOut(simp.login,3);


        // simp.submitButton.click();



        //Click Edit on desired row
        int rowSize = simp.rows.size();
        int columnSize = simp.column.size();

        for(int i=1; i<=rowSize; i++) {
            String nameOnTable = Driver.getDriver().findElement(
                    By.xpath("//div[@class='table-responsive']//tbody/tr[" + i + "]/td[1]")).getText();
            if (nameOnTable.equalsIgnoreCase("harry potter")) {
                y = i;
                break;
            }
        }
        int z = 5;
        int g = (y+z+(y-1));
        WebElement element = Driver.getDriver().findElement(By.xpath("(//button[@type='button'])["+g+"]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).click().perform();



        //check popup message
        //Assertion - midterm exam updated
        String midtermExamOnTable = Driver.getDriver().findElement(
                By.xpath("//div[@class='table-responsive']//tbody/tr["+y+"]/td[4]")).getText();
        Assert.assertFalse(midtermExamOnTable.contains("100"));






    }


}
