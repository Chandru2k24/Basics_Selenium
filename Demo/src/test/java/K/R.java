package K;


import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}, features = "src/test/resources/com/feature/login.feature",
glue = {"Step"}, monochrome = true, dryRun = false)
public class R  extends AbstractTestNGCucumberTests{

}