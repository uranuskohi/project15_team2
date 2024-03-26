package stepdefinitions.db_stepdefs;

import com.mongodb.DB;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class DB_US_23_CreateViceDean {

    @When("admin gets the {string} column from the table {string}")
    public void admin_gets_the_column_from_the_table(String columnName, String tableName) {
        DBUtils.executeQuery("SELECT "+columnName+ " FROM "+tableName);

    }

    @And("read column {string} data from {string}")
    public void readColumnDataFrom(String columnName, String tableName) throws SQLException {
        List<String> data = DBUtils.getColumnNames("SELECT "+columnName+" FROM "+tableName);
        System.out.println("data = " + data);
        String columnData = data.toString();

        if(columnData != null){
            System.out.println("Automation passed successfully");
        }else {
            System.out.println("There is no data to automate! Sorry.");
        }

        System.out.println("Column has data = " + DBUtils.getResultset().next());
    }

    @Then("verify {string} and column {string} contains {string}")
    public void verify_and_column_contains(String tableName, String columnName, String data) {
        List<Object> columnResult = DBUtils.getColumnData("SELECT "+ columnName +" FROM "+tableName,columnName);
        String result = columnResult.toString();
        Assert.assertTrue(result.contains(data));



    }


}
