package stepDefs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class AiseHi {
	
	@AfterSuite
	public void generateReport() {
		File reportOutputDirectory = new File("target");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("target/cucumber-reports/cucumber.json");
		String projectName = "Krishna Ji";
		String buildNumber = "1";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);

		configuration.setRunWithJenkins(false);
		configuration.setBuildNumber(buildNumber);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		
	}
	
//	@AfterClass
//    public static void teardown() {
//      Reporter.loadXMLConfig(new File("E:\\Bhole_Nath\\Eclipse_WorkSpace\\BDD_Cucumber_3_Udemy\\target\\extent-config.xml"));
//        Reporter.setSystemInfo("user name", System.getProperty("user.name"));
//        Reporter.setSystemInfo("java vm version", System.getProperty("java.vm.version"));
//        Reporter.setSystemInfo("user country format", System.getProperty("user.country.format"));
//        Reporter.setSystemInfo("user country", System.getProperty("user.country"));
//        Reporter.setSystemInfo("java runtime version", System.getProperty("java.runtime.version"));
//        Reporter.setSystemInfo("os arch", System.getProperty("os.arch"));
//        Reporter.setSystemInfo("os version", System.getProperty("os.version"));
//        Reporter.setSystemInfo("user home", System.getProperty("user.home"));
//        Reporter.setSystemInfo("user language", System.getProperty("user.language"));
//        Reporter.setSystemInfo("java specification vendor", System.getProperty("java.specification.vendor"));
//        Reporter.setTestRunnerOutput("Sample testAgain runner output message");
//	}
}