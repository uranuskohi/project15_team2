package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("Before hooks");
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("After hooks");
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot of failed step");
            Driver.closeDriver();
        }

    }

//    @After ( "@teapot or @iPhone")
//    public void tearDownSpecific(){
//        System.out.println("This after method from Hooks class is conditional and will run only with the given tag");
//    }


}