package stepdefinitions.ui_stepdefs;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Student_Info_Management_Page;
import utilities.BrowserUtils;
import utilities.Driver;

public class US_17 {

        Student_Info_Management_Page studentInfoManagementPage = new Student_Info_Management_Page();





        int y = 0;

        @When("x")
        public void x() throws InterruptedException {
            Driver.getDriver().get("https://managementonschools.com/studentInfo");
            BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.username, "TeacherGigi", 1);
            BrowserUtils.sendKeysWithTimeout(studentInfoManagementPage.password, "TeacherGigi1", 1);
            BrowserUtils.clickWithTimeOut(studentInfoManagementPage.login, 3);


            // simp.submitButton.click();


            //Click Edit on desired row
            int rowSize = studentInfoManagementPage.rows.size();
            int columnSize = studentInfoManagementPage.column.size();

            for (int i = 1; i <= rowSize; i++) {
                String nameOnTable = Driver.getDriver().findElement(
                        By.xpath("//div[@class='table-responsive']//tbody/tr[" + i + "]/td[1]")).getText();
                if (nameOnTable.equalsIgnoreCase("harry potter")) {
                    y = i;
                    break;
                }
            }
            int z = 5;
            int g = (y + z + (y - 1));
            WebElement element = Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[" + g + "]"));
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(element).click().perform();


            //check popup message
            //Assertion - midterm exam updated
            String midtermExamOnTable = Driver.getDriver().findElement(
                    By.xpath("//div[@class='table-responsive']//tbody/tr[" + y + "]/td[4]")).getText();
            Assert.assertFalse(midtermExamOnTable.contains("100"));


        }


    }


