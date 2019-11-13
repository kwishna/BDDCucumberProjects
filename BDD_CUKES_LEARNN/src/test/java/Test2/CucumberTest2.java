package Test2;


import java.time.LocalDate;

import org.testng.Reporter;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTest2 {
	
	@Given("^I wantz \\{to\\} write a \"([^\"]*)\" with precondition ok$")
	public void i_wantz_to_write_a_with_precondition(String arg1) throws Throwable {
		
		System.out.println("Running Double Quotes Given");
		Reporter.log(arg1);
	}

	@When("^I \"([^\"]*)\" action ok$")
	public void i_action(String arg1) throws Throwable {
		
		System.out.println("Running Double Quotes When");
		Reporter.log(arg1);
	}

	@Then("^I \"([^\"]*)\" the \\(outcomes\\) ok$")
	public void i_the_outcomes(String arg1) throws Throwable {
		
	    System.out.println("Running Double Quotes Then");
	    Reporter.log(arg1);
	}
	
	@But("^Today's Date Is \"([^\"]*)\" ok$")
	public void today_s_Date_Is_ok(LocalDate arg1) throws Throwable  {
		
	    System.out.println("Running Date Quotes But");
	    Reporter.log(""+arg1);
	}


}
