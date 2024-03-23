package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //creates reports on the console as well
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome = true, //makes the console reports more readable
        features = "./src/test/resources/features",  // provides the path of the features folder
        glue = {"stepdefinitions", "hooks"},  // provides the path of the stepdefinitions folder
        dryRun = false, // generates the missing step definitions, without running the existing step definitions
        tags = "@smoke"
)

public class SmokeRunner {
}