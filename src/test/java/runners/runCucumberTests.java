package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/features",
		glue = {"stepDefs","hooks"},
		tags={"@Regression"},  //or operator
		monochrome = true,  //show the formatted output in console
		dryRun = false,
		plugin = {"pretty" ,"html:target/htmlreport","json:target/report.json"}
		)

public class runCucumberTests {

}
