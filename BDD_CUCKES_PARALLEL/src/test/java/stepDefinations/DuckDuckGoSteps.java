package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.BaseTest;
import Utils.ExtentReportManager;
import Utils.ExtentTestManager;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DuckDuckGoSteps extends BaseTest{
	
	protected Scenario scenario;
	
	@After
	public void after(Scenario scenarios) {

		if(scenarios.isFailed()) {
			
			ExtentTestManager.addScreenshotOnFail();
		}
		
		else {
			ExtentTestManager.getTest().log(Status.INFO, MarkupHelper.createLabel("Scenario Pass", ExtentColor.GREEN));
		}
		
		ExtentReportManager.getInstance().flush();
		stopDriver();	
	}
	
	@Before
	public void before(Scenario scenarios) {
		
		this.scenario = scenarios;
		ExtentTestManager.startTest(scenarios.getName());
		ExtentTestManager.getTest().log(Status.INFO, "Scenario Started : "+scenarios.getName());	
	}
	
	
	@Given("^I Launch '(\\w+)' browser$")
	public void i_Launch_chrome_browser(String browser) throws Throwable {
	    
		startBrowser(browser);
	}

	@When("^I Navigate To '(.*)'$")
	public void i_Navigate_To_https_duckduckgo_com(String url) throws Throwable {
	    
		navigateTo(url);		
	}

	@When("^I Enter '(.*)' In The Search Box$")
	public void i_Enter_Latest_News_In_The_Search_Box(String searchText) throws Throwable {

		getDriver().findElement(By.name("q")).clear();
		getDriver().findElement(By.name("q")).sendKeys(searchText);;
	}

	@When("^I Click On Seach Button$")
	public void i_Click_On_Seach_Button() throws Throwable {

		getDriver().findElement(By.id("search_button_homepage")).click();
	}

	@Then("^I Search Results Appears$")
	public void i_Search_Results_Appears() throws Throwable {

		int count = getDriver().findElements(By.xpath("//div[contains(@id,'r1')]")).size();
		Assert.assertTrue(count>0);
	}

	@Then("^I Scroll Down The Page$")
	public void i_Scroll_Down_The_Page() throws Throwable {
	    
		long n = (long)((JavascriptExecutor)getDriver()).executeScript("return window.document.body.scrollHeight");
		((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(0,"+n+")");
		
		System.out.println("::: "+n+" :::");
		
	}

}
