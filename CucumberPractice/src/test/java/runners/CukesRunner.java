package runners;
// feature file

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


// To run with Junit
// Make sure you import @CucumberOptions from Junit
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "step_definitions"
)
public class CukesRunner {
}
















// To run with TestNG
// extends AbstractTestNGCucumberTests
// Make sure you import @CucumberOptions from import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(
//        plugin = "html:target/cucumber-report.html",
//        features = "src/test/java/features",
//        glue = "stepDefinitions")
//public class CukesRunner extends AbstractTestNGCucumberTests {
//
//
//}
