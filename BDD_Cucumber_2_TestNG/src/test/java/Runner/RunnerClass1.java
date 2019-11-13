package Runner;

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
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
//import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;
//
//@ExtendedCucumberOptions(jsonReport = "target/cucumber-reports/CucumberTestReport.json",
//retryCount = 3,
//detailedReport = true,
//detailedAggregatedReport = true,
//overviewReport = true,
////coverageReport = true,
//jsonUsageReport = "target/cucumber-reports/cucumber-usage.json",
//usageReport = true,
//toPDF = true,
//formats = {"pdf", "png"},
//excludeCoverageTags = {"@flaky" },
//includeCoverageTags = {"@passed" },
//outputFolder = "target")



@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefs"},
        tags = {"@Baba"," not @Ignore"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/cucumber.json",
                "pretty:target/cucumber-reports/cucumber-pretty.txt",
                "usage:target/cucumber-reports/cucumber-usage.json",
                "rerun:target/cucumber-reports/rerun.txt"
               , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter"
        },
        monochrome=true
        )
public class RunnerClass1 extends AbstractTestNGCucumberTests{

	private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void runScenario(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
        // the 'featureWrapper' parameter solely exists to display the feature file in a test report
        testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
    }

    @DataProvider(parallel=true)
    public Object[][] scenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }
    
	@AfterSuite
	public void generateReport() { // master cucumber report
		File reportOutputDirectory = new File("target");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("target/cucumber-reports/cucumber.json");
		String projectName = "Krishna Ji";
		String buildNumber = "1";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);

		configuration.setRunWithJenkins(false);
		configuration.setBuildNumber(buildNumber);
		configuration.addClassifications("Platform","Windows");
		configuration.addClassifications("Browser","chrome");
		configuration.addClassifications("Branch","release/1.0");

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		
	}
	
}