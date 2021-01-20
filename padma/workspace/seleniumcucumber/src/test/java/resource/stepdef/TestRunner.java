package resource.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resource/features"},
        glue = {"resource.stepdef"},
        tags  = "@multpletest" ,
        plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
