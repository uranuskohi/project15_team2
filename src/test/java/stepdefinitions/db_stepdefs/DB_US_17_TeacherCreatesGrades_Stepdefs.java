package stepdefinitions.db_stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import utilities.DBUtils;
import java.util.List;

public class DB_US_17_TeacherCreatesGrades_Stepdefs {

    @Given("user connects to application database")
    public void user_connects_to_application_database() {
        DBUtils.createConnection();
    }

    @When("user gets the {string} column from the table {string} for student info grades")
    public void userGetsTheColumnFromTheTableForStudentInfoGrades(String columnName, String table) {
        DBUtils.executeQuery("SELECT " + columnName + " FROM " + table);
    }

    @Then("verify {string} table and {string} column contains {string}")
    public void verifyTableAndColumnContains(String tableName, String columnName, String data) {
    List<Object> allColumnData =  DBUtils.getColumnData("SELECT " +columnName+" FROM "+tableName,columnName);
        String allColumnDataString= allColumnData.toString();

        if (allColumnDataString.contains(data)) {
            System.out.println("Database automation testing passed.");
        }
        assertTrue(allColumnDataString.contains(data));
    }

    @Then("user terminate connection")
    public void user_terminate_connection() {
        DBUtils.closeConnection();
    }
}

