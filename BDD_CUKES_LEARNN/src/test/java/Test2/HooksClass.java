package Test2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

// All TestNG Tags Won't Run If It Is Not Present In The <classes><class> In testng.xml File
public class HooksClass {
	
	@After
	public void a(Scenario scenario) {
		
		System.out.println("Running After Scenario ::: Cucumber");
	}
	
	@Before
	public void b(Scenario scenario) {
	// 	if(scenario.isFailed()) {
	//		scenario.embed(((TakesScreenshot)driver).captureScreenshotAs(OutputType.BYTES), "image/png");
	//	}
		System.out.println("Running Before Scenario ::: Cucumber");
	}
	
	@AfterMethod
	public void c() {
		System.out.println("Running After Method ::: TestNG");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("Running Before Method ::: TestNG");
	}
	
	@AfterTest
	public void e() {
		System.out.println("Running After Test ::: TestNG");
	}
	
	@BeforeTest
	public void f() {
		System.out.println("Running Before Test ::: TestNG");
	}
	
	@After("@tag1")
	public void g() {
		System.out.println("Running After (@tag1) ::: Cucumber");
	}
	
	@Before("@tag1")
	public void h() {
		System.out.println("Running Before (@tag1) ::: Cucumber");
	}
	
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
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running Before Suite ::: TestNG");
	}
	

}
