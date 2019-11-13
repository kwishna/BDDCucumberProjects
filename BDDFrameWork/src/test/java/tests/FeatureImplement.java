//package tests;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//
//import assertions.Compare;
//import base.DriverInitializer;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pages.LoginPage;
//
//public class FeatureImplement {
//	
//	WebDriver driver;
//	LoginPage login;
//	
//	
//	@Given("User In On Login Page")
//	public void user_In_On_Login_Page() throws FileNotFoundException, IOException {
//	    // Write code here that turns the phrase above into concrete actions
//		DriverInitializer d = new DriverInitializer();
//		driver = d.instantiateDriver();
//		login = new LoginPage(driver);
//	   
//	}
//
//	@When("User Enters Username")
//	public void user_Enters_Username() throws FileNotFoundException, IOException {
//	    // Write code here that turns the phrase above into concrete actions
//	    login.enterUsername("ExcelReaderOrPropertyReader");
//	}
//
//	@When("User Enters Password")
//	public void user_Enters_Password() throws FileNotFoundException, IOException {
//	    // Write code here that turns the phrase above into concrete actions
//	    login.enterPassword("HanuMan");
//	}
//
//	@When("Clicks On Login Button")
//	public void clicks_On_Login_Button() throws FileNotFoundException, IOException {
//	    // Write code here that turns the phrase above into concrete actions
//	    login.clickSubmit();
//	}
//
//	@Then("User Logged Succesfully")
//	public void user_Logged_Succesfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    Assert.assertTrue(Compare.validateTitle(driver, "Welcome To Facebook"));
//	}
//
//	@Then("Home Page Opens")
//	public void home_Page_Opens() {
//	    // Write code here that turns the phrase above into concrete actions
//	    login.gotoHomePage();
//	}
//
//	@When("User Enters Incorrect Username")
//	public void user_Enters_Incorrect_Username() throws FileNotFoundException, IOException {
//	    // Write code here that turns the phrase above into concrete actions
//	    login.enterUsername("#@$$");
//	}
//
//	@Then("User Failed To Login")
//	public void user_Failed_To_Login() {
//	    // Write code here that turns the phrase above into concrete actions
//	    Assert.assertTrue(Compare.validateTitle(driver, "Facebook - Login"));
//	}
//
//	@Then("Home Page Doesn't Open")
//	public void home_Page_Doesn_t_Open() {
//	    // Write code here that turns the phrase above into concrete actions
//	    Assert.assertFalse(Compare.validateTitle(driver, "Welcome To Facebook"));
//	}
//
//
//}
