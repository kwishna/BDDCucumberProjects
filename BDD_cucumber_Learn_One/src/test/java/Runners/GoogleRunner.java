package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/GoogleSearch.feature",
		glue = "Impl",
		plugin = { "pretty", "html:target/cucumber-htmlreport.html", "json:target/cucmber-report.json","junit:target/cucumber-reports/Cucumber.xml"	
		},
		tags= {"@Learn"},
		monochrome=true
		)
public class GoogleRunner {

}
