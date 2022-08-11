package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/features",
        glue = "securitizeTest", //
        tags = {"@SECURITIZE"}, //
        plugin = {"json:target/cucumber-report/cucumber.json"}, //
        monochrome = true, //
        snippets = SnippetType.CAMELCASE //
)

public class TestRunner {
}
