package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Features",
        tags="@functionalTesting",
        glue= {"StepDefinitions"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-reports/report.html"},
        monochrome = true
)
public class TestRunners {

}
