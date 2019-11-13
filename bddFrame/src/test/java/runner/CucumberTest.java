package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Bhole_Nath\\Eclipse_WorkSpace\\bddFrame\\src\\test\\resources\\tests\\LoginTest.feature",
		plugin={"pretty:target/cucumber-htmlreport.html", "json:target/cucmber-report.json", "usage", "junit:target/cucumber-reports/Cucumber.xml"},
		monochrome = true,
		glue = "testFiles"
		)
public class CucumberTest {
	
}
