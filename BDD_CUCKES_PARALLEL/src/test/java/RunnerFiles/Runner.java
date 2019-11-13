package RunnerFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@CucumberOptions(
	glue= {"stepDefinations"},
	features= {"src/test/java/Features"},
	plugin = {
	        "usage:target/frameworkTwo/cucumber-reports/cucumber-usage.json",
	        "html:target/frameworkTwo/cucumber-reports/cucumber-pretty",
	        "json:target/frameworkTwo/cucumber-reports/cucumber.json",
	        "pretty:target/frameworkTwo/cucumber-reports/cucumber-pretty.txt",
	        "rerun:target/frameworkTwo/cucumber-reports/rerun.txt"},
	monochrome=true
)
public class Runner extends AbstractTestNGCucumberTests{
	
	@AfterSuite
    private void generateReportForJsonFiles() {
        File reportOutputDirectory = new File("target/frameworkTwo/masterthought");
        List<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add("./target/frameworkTwo/cucumber-reports/cucumber.json");
        String projectName = "Krishna Ji";
        String buildNumber = "1";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);

        configuration.setRunWithJenkins(false);
        configuration.setBuildNumber(buildNumber);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();

	}
	
}
