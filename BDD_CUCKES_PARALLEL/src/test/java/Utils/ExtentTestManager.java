package Utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.io.Files;

import Base.BaseTest;

public class ExtentTestManager {
	
	static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
	static ExtentReports extentReports = ExtentReportManager.getInstance();
	
	public static synchronized ExtentTest getTest() {
		
		return testReport.get();
	}
	
	public static void logInfo(String log) {
		
		testReport.get().log(Status.INFO, log);
	}
	
	public static void logPass(String pass) {
		
		testReport.get().log(Status.PASS, pass);
	}
	
	public static void logFail(String fail) {
		
		testReport.get().log(Status.FAIL, fail);
	}
	
	public static synchronized boolean addScreenshotOnFail() {
		
		File screenshot = ((TakesScreenshot)BaseTest.getDriver()).getScreenshotAs(OutputType.FILE);
		File sink = new File(System.getProperty("user.dir")+"/Resources/screenshot/"+String.join("_", LocalDateTime.now().toString().split("[^A-Za-z0-9]"))+".PNG");		
		
		try {
			
			Files.copy(screenshot, sink);
			testReport.get().fail("<b>"+"<font color="+"red>"+"Screenshot On Failure"+"</font>"+"</b>", MediaEntityBuilder.createScreenCaptureFromPath(sink.getAbsolutePath()).build());
		}
		catch (IOException e) {
			
		}
		
		Markup m = MarkupHelper.createLabel("Scenario Fail", ExtentColor.RED);
		testReport.get().log(Status.FAIL, m);
		return true;
	}
	
	
	public static synchronized boolean addScreenshot() {
		
		File screenshot = ((TakesScreenshot)BaseTest.getDriver()).getScreenshotAs(OutputType.FILE);
		File sink = new File(System.getProperty("user.dir")+"/Resources/screenshot/"+String.join("_", LocalDateTime.now().toString().split("[^A-Za-z0-9]"))+".PNG");		
		
		try {
			
			Files.copy(screenshot, sink);
			testReport.get().fail("<b>"+"<font color="+"red>"+"Screenshot On Failure"+"</font>"+"</b>", MediaEntityBuilder.createScreenCaptureFromPath(sink.getAbsolutePath()).build());
		}
		catch (IOException e) {
			
		}

		return true;
	}
	
	public static synchronized ExtentTest startTest(String testName) {
		
		ExtentTest test = extentReports.createTest(testName);
		testReport.set(test);
		return test;
	}
	}
