package runner;

import org.testng.annotations.AfterClass;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/features",
		plugin = {
        "pretty",
        "usage:target/cucumber-reports/cucumber-usage.json",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/cucumber.json",
        "pretty:target/cucumber-reports/cucumber-pretty.txt",
        "usage:target/cucumber-reports/cucumber-usage.json",
        "rerun:target/cucumber-reports/rerun.txt" 
        ,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/extent-report/report.html"},
		glue= "Test2",
		monochrome=true
	)

public class Runner extends AbstractTestNGCucumberTests{

	@AfterClass
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
	
}


