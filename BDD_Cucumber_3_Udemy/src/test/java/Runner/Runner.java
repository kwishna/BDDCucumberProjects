package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = {"stepDefs"},
		tags = {"@Baba"},
		plugin = {
        "pretty",
        "usage:target/cucumber-reports/cucumber-usage.json",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/cucumber.json",
        "pretty:target/cucumber-reports/cucumber-pretty.txt",
        "usage:target/cucumber-reports/cucumber-usage.json",
        "rerun:target/cucumber-reports/rerun.txt",
 //       "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
  //     "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"
				},
		monochrome=true
		)

public class Runner extends AbstractTestNGCucumberTests{
}
