package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//renkli yazdirmak icin
                "html:target/cucumber-reports.html",
                "json:target/json-report/cucumber.json",
                "junit:target/resources/features"
        },
        features = "src/test/resources/features",
        glue = {"stepDefination","src/test/java/hook"},
        tags="@ConfigReader or @Practice02",
        dryRun = false

)
public class TestRunner {

}