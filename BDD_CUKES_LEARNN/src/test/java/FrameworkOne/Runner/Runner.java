package FrameworkOne.Runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

import com.vimalselvam.cucumber.listener.Reporter;

import FrameworkOne.Utils.SeleniumDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@CucumberOptions(
		features = "src/test/java/FrameworkOne/gherkins/TestOne.feature",
		plugin = {
        "pretty",
        "usage:target/frameworkOne/cucumber-reports/cucumber-usage.json",
        "html:target/frameworkOne/cucumber-reports/cucumber-pretty",
        "json:target/frameworkOne/cucumber-reports/cucumber.json",
        "pretty:target/frameworkOne/cucumber-reports/cucumber-pretty.txt",
        "rerun:target/frameworkOne/cucumber-reports/rerun.txt",
        "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/frameworkOne/extent-report/report.html"},
		glue= "FrameworkOne/Implementation",
		monochrome=true
	)
public class Runner extends AbstractTestNGCucumberTests{
	
	@AfterSuite
	public void generateReport() {
		File reportOutputDirectory = new File("target");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("target/frameworkOne/cucumber-reports/cucumber.json");
		String projectName = "Krishna Ji";
		String buildNumber = "1";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);

		configuration.setRunWithJenkins(false);
		configuration.setBuildNumber(buildNumber);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		teardown();
	}
	
    public static void teardown() {
//      Reporter.loadXMLConfig(new File("E:\\Bhole_Nath\\Eclipse_WorkSpace\\BDD_CUKES_LEARNN\\extent-config.xml"));
        Reporter.setSystemInfo("user name", System.getProperty("user.name"));
        Reporter.setSystemInfo("java vm version", System.getProperty("java.vm.version"));
        Reporter.setSystemInfo("user country format", System.getProperty("user.country.format"));
        Reporter.setSystemInfo("user country", System.getProperty("user.country"));
        Reporter.setSystemInfo("java runtime version", System.getProperty("java.runtime.version"));
        Reporter.setSystemInfo("os arch", System.getProperty("os.arch"));
        Reporter.setSystemInfo("os version", System.getProperty("os.version"));
        Reporter.setSystemInfo("user home", System.getProperty("user.home"));
        Reporter.setSystemInfo("user language", System.getProperty("user.language"));
        Reporter.setSystemInfo("java specification vendor", System.getProperty("java.specification.vendor"));
        Reporter.setTestRunnerOutput("Sample testAgain runner output message");
	}
    
    @After
    public void doAnything(Scenario scenario) {
    	if(scenario.isFailed()) {
    		
    		byte[] b = ((TakesScreenshot)SeleniumDriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    		scenario.embed(b, scenario.getName().toLowerCase(Locale.US));
    	}
    }

}
