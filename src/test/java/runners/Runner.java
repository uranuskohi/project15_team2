package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

<<<<<<< HEAD
        //Don't use it now
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
=======
//        Don't use it now
//        plugin = {
//                "pretty",
//                "html:target/cucumber-reports.html",
////                "json:target/json-reports/cucumber.json",
////                "junit:target/xml-reports/cucumber.xml",
////                "rerun:target/failedRerun.txt"
//        },
>>>>>>> 56acbfc8bfc8f4aba9c3a3309b9029d2ea735392
        monochrome = true,


        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        dryRun = false,
<<<<<<< HEAD
        tags = "@hehe"

=======
        tags = ""
>>>>>>> 56acbfc8bfc8f4aba9c3a3309b9029d2ea735392
)

public class Runner {
}