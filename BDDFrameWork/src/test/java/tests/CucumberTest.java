package tests;
/*
 * !mportant.
 * src/test/java Has Package Name (tests) Which Contains The CucumberTest Class. 
 * Similarly, src/test/java Must Has A Source Folder Where Same Name Package(tests) Will Contain Feature File.
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Bhole_Nath\\Eclipse_WorkSpace\\BDDFrameWork\\features\\LoginTest.feature",
		plugin={"pretty:target/cucumber-htmlreport.html", "json:target/cucmber-report.json"})
public class CucumberTest {
	
}
