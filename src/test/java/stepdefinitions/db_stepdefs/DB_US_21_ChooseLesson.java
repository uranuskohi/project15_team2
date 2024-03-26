package stepdefinitions.db_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class DB_US_21_ChooseLesson {

    @When("student gets the {string} column from the table {string}")
    public void student_gets_the_column_from_the_table(String columnName, String tableName) {
        DBUtils.executeQuery("SELECT " + columnName + " FROM " + tableName);
    }

    @And("read all column {string} data from {string}")
    public void readAllColumnDataFrom(String columnName, String tableName) throws SQLException {
        List<String> columnData = DBUtils.getColumnNames("SELECT "+columnName+" FROM "+tableName);
        System.out.println("columnData = " + columnData);
        String data = columnData.toString();
        System.out.println("Result = " + DBUtils.getResultset().next());

        DBUtils.getResultset().absolute(15);
        Object obj1 = DBUtils.getResultset().getObject(columnName);
        System.out.println("obj1 = " + obj1);

    }


    @Then("verify table {string} and column {string} contains {string}")
    public void verify_table_and_column_contains(String tableName, String columnName, String data) {
        List<Object> allData = DBUtils.getColumnData("SELECT "+columnName + " FROM "+ tableName,columnName);
        String result = allData.toString();
        System.out.println("result = " + result);
        Assert.assertTrue(result.contains(data));

    }



}
