package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//        Don't use it now
//        plugin = {
//                "pretty",
//                "html:target/cucumber-reports.html",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-reports/cucumber.xml",
//                "rerun:target/failedRerun.txt"
//        },
        monochrome = true,


        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        dryRun = false,
        tags = "@US14_TC01"
)

public class Runner {
}