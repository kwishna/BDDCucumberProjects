package test;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * !mportant.
 * src/test/java Has Package Name (tests) Which Contains The CucumberTest Class. 
 * Similarly, src/test/java Must Has A Source Folder Where Same Name Package(tests) Will Contain Feature File.
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Bhole_Nath\\Eclipse_WorkSpace\\BDD_CUCUMBER_LEARN\\features\\TestAgain.feature",
		plugin={"pretty","html:target/cucumber-htmlreport.html", "json:target/cucmber-report.json"},
		glue="Runnnn",
		monochrome=true)
public class Runner {
	
	
}


