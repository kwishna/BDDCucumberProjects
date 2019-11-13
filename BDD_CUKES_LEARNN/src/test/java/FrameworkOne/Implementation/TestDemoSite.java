package FrameworkOne.Implementation;

import static FrameworkOne.Utils.SeleniumDriverManager.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import FrameworkOne.Utils.ResourceReader;
import FrameworkOne.pageActions.HomePageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestDemoSite {
	
	private WebDriver driver;
	private HomePageAction homepageActions = new HomePageAction(getDriver());
	public Logger logger = LogManager.getLogger("krishna");
	@Given("^I Open The Browser$")
	public void i_Open_The_Browser() throws Throwable {
	    
		driver = getDriver();
		
	}

	@Given("^Open Login Page$")
	public void open_Login_Page() throws Throwable {
	    
		driver.get(ResourceReader.readValue("url"));
	}

	@When("^I Am On Login Page$")
	public void i_Am_On_Login_Page() throws Throwable {
	    
		Assert.assertTrue(homepageActions.isHomePageDisplayed());
	}

	@When("^Hover Over \"([^\"]*)\"$")
	public void hover_Over(String arg1) throws Throwable {
	    
		homepageActions.moveToTesterHub();
	}

	@When("^Select \"([^\"]*)\" From The Menu$")
	public void select_From_The_Menu(String arg1) throws Throwable {
	    
		homepageActions.moveToDemoTestSite();
	}

	@When("^Click On \"([^\"]*)\"$")
	public void click_On(String arg1) throws Throwable {
		
		homepageActions.clickOnSelectElements();
	}

	@Then("^Select Elements Page Should Open$")
	public void select_Elements_Page_Should_Open() throws Throwable {
		
		Assert.assertTrue(homepageActions.isSelectElementPageDisplayed());
	}

}
